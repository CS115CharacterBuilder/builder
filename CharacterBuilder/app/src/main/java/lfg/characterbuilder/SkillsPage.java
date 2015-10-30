package lfg.characterbuilder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class SkillsPage extends AppCompatActivity {

    public class SkillElement {
        String name;
        String type;
        String val;
        boolean prof;
    }

    public SkillElement[] sList = new SkillElement[18];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skills_page);
        for(int i = 0; i < 17; i++) {
            SkillElement skill = new SkillElement();
            if(i == 0)
            {
                skill.name = "Athletics";
                skill.type = "Strength";
            }else if(i <= 3 && i > 0 ) {
                if(i == 1) {
                    skill.name = "Acrobatics";
                }else if(i == 2) {
                    skill.name = "Sleight of Hand";
                }else {
                    skill.name = "Stealth";
                }
                skill.type = "Dexterity";
            }else if(i <= 8 && i > 3) {
                if(i == 4) {
                    skill.name = "Arcana";
                }else if (i == 5) {
                    skill.name = "History";
                }else if (i == 6) {
                    skill.name = "Investigation";
                }else if (i == 7) {
                    skill.name = "Nature";
                }else {
                    skill.name = "Religion";
                }
                skill.type = "Intelligence";
            }else if(i <= 13 && i > 8) {
                if(i == 9) {
                    skill.name = "Animal Handling";
                }else if(i == 10) {
                    skill.name = "Insight";
                }else if(i == 11) {
                    skill.name = "Medicine";
                }else if(i == 12) {
                    skill.name = "Perception";
                }else {
                    skill.name = "Survival";
                }
                skill.type = "Wisdom";
            }else {
                if(i == 14) {
                    skill.name = "Deception";
                }else if(i == 15) {
                    skill.name = "Intimidation";
                }else if(i == 16) {
                    skill.name = "Performance";
                }else {
                    skill.name = "Persuasion";
                }
                skill.type = "Charisma";
            }
            sList[i] = skill;
        }
    }
}
