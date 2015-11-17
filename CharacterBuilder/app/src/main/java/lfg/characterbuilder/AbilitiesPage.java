package lfg.characterbuilder;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AbilitiesPage extends Fragment {

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> abilityTypes;
    HashMap<String, List<Ability>> listAbilities;

    public class Ability {
        Ability() {
        };

        public String name;
        public String description;
        public String type;

    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        createlist();
        expListView = (ExpandableListView) getView().findViewById(R.id.expandableListView);
        listAdapter = new ExpandableListAdapter(this.getActivity(), abilityTypes, listAbilities);
        expListView.setAdapter(listAdapter);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.activity_abilities_page, container, false);
    }

    //creates expandable list adapter to contain different abilities
    private class ExpandableListAdapter extends BaseExpandableListAdapter {
        private FragmentActivity _context;
        private List<String> _listDataHeader;
        private HashMap<String, List<Ability>> _listDataChild;

        public ExpandableListAdapter(FragmentActivity context, List<String> listDataHeader, HashMap<String, List<Ability>> _listChildData) {
            this._context = context;
            this._listDataHeader = listDataHeader;
            this._listDataChild = _listDataChild;

        }


        @Override
        public int getGroupCount() {
            return this._listDataHeader.size();
        }

        @Override
        public int getChildrenCount(int groupPosition) {
            return this._listDataChild.get(this._listDataHeader.get(groupPosition)).size();
        }

        @Override
        public Object getGroup(int groupPosition) {
            return this._listDataHeader.get(groupPosition);
        }

        @Override
        public Object getChild(int groupPosition, int childPosition) {
            return this._listDataChild.get(this._listDataHeader.get(groupPosition)).get(childPosition);
        }

        @Override
        public long getGroupId(int groupPosition) {
            return groupPosition;
        }

        @Override
        public long getChildId(int groupPosition, int childPosition) {
            return childPosition;
        }

        @Override
        public boolean hasStableIds() {
            return false;
        }

        @Override
        public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
            String headerTitle = (String) getGroup(groupPosition);
            if(convertView == null) {
                LayoutInflater inflater = (LayoutInflater) this._context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                convertView = inflater.inflate(R.layout.activity_abilities_page, null);
            }
            TextView abilityType = (TextView) convertView.findViewById(R.id.abilityType);
            abilityType.setTypeface(null, Typeface.BOLD);
            abilityType.setText(headerTitle);

            return convertView;
        }

        @Override
        public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {

            final Ability childAbility = (Ability) getChild(groupPosition, childPosition);
            String childName = childAbility.name;
            String childDesc = childAbility.description;

            if(convertView == null) {
                LayoutInflater inflater = (LayoutInflater) this._context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                convertView = inflater.inflate(R.layout.abilityelement, null);
            }

            TextView abilityName = (TextView) convertView.findViewById(R.id.abilityName);
            TextView abilityDesc = (TextView) convertView.findViewById(R.id.abilityDesc);

            abilityName.setText(childName);
            abilityDesc.setText(childDesc);

            return convertView;
        }

        @Override
        public boolean isChildSelectable(int groupPosition, int childPosition) {
            return false;
        }
    }

    public void createlist() {
        abilityTypes = new ArrayList<String>();
        listAbilities = new HashMap<String, List<Ability>>();
        abilityTypes.add("Class");
        abilityTypes.add("Race");
        abilityTypes.add("Background");

        //creates class, race, and background abilities list
        List<Ability> Class = new ArrayList<Ability>();
        List<Ability> Race = new ArrayList<Ability>();
        List<Ability> Background = new ArrayList<Ability>();

        //This line does nothing, added to make it work. Delete on merge.
        List<Ability> abilities = new ArrayList<Ability>();
        for(int i = 0; i < abilities.size(); i++) {
            Ability a = abilities.get(i);
            if(a.type == "Class") {
                Class.add(a);
            } else if(a.type == "Race") {
                Race.add(a);
            } else {
                Background.add(a);
            }
        }
    }
}
