package Databases;
import java.util.*;
/**
 * Created by AndrewMiller on 10/31/15.
 */
public class ClassData extends Data {
    ArrayList<Data> cd = new ArrayList<Data>();

    Data barbarianFeatures = new Data();
    public void setBarbarianFeatures(Data barbarianFeatures) {
        barbarianFeatures.abilName = "Barbarian Class Features";
        barbarianFeatures.dClass = "Barbarian";
        barbarianFeatures.dlevel = 1;
        int pbonus[] = {2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6};
        int rages[] = {2,2,3,3,3,4,4,4,4,4,4,5,5,5,5,5,6,6,6,100};
        int rageDam[] = {2,2,2,2,2,2,2,2,3,3,3,3,3,3,3,3,4,4,4,4,4};
        barbarianFeatures.profbonus = pbonus;
        barbarianFeatures.classPoints = rages;
        barbarianFeatures.ragedamage = rageDam;
        barbarianFeatures.hitdie = 12;
        barbarianFeatures.armorProf = "Light Armor, Medium Armor, Shields";
        barbarianFeatures.weaponProf = "Simple Weapons, Martial Weapons";
        barbarianFeatures.save1 = "Strength";
        barbarianFeatures.save2 = "Constitution";
        String classskills[] = {"Animal Handling","Athletics","Intimidation","Nature","Perception","Survival"};
        barbarianFeatures.chaClassSkills= classskills;
    }

    Data barbarianRage = new Data();
    public void setBarbarianRage(Data barbarianRage){
        barbarianRage.abilName = "Rage";
        barbarianRage.dClass = "Barbarian";
        barbarianRage.dlevel = 1;
        barbarianRage.flavor = "In battle, you fight with primal ferocity. On your turn, you can enter a rage as a bonus action.\n" +
                "While raging, you gain the following benefits if you aren’twearing heavy armor:\n" +
                "• You have advantage on Strength checks and Strength saving throws.\n" +
                "• When you make a melee weapon attack using Strength, you gain a bonus to the damage roll that increases as you gain levels as a barbarian, as shown in the Rage Damage column of the Barbarian table.\n" +
                "• You have resistance to bludgeoning, piercing, and slashing damage.\n" +
                "If you are able to cast spells, you can’t cast them or concentrate on them while raging.\n" +
                "Your rage lasts for 1 minute. It ends early if you are knocked unconscious or if your turn ends and you haven’t attacked a hostile creature since your last turn or taken damage since then. You can also end your rage on your turn as a bonus action.\n" +
                "Once you have raged the number of times shown\n" +
                "for your barbarian level in the Rages column of the Barbarian table, you must finish a long rest before you can rage again.";
    }

    Data barbarianUnarmor = new Data();
    public void setBarbarianUnarmor(Data barbarianUnarmor){
        barbarianUnarmor.abilName = "Unarmored Defense";
        barbarianUnarmor.dlevel = 1;
        barbarianUnarmor.dClass = "Barbarian";
        barbarianUnarmor.flavor = "While you are not wearing any armor, your Armor Class equals 10 + your Dexterity modifier + your Constitution modifier. You can use a shield and still gain this benefit.\n";
    }


    public ArrayList<Data> getCd() {

        setBarbarianFeatures(barbarianFeatures);
        cd.add(barbarianFeatures);

        setBarbarianRage(barbarianRage);
        cd.add(barbarianRage);

        setBarbarianUnarmor(barbarianUnarmor);
        cd.add(barbarianUnarmor);

        return cd;
    }
}
