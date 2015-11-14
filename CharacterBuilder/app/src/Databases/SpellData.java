package Databases;

import java.util.ArrayList;

/**
 * Created by AndrewMiller on 11/13/15.
 */
public class SpellData extends Data {
    ArrayList<Data> sd = new ArrayList<Data>();

    Data acidSplash = new Data(); //declare a new ability object
    public void setAcidSplash(Data acidSplash) { //populate it
        acidSplash.abilName = "Acid Splash";
        acidSplash.spellLevel = 0;
        acidSplash.school = "Conjuration";
        //                       bard, cler,   dru,   Pal, range,  Sorc,   War, Wizard
        boolean classProf[] = {false, false, false, false, false, true, false, true};
        acidSplash.spells = classProf;
        acidSplash.range = 60;
        acidSplash.components = "V, S";
        acidSplash.duration = "Instantaneous";
        acidSplash.castTime = "1 Action";
        acidSplash.flavor = "You hurl a bubble of acid. Choose one creature within range, or choose two creatures within range that are within 5 feet of each other. A target must succeed on a Dexterity saving throw or take 1d6 acid damage.\n" +
                "This spell’s damage increases by 1d6 when you reach 5th level (2d6), 11th level (3d6), and 17th level (4d6).";

    }

    Data aid = new Data(); //declare a new ability object
    public void setAid(Data aid) { //populate it
        aid.abilName = "Aid";
        aid.spellLevel = 2;
        aid.school = "Abjuration";
        //                       bard, cler,   dru,   Pal, range,  Sorc,   War, Wizard
        boolean classProf[] = {false, false, false, false, false, false, false, false};
        aid.spells = classProf;
        aid.range = 30;
        aid.components = "V, S, M (a tiny strip of white cloth)";
        aid.castTime = "1 Action";
        aid.duration = "8 Hours";
        aid.flavor = "Your spell bolsters your allies with toughness and resolve. Choose up to three creatures within range. Each target’s hit point maximum and current hit points increase by 5 for the duration.\n" +
                "AtHigherLevels. When you cast this spell using\n" +
                "a spell slot of 3rd level or higher, a target’s hit points increase by an additional 5 for each slot level above 2nd.";

    }

    Data alarm = new Data(); //declare a new ability object
    public void setAlarm(Data alarm) { //populate it
        alarm.abilName = "Alarm";
        alarm.spellLevel = 1;
        alarm.school = "Abjuration (Ritual)";
        //                       bard, cler,   dru,   Pal, range,  Sorc,   War, Wizard
        boolean classProf[] = {false, false, false, true, true, false, false, true};
        alarm.spells = classProf;
        alarm.range = 30;
        alarm.components = "V, S, M (a tiny bell and a piece of\n" +
                "fine silver wire)";
        alarm.duration = "8 Hours";
        alarm.castTime = "1 Minute";
        alarm.flavor = "Your spell bolsters your allies with toughness and resolve. Choose up to three creatures within range. Each target’s hit point maximum and current hit points increase by 5 for the duration.\n" +
                "AtHigherLevels. When you cast this spell using\n" +
                "a spell slot of 3rd level or higher, a target’s hit points increase by an additional 5 for each slot level above 2nd.";

    }

    Data animalFriendship = new Data(); //declare a new ability object
    public void setAnimalFriendship(Data animalFriendship) { //populate it
        animalFriendship.abilName = "Animal Friendship";
        animalFriendship.spellLevel = 1;
        animalFriendship.school = "Enchantment";
        //                       bard, cler,   dru,   Pal, range,  Sorc,   War, Wizard
        boolean classProf[] = {true, false, true, false, true, false, false, false};
        animalFriendship.spells = classProf;
        animalFriendship.range = 30;
        animalFriendship.components = "V, S, M (a morsel of food)";
        animalFriendship.duration = "24 Hours";
        animalFriendship.castTime = "1 Action";
        animalFriendship.flavor = "This spell lets you convince a beast that you mean it no harm. Choose a beast that you can see within range.\n" +
                "It must see and hear you. If the beast’s Intelligence is\n" +
                "4 or higher, the spell fails. Otherwise, the beast must succeed on a Wisdom saving throw or be charmed\n" +
                "by you for the spell’s duration. If you or one of your companions harms the target, the spells ends.\n" +
                "AtHigherLevels. When you cast this spell using a spell slot of 2nd level or higher, you can affect one additional beast for each slot level above 1st.";

    }

    //This method returns all the race data
    public ArrayList<Data> getSd() {

        setAcidSplash(acidSplash); //Be sure to set all abilities first
        sd.add(acidSplash); //Then add them to the Arraylist

        setAid(aid);
        sd.add(aid);

        setAlarm(alarm);
        sd.add(alarm);





        return sd;
    }

}
