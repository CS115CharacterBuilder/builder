package lfg.characterbuilder;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.lang.Object;
import java.util.ArrayList;
import java.util.List;

public class SkillsPage extends Fragment {
    protected View mView;
    Character gotChar;
    int[] stats;
    boolean[] classprof;

    public class SkillElement {
        SkillElement() {
        };
        String name;
        String type;
        String val;
        boolean prof;
    }

    int profval;

    private ArrayList<SkillElement> sList;

    private class MyAdapter extends ArrayAdapter<SkillElement> {
        int resource;
        Context context;
        public MyAdapter(Context context, int resource, List<SkillElement> skills) {
            super(context, resource, skills);
            resource = resource;
            context = context;
            this.context = context;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            LinearLayout newView;
            final SkillElement s = getItem(position);

            if(convertView == null) {
                newView = new LinearLayout(getContext());
                String inflater = Context.LAYOUT_INFLATER_SERVICE;
                LayoutInflater vi = (LayoutInflater) getContext().getSystemService(inflater);
                vi.inflate(R.layout.skillelement, newView, true);
            } else {
                newView = (LinearLayout) convertView;
            }

            TextView sMod = (TextView) newView.findViewById(R.id.sModTxt);
            TextView sName = (TextView) newView.findViewById(R.id.sNameTxt);
            TextView AttTxt = (TextView) newView.findViewById(R.id.AttTxt);
            sMod.setText(s.val);
            sName.setText(s.name);
            AttTxt.setText(s.type);

            return newView;
        }
    }


    private MyAdapter aa;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View fragmentView = inflater.inflate(R.layout.activity_skills_page, container, false);
        super.onCreateView(inflater, container, savedInstanceState);
        //get bundles
        Bundle args = getArguments();
        int[] caughtStatsArray = args.getIntArray("statsToFrag");
        stats = caughtStatsArray;

        boolean[] caughtBooleanArray = args.getBooleanArray("sProfBundle");
        if (caughtBooleanArray == null) {
            boolean[] skillproficiencies = new boolean[18];
            for(int i = 0; i < skillproficiencies.length; i++){
                if(i%2 == 0){
                    skillproficiencies[i] = false;
                }
                else {
                    skillproficiencies[i] = true;
                }
            }
            classprof = skillproficiencies;
        }
        else classprof = caughtBooleanArray;

        profval = stats[6];
        sList = new ArrayList<SkillElement>();
        createSkills();
        aa = new MyAdapter(this.getActivity(), R.layout.skillelement, sList);
        this.mView = fragmentView;
        ListView skillList = (ListView)this.mView.findViewById(R.id.skillList);
        skillList.setAdapter(aa);
        return this.mView;
    }

    //automates creation of character skills
    public void createSkills() {
        for (int i = 0; i <= 17; i++) {
            SkillElement skill = new SkillElement();
            if (i == 0) {
                skill.name = "Athletics";
                skill.type = "Strength";
                skill.val = modToString(findMod(stats[0], skill, i));
            } else if (i <= 3 && i > 0) {
                if (i == 1) {
                    skill.name = "Acrobatics";

                } else if (i == 2) {
                    skill.name = "Sleight of Hand";
                } else {
                    skill.name = "Stealth";
                }
                skill.type = "Dexterity";
                skill.val = modToString(findMod(stats[1], skill, i));
            } else if (i <= 8 && i > 3) {
                if (i == 4) {
                    skill.name = "Arcana";
                } else if (i == 5) {
                    skill.name = "History";
                } else if (i == 6) {
                    skill.name = "Investigation";
                } else if (i == 7) {
                    skill.name = "Nature";
                } else {
                    skill.name = "Religion";
                }
                skill.type = "Intelligence";
                skill.val = modToString(findMod(stats[3], skill, i));
            } else if (i <= 13 && i > 8) {
                if (i == 9) {
                    skill.name = "Animal Handling";
                } else if (i == 10) {
                    skill.name = "Insight";
                } else if (i == 11) {
                    skill.name = "Medicine";
                } else if (i == 12) {
                    skill.name = "Perception";
                } else {
                    skill.name = "Survival";
                }
                skill.type = "Wisdom";
                skill.val = modToString(findMod(stats[4], skill, i));
            } else {
                if (i == 14) {
                    skill.name = "Deception";
                } else if (i == 15) {
                    skill.name = "Intimidation";
                } else if (i == 16) {
                    skill.name = "Performance";
                } else {
                    skill.name = "Persuasion";
                }
                skill.type = "Charisma";
                skill.val = modToString(findMod(stats[5], skill, i));
            }
            sList.add(skill);
        }
    }


    //takes stat value and converts it into the modifier and checks if proficient to add extra modifier
    public int findMod(int x, SkillElement y, int z) {
        int statMod = (x - 10)/2;
        if (classprof[z]) {
            y.prof = true;
            statMod += profval;
        }
        return statMod;
    }

    public String modToString(int statMod) {
        String modValue;
        if(statMod > 0) {
            modValue = "+" + Integer.toString(statMod);
        }else {
            modValue = Integer.toString(statMod);
        }
        return modValue;
    }
}

