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
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SpellPage extends Fragment {

    Character gotChar;
    int Lvl;
    String Class;
    boolean[] classCheck;
    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
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
        public boolean[] ClassProf;
        public String Range;
        public String Components;
        public String CastTime;
        public String Duration;
        public String Flavor;
    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        super.onCreateView(inflater, container, savedInstanceState);
        View fragmentView = inflater.inflate(R.layout.activity_spell_page, container, false);
        this.mView = fragmentView;
        sDatabase = new SpellData();
        sd = sDatabase.getSd();
        createList();
        expListView = (ExpandableListView) mView.findViewById(R.id.ActiveSpells);
        listAdapter = new ExpandableListAdapter(this.getActivity(), spellLvls, listSpells);
        expListView.setAdapter(listAdapter);
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

            final Spell childSpell = (Spell) getChild(groupPosition, childPosition);
            String childName = childSpell.Name;
            String childFlavor = childSpell.Flavor;

            if(convertView == null) {
                LayoutInflater inflater = (LayoutInflater) this._context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                convertView = inflater.inflate(R.layout.spellelement, null);
            }

            TextView spellName = (TextView) convertView.findViewById(R.id.SpellName);

            spellName.setText(childName);

            return convertView;
        }

        @Override
        public boolean isChildSelectable(int groupPosition, int childPosition) {
            return false;
        }
    }

    //creates spell list for character
    public void createList () {
        Class = "Bard";
        Lvl = 1;
        spellLvls = new ArrayList<String>();
        listSpells = new HashMap<String, List<Spell>>();
        spellLvls.add("Cantrips");
        spellLvls.add("Level 1 Spells");
        List cantripsList = new ArrayList<Spell>();
        List lvlOneList = new ArrayList<Spell>();
        for(int i = 0; i < sd.size(); i++) {
            Data temp = sd.get(i);
            classCheck = temp.spells;

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

                    //sorts spell into appropriate level list
                    if(s.ReqLvl == 0) {
                        cantripsList.add(s);
                    } else if(s.ReqLvl == 1) {
                        lvlOneList.add(s);
                    }
                }
            }
        }
    }

}


