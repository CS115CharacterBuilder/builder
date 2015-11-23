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

    Character gotChar;
    int Lvl;
    String Background;
    String Class;
    String Race;
    String Subrace;
    boolean[] sProf;
    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> abilityTypes;
    HashMap<String, List<Ability>> listAbilities;
    BackgroundData bDatabase;
    ClassData cDatabase;
    RaceData rDatabase;
    ArrayList<Data> bd;
    ArrayList<Data> cd;
    ArrayList<Data> rd;

    protected View mView;

    public class Ability {
        Ability() {
        };

        public String name;
        public String description;
        public String type;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        //declare and create local database
        bDatabase = new BackgroundData();
        cDatabase = new ClassData();
        rDatabase = new RaceData();
        bd = bDatabase.getBd();
        cd = cDatabase.getCd();
        rd = rDatabase.getRd();

        //inflates fragment view
        View fragmentView = inflater.inflate(R.layout.activity_abilities_page, container, false);
        this.mView = fragmentView;


        //get character object and set values
        /*gotChar = args.getParcelable("charToStats");
        Background = gotChar.getType();
        Lvl = gotChar.getLevel();
        Class = gotChar.getCharacterClass();
        Race = gotChar.getCharacterRace();
        Subrace = gotChar.getCharacterSubRace();*/
        Background = "Acolyte";
        Lvl = 1;
        Class = "Barbarian";
        Race = "Dwarf";
        Subrace = "HillDwarf";

        //Create Lists
        createlist();
        expListView = (ExpandableListView) mView.findViewById(R.id.expandableListView);
        listAdapter = new ExpandableListAdapter(this.getActivity(), abilityTypes, listAbilities);
        expListView.setAdapter(listAdapter);
        //Character gotChar = getActivity().getIntent().getParcelableExtra("characterTag");
        //String[] test = gotChar.getAbilties();
        return this.mView;
    }

    //creates expandable list adapter to contain different abilities
    private class ExpandableListAdapter extends BaseExpandableListAdapter {
        private FragmentActivity _context;
        private List<String> _listDataHeader;
        private HashMap<String, List<Ability>> _listDataChild;

        public ExpandableListAdapter(FragmentActivity context, List<String> listDataHeader, HashMap<String, List<Ability>> _listDataChild) {
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
                convertView = inflater.inflate(R.layout.expandablelistview_header, null);
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
        List<Ability> BackgroundList = new ArrayList<Ability>();
        List<Ability> ClassList = new ArrayList<Ability>();
        List<Ability> RaceList = new ArrayList<Ability>();

        //Fill Background Abilities List
        for(int i = 0; i < bd.size(); i++) {
            Data temp = bd.get(i);
            if(temp.backgroundType == Background && temp.dlevel == Lvl) {
                System.out.println(i);
                Ability a = new Ability();
                a.name = temp.abilName;
                a.description = temp.flavor;
                a.type = "Background";
                BackgroundList.add(a);
            }
        }
        listAbilities.put("Background", BackgroundList);

        //Fill Class Abilities List
        for(int i = 0; i < cd.size(); i++) {
            Data temp = cd.get(i);
            if(temp.dClass == Class && temp.dlevel == Lvl) {
                Ability a = new Ability();
                a.name = temp.abilName;
                a.description = temp.flavor;
                a.type = "Class";
                ClassList.add(a);
            }
        }
        listAbilities.put("Class", ClassList);

       /* //Fill Race Abilities List
        for(int i = 0; i < rd.size(); i++) {
            Data temp = rd.get(i);
            if(temp.dRace == Race && temp.dlevel == Lvl) {
                Ability a = new Ability();
                a.name = temp.abilName;
                a.description = temp.flavor;
                a.type = "Race";
                RaceList.add(a);
            }
        }
        listAbilities.put("Race", RaceList);*/
    }
}
