package lfg.characterbuilder;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseExpandableListAdapter;
import android.widget.EditText;
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
    String proficienciesPass = "";
    Boolean profExist;
    ClassData cDatabase;
    RaceData rDatabase;
    ArrayList<Data> bd;
    ArrayList<Data> cd;
    ArrayList<Data> rd;

    static EditText CPVal;

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
        Bundle args = getArguments();
        gotChar = args.getParcelable("charToStats");
        String profcheck = gotChar.getProficiencies();
        profExist = profcheck.equals("");
        Background = gotChar.getType();
        System.out.println(Background);
        Lvl = gotChar.getLevel();
        System.out.println(Integer.toString(Lvl));
        Class = gotChar.getCharacterClass();
        System.out.println(Class);
        Race = gotChar.getCharacterRace();
        System.out.println(Race);
        Subrace = gotChar.getCharacterSubRace();

        CPVal = (EditText) mView.findViewById(R.id.CPVal);
        CPVal.setGravity(Gravity.CENTER_HORIZONTAL);
        CPVal.setText(String.valueOf(gotChar.getClassPoints()));
        
        //Background = "Acolyte";
        //Class = "Barbarian";
        //Race = "Dwarf";
        //Subrace = "HillDwarf";

        //Create Lists
        createlist();
        expListView = (ExpandableListView) this.mView.findViewById(R.id.expandableListView);
        listAdapter = new ExpandableListAdapter(this.getActivity(), abilityTypes, listAbilities);
        expListView.setAdapter(listAdapter);
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
            if(temp.backgroundType.equals(Background) && temp.dlevel <= Lvl) {
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
            if(temp.dClass.equals(Class) && temp.dlevel <= Lvl) {
                Ability a = new Ability();
                a.name = temp.abilName;
                a.description = temp.flavor;
                a.type = "Class";
                if(temp.armorProf != null && temp.weaponProf!= null && profExist ) {
                    proficienciesPass = temp.armorProf + " " + temp.weaponProf + " ";
                }
                ClassList.add(a);
            }
        }
        listAbilities.put("Class", ClassList);

        //Fill Race Abilities List
        for(int i = 0; i < rd.size(); i++) {
            Data temp = rd.get(i);
            System.out.println(temp.abilName);
            System.out.println(Integer.toString(i) + temp.dRace);
            if(temp.dRace.equals(Race) && temp.dlevel <= Lvl) {
                Ability a = new Ability();
                a.name = temp.abilName;
                a.description = temp.flavor;
                a.type = "Race";
                if(temp.armorProf != null && profExist) {
                    proficienciesPass = proficienciesPass + temp.armorProf + " ";
                }
                if(temp.weaponProf!= null && profExist) {
                    proficienciesPass = proficienciesPass + temp.weaponProf + " ";
                }
                if(temp.toolProf != null && profExist) {
                    proficienciesPass = proficienciesPass + temp.toolProf + " ";
                }
                RaceList.add(a);
            }
        }
        listAbilities.put("Race", RaceList);
        gotChar.setProficiencies(proficienciesPass);
    }

    public static int getAbilitiesClassPoints(){
        if (CPVal == null) return -1;
        return Integer.parseInt(CPVal.getText().toString());
    }
}
