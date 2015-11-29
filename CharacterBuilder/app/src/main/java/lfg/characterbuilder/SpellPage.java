package lfg.characterbuilder;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SpellPage extends Fragment {

    Character gotChar;
    int Lvl;
    String Class;
    String[] EquippedSpells;
    String[] KnownSpells;
    boolean[] classCheck;
    ExpandableListAdapter sListAdapter;
    ExpandableListView sExpListView;
    List<String> spellLvls;
    HashMap<String, List<Spell>> listSpells;
    SpellData sDatabase;
    ArrayList<Data> sd;

    protected View mView;
    public class Spell {
        Spell() {
        };
        public String Name;
        public int ReqLvl;
        public String School;
        public String Range;
        public String Components;
        public String CastTime;
        public String Duration;
        public String Flavor;
        public boolean Known;
        public boolean Equipped;
    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        super.onCreateView(inflater, container, savedInstanceState);
        View fragmentView = inflater.inflate(R.layout.activity_spell_page, container, false);
        this.mView = fragmentView;
        sDatabase = new SpellData();
        sd = sDatabase.getSd();
        TextView SCAbility = (TextView) this.mView.findViewById(R.id.SCAbility);
        TextView SSDC = (TextView) this.mView.findViewById(R.id.SSDC);
        TextView  SABonus = (TextView) this.mView.findViewById(R.id.SABonus);
        SCAbility.setText(Integer.toString(5));
        SSDC.setText(Integer.toString(5));
        SABonus.setText(Integer.toString(5));
        KnownSpells = new String[]{"Animal Friendship"};
        EquippedSpells = new String[] {};
        Lvl = 1;
        Class = "Bard";
        createList();
        sExpListView = (ExpandableListView) this.mView.findViewById(R.id.ActiveSpells);
        sListAdapter = new ExpandableListAdapter(this.getActivity(), spellLvls, listSpells);
        sExpListView.setAdapter(sListAdapter);
        return this.mView;
    }



    //creates expandable list adapter to contain different abilities
    private class ExpandableListAdapter extends BaseExpandableListAdapter {
        private FragmentActivity _context;
        private List<String> _listDataHeader;
        private HashMap<String, List<Spell>> _listDataChild;

        public ExpandableListAdapter(FragmentActivity context, List<String> listDataHeader, HashMap<String, List<Spell>> _listDataChild) {
            this._context = context;
            this._listDataHeader = listDataHeader;
            this._listDataChild = _listDataChild;

        }


        @Override
        public int getGroupCount() {
            System.out.println("This is group count: " + Integer.toString(this._listDataHeader.size()));
            return this._listDataHeader.size();
        }

        @Override
        public int getChildrenCount(int groupPosition) {
            System.out.println("This is the child count: " + Integer.toString(this._listDataChild.get(this._listDataHeader.get(groupPosition)).size()));
            return this._listDataChild.get(this._listDataHeader.get(groupPosition)).size();
        }

        @Override
        public Object getGroup(int groupPosition) {
            System.out.println("Getting group" + Integer.toString(groupPosition));
            return this._listDataHeader.get(groupPosition);
        }

        @Override
        public Object getChild(int groupPosition, int childPosition) {
            System.out.println("Got child number " + Integer.toString(childPosition));
            return this._listDataChild.get(this._listDataHeader.get(groupPosition)).get(childPosition);
        }

        @Override
        public long getGroupId(int groupPosition) {
            System.out.println("Group position from group ID is " + Integer.toString(groupPosition));
            return groupPosition;
        }

        @Override
        public long getChildId(int groupPosition, int childPosition) {
            System.out.println("This is the child position from childID: " + Integer.toString(childPosition));
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
                System.out.println("---------------------------- Inside of get GroupView---------------------------------");
            }
            TextView abilityType = (TextView) convertView.findViewById(R.id.abilityType);
            abilityType.setTypeface(null, Typeface.BOLD);
            System.out.println("---------------------------------" + headerTitle);
            abilityType.setText(headerTitle);
            System.out.println("Just before return");
            return convertView;
        }

        @Override
        public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
            final Spell childSpell = (Spell) getChild(groupPosition, childPosition);
            final String childName = childSpell.Name;
            Boolean childKnown = childSpell.Known;
            Boolean childEquipped = childSpell.Equipped;

            if(convertView == null) {
                LayoutInflater inflater = (LayoutInflater) this._context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                convertView = inflater.inflate(R.layout.spellelement, null);
                System.out.println("---------------------------- Inside of get ChildView---------------------------------");
            }
            System.out.println("---------------------------- outside of get ChildView---------------------------------");
            TextView spellName = (TextView) convertView.findViewById(R.id.SpellName);
            final CheckBox kCheck = (CheckBox) convertView.findViewById(R.id.kBox);
            Switch eSwitch = (Switch) convertView.findViewById(R.id.eqSwitch);
            final Button lButton = (Button) convertView.findViewById(R.id.LearnSpell);

            spellName.setText(childName);
            if(childKnown == true) {
                lButton.setVisibility(View.GONE);
                kCheck.isChecked();
                eSwitch.setChecked(childEquipped);
            }else {
                lButton.setVisibility(View.VISIBLE);
                eSwitch.setChecked(false);
            }
            if(childEquipped == true) {
                convertView.setBackgroundColor(Color.GREEN);
            }

            convertView.setOnClickListener(new View.OnClickListener() {

                public void onClick (View v) {
                    String Name = childName;
                    int ReqLvl = childSpell.ReqLvl;
                    String School = childSpell.School;
                    String Range = childSpell.Range;
                    String Components = childSpell.Components;
                    String CastTime = childSpell.CastTime;
                    String Duration = childSpell.Duration;
                    String Flavor = childSpell.Flavor;

                    Intent intent = new Intent(getActivity(), SpellDetails.class);
                    intent.putExtra("Name", Name);
                    intent.putExtra("Lvl",ReqLvl);
                    intent.putExtra("School", School);
                    intent.putExtra("Range",Range);
                    intent.putExtra("Components", Components);
                    intent.putExtra("CastTime", CastTime);
                    intent.putExtra("Duration", Duration);
                    intent.putExtra("Flavor", Flavor);
                    startActivity(intent);
                }

            });

            lButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    kCheck.isChecked();
                    lButton.setVisibility(View.GONE);
                }
            });

            eSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    LinearLayout ll = (LinearLayout) buttonView.getParent().getParent();
                    ll.setBackgroundColor(Color.GREEN);
                }
            });

            return convertView;
        }

        @Override
        public boolean isChildSelectable(int groupPosition, int childPosition) {
            return true;
        }
    }

    //creates spell list for character
    public void createList () {
        spellLvls = new ArrayList<String>();
        listSpells = new HashMap<String, List<Spell>>();
        spellLvls.add("Cantrips");
        spellLvls.add("Level 1 Spells");
        List<Spell> cantripsList = new ArrayList<Spell>();
        List<Spell> lvlOneList = new ArrayList<Spell>();
        for(int i = 0; i < sd.size(); i++) {
            Data temp = sd.get(i);
            classCheck = temp.spells.clone();

            //Bard spells case
            if (Class == "Bard" && classCheck[0]) {
                if (temp.spellLevel <= Lvl) {
                    Spell s = new Spell();
                    s.Name = temp.abilName;
                    s.CastTime = temp.castTime;
                    s.Components = temp.components;
                    s.School = temp.school;
                    s.ReqLvl = temp.spellLevel;
                    s.Duration = temp.duration;
                    s.Range = temp.range;
                    s.Flavor = temp.flavor;

                    //for loop checks if spell is known
                    for(int j = 0; j < KnownSpells.length; j++) {
                        if(s.Name == KnownSpells[j]) {
                            s.Known = true;
                            //if spell is known, for loop checks if spell is equipped
                            for(int k = 0; k < EquippedSpells.length; k++ ) {
                                if(s.Name == EquippedSpells[k]) {
                                    s.Equipped = true;
                                }else {
                                    s.Equipped = false;
                                }
                            }
                        }else {
                            s.Known = false;
                        }
                    }
                    //sorts spell into appropriate level list
                    if(s.ReqLvl == 0) {
                        cantripsList.add(s);
                    } else if(s.ReqLvl == 1) {
                        lvlOneList.add(s);
                    }
                }

                //Cleric case
            } else if (Class == "Cleric" && classCheck[1]) {
                if (temp.spellLevel <= Lvl) {
                    Spell s = new Spell();
                    s.Name = temp.abilName;
                    s.CastTime = temp.castTime;
                    s.Components = temp.components;
                    s.School = temp.school;
                    s.ReqLvl = temp.spellLevel;
                    s.Duration = temp.duration;
                    s.Range = temp.range;
                    s.Flavor = temp.flavor;

                    //for loop checks if spell is known
                    for(int j = 0; j < KnownSpells.length; j++) {
                        if(s.Name == KnownSpells[j]) {
                            s.Known = true;
                            //if spell is known, for loop checks if spell is equipped
                            for(int k = 0; k < EquippedSpells.length; k++ ) {
                                if(s.Name == EquippedSpells[k]) {
                                    s.Equipped = true;
                                }else {
                                    s.Equipped = false;
                                }
                            }
                        }else {
                            s.Known = false;
                        }
                    }
                    //sorts spell into appropriate level list
                    if(s.ReqLvl == 0) {
                        cantripsList.add(s);
                    } else if(s.ReqLvl == 1) {
                        lvlOneList.add(s);
                    }
                }

                //Druid case
            }else if(Class == "Druid" && classCheck[1]) {
                if (temp.spellLevel <= Lvl) {
                    Spell s = new Spell();
                    s.Name = temp.abilName;
                    s.CastTime = temp.castTime;
                    s.Components = temp.components;
                    s.School = temp.school;
                    s.ReqLvl = temp.spellLevel;
                    s.Duration = temp.duration;
                    s.Range = temp.range;
                    s.Flavor = temp.flavor;

                    //for loop checks if spell is known
                    for(int j = 0; j < KnownSpells.length; j++) {
                        if(s.Name == KnownSpells[j]) {
                            s.Known = true;
                            //if spell is known, for loop checks if spell is equipped
                            for(int k = 0; k < EquippedSpells.length; k++ ) {
                                if(s.Name == EquippedSpells[k]) {
                                    s.Equipped = true;
                                }else {
                                    s.Equipped = false;
                                }
                            }
                        }else {
                            s.Known = false;
                        }
                    }
                    //sorts spell into appropriate level list
                    if(s.ReqLvl == 0) {
                        cantripsList.add(s);
                    } else if(s.ReqLvl == 1) {
                        lvlOneList.add(s);
                    }
                }

                //Paladin Case
            }else if(Class == "Paladin" && classCheck[2]) {
                if (temp.spellLevel <= Lvl) {
                    Spell s = new Spell();
                    s.Name = temp.abilName;
                    s.CastTime = temp.castTime;
                    s.Components = temp.components;
                    s.School = temp.school;
                    s.ReqLvl = temp.spellLevel;
                    s.Duration = temp.duration;
                    s.Range = temp.range;
                    s.Flavor = temp.flavor;

                    //for loop checks if spell is known
                    for(int j = 0; j < KnownSpells.length; j++) {
                        if(s.Name == KnownSpells[j]) {
                            s.Known = true;
                            //if spell is known, for loop checks if spell is equipped
                            for(int k = 0; k < EquippedSpells.length; k++ ) {
                                if(s.Name == EquippedSpells[k]) {
                                    s.Equipped = true;
                                }else {
                                    s.Equipped = false;
                                }
                            }
                        }else {
                            s.Known = false;
                        }
                    }
                    //sorts spell into appropriate level list
                    if(s.ReqLvl == 0) {
                        cantripsList.add(s);
                    } else if(s.ReqLvl == 1) {
                        lvlOneList.add(s);
                    }
                }

                //Ranger case
            }else if(Class == "Ranger" && classCheck[3]) {
                if (temp.spellLevel <= Lvl) {
                    Spell s = new Spell();
                    s.Name = temp.abilName;
                    s.CastTime = temp.castTime;
                    s.Components = temp.components;
                    s.School = temp.school;
                    s.ReqLvl = temp.spellLevel;
                    s.Duration = temp.duration;
                    s.Range = temp.range;
                    s.Flavor = temp.flavor;

                    //for loop checks if spell is known
                    for(int j = 0; j < KnownSpells.length; j++) {
                        if(s.Name == KnownSpells[j]) {
                            s.Known = true;
                            //if spell is known, for loop checks if spell is equipped
                            for(int k = 0; k < EquippedSpells.length; k++ ) {
                                if(s.Name == EquippedSpells[k]) {
                                    s.Equipped = true;
                                }else {
                                    s.Equipped = false;
                                }
                            }
                        }else {
                            s.Known = false;
                        }

                    }
                    //sorts spell into appropriate level list
                    if(s.ReqLvl == 0) {
                        cantripsList.add(s);
                    } else if(s.ReqLvl == 1) {
                        lvlOneList.add(s);
                    }
                }

                //Sorcerer case
            }else if(Class == "Sorcerer" && classCheck[4]) {
                if (temp.spellLevel <= Lvl) {
                    Spell s = new Spell();
                    s.Name = temp.abilName;
                    s.CastTime = temp.castTime;
                    s.Components = temp.components;
                    s.School = temp.school;
                    s.ReqLvl = temp.spellLevel;
                    s.Duration = temp.duration;
                    s.Range = temp.range;
                    s.Flavor = temp.flavor;

                    //for loop checks if spell is known
                    for(int j = 0; j < KnownSpells.length; j++) {
                        if(s.Name == KnownSpells[j]) {
                            s.Known = true;
                            //if spell is known, for loop checks if spell is equipped
                            for(int k = 0; k < EquippedSpells.length; k++ ) {
                                if(s.Name == EquippedSpells[k]) {
                                    s.Equipped = true;
                                }else {
                                    s.Equipped = false;
                                }
                            }
                        }else {
                            s.Known = false;
                        }

                    }
                    //sorts spell into appropriate level list
                    if(s.ReqLvl == 0) {
                        cantripsList.add(s);
                    } else if(s.ReqLvl == 1) {
                        lvlOneList.add(s);
                    }
                }

                //Warlock case
            }else if(Class == "Warlock" && classCheck[5]) {
                if (temp.spellLevel <= Lvl) {
                    Spell s = new Spell();
                    s.Name = temp.abilName;
                    s.CastTime = temp.castTime;
                    s.Components = temp.components;
                    s.School = temp.school;
                    s.ReqLvl = temp.spellLevel;
                    s.Duration = temp.duration;
                    s.Range = temp.range;
                    s.Flavor = temp.flavor;

                    //for loop checks if spell is known
                    for(int j = 0; j < KnownSpells.length; j++) {
                        if(s.Name == KnownSpells[j]) {
                            s.Known = true;
                            //if spell is known, for loop checks if spell is equipped
                            for(int k = 0; k < EquippedSpells.length; k++ ) {
                                if(s.Name == EquippedSpells[k]) {
                                    s.Equipped = true;
                                }else {
                                    s.Equipped = false;
                                }
                            }
                        }else {
                            s.Known = false;
                        }
                    }
                    //sorts spell into appropriate level list
                    if(s.ReqLvl == 0) {
                        cantripsList.add(s);
                    } else if(s.ReqLvl == 1) {
                        lvlOneList.add(s);
                    }
                }

                //Wizard case
            }else if(Class == "Wizard" && classCheck[6]) {
                if (temp.spellLevel <= Lvl) {
                    Spell s = new Spell();
                    s.Name = temp.abilName;
                    s.CastTime = temp.castTime;
                    s.Components = temp.components;
                    s.School = temp.school;
                    s.ReqLvl = temp.spellLevel;
                    s.Duration = temp.duration;
                    s.Range = temp.range;
                    s.Flavor = temp.flavor;

                    //for loop checks if spell is known
                    for(int j = 0; j < KnownSpells.length; j++) {
                        if(s.Name == KnownSpells[j]) {
                            s.Known = true;
                            //if spell is known, for loop checks if spell is equipped
                            for(int k = 0; k < EquippedSpells.length; k++ ) {
                                if(s.Name == EquippedSpells[k]) {
                                    s.Equipped = true;
                                }else {
                                    s.Equipped = false;
                                }
                            }
                        }else {
                            s.Known = false;
                        }
                    }
                    //sorts spell into appropriate level list
                    if(s.ReqLvl == 0) {
                        cantripsList.add(s);
                    } else if(s.ReqLvl == 1) {
                        lvlOneList.add(s);
                    }
                }
            }
        }
        listSpells.put("Cantrips", cantripsList);
        System.out.println(Integer.toString(cantripsList.size()));
        listSpells.put("Level 1 Spells", lvlOneList);
        System.out.println(Integer.toString(lvlOneList.size()));

    }

}


