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
        barbarianFeatures.numclassSkills = 2;
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

    Data bardFeatures = new Data();
    public void setBardFeatures(Data bardFeatures){
        bardFeatures.abilName = "Bard Class Features";
        bardFeatures.dlevel = 1;
        bardFeatures.dClass = "Bard";
        int pbonus[] = {2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6};
        int cans[] = {2,2,2,3,3,3,3,3,3,4,4,4,4,4,4,4,4,4,4,4};
        int spells[] = {4,5,6,7,8,9,10,11,12,14,15,15,16,18,19,19,20,22,22,22};
        int slot1[] = {2,3,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4};
        //add other spell slots for later levels here.
        bardFeatures.profbonus = pbonus;
        bardFeatures.knownCantrips = cans;
        bardFeatures.knownSpells = spells;
        bardFeatures.spellslots1 = slot1;
        bardFeatures.hitdie = 8;
        bardFeatures.armorProf = "Light Armor";
        bardFeatures.weaponProf = "Simple Weapons, Hand Crossbow, Longswords, Rapiers, Shortswords";
        String chaSkills[] = {"Acrobatics", "Animal Handling","Arcana","Athletics","Deception","History","Insight","Intimidation","Investigation","Medicine","Nature","Perception","Performance","Persuasion","Religion","Sleight of Hand","Stealth","Survival"};
        bardFeatures.chaClassSkills = chaSkills;
        bardFeatures.save1 = "Dexterity";
        bardFeatures.save2 = "Charisma";
        bardFeatures.toolProf = "Three musical instraments of your choice.";
    }

    Data scAbility = new Data();
    public void setSCAbility(Data scAbility){
        scAbility.abilName = "Spell Casting Ability";
        scAbility.dlevel = 1;
        scAbility.dClass = "Bard";
        scAbility.flavor = "Charisma is your spellcasting ability for your bard spells. Your magic comes from the heart and soul you pour into the performance of your music or oration. You use your Charisma whenever a spell refers to your spellcasting ability. In addition, you use your Charisma\n" +
                "modifier when setting the saving throw DC for a bard spell you cast and when making an attack roll with one.";
    }

    Data ritCast = new Data();
    public void setRitCast(Data ritCast){
        ritCast.abilName = "Ritual Casting";
        ritCast.dClass = "Bard";
        ritCast.dlevel = 1;
        ritCast.flavor = "You can cast any bard spell you know as a ritual if that spell has the ritual tag.";
    }

    Data castFocus = new Data();
    public void setCastFocus(Data castFocus){
        castFocus.abilName = "Spellcasting Focus";
        castFocus.dlevel = 1;
        castFocus.dClass = "Bard";
        castFocus.flavor = "You can use a musical instrument (found in chapter 5) as a spellcasting focus for your bard spells.";
    }

    Data bardInspire = new Data();
    public void setBardInspire(Data bardInspire){
        bardInspire.abilName = "Bardic Inspiration";
        bardInspire.dClass = "Bard";
        bardInspire.dlevel = 1;
        bardInspire.flavor = "You can inspire others through stirring words or music. To do so, you use a bonus action on your turn to choose one creature other than yourself within 60 feet of you who can hear you. That creature gains one Bardic Inspiration die, a d6.\n" +
                "Once within the next 10 minutes, the creature can roll the die and add the number rolled to one ability check, attack roll, or saving throw it makes. The creature can wait until after it rolls the d20 before deciding to use the Bardic Inspiration die, but must decide before the DM says whether the roll succeeds or fails. Once the Bardic Inspiration die is rolled, it is lost. A creature can have only one Bardic Inspiration die at a time.can use this feature a number of times equal\n" +
                "to your Charisma modifier (a minimum of once). You regain any expended uses when you finish a long rest.\n" +
                "Your Bardic Inspiration die changes when you reach certain levels in this class. The die becomes a d8 at 5th level, a d10 at 10th level, and a dl2 at 15th level.";
    }

    Data clericFeatures = new Data();
    public void setClericFeature(Data clericFeatures){
        clericFeatures.abilName = "Cleric Class Features";
        clericFeatures.dlevel = 1;
        clericFeatures.dClass = "Cleric";
        int pbonus[] = {2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6};
        int cans[] = {3,3,3,4,4,4,4,4,4,5,5,5,5,5,5,5,5,5,5,5};
        int slot1[] = {2,3,4,4,4,4,4,4,5,5,5,5,5,5,5,5,5,5,5};
        clericFeatures.profbonus = pbonus;
        clericFeatures.knownCantrips = cans;
        clericFeatures.spellslots1 = slot1;
        clericFeatures.hitdie = 8;
        clericFeatures.armorProf = "Light Armor, Medium Armor, Shields";
        clericFeatures.weaponProf = "All Simple Weapons";
        String chaSkills[] = {"History","Insight","Medicine","Persuasion","Religion"};
        clericFeatures.chaClassSkills = chaSkills;
        clericFeatures.save1 = "Wisdom";
        clericFeatures.save2 = "Charisma";
    }


    public ArrayList<Data> getCd() {

        setBarbarianFeatures(barbarianFeatures);
        cd.add(barbarianFeatures);

        setBarbarianRage(barbarianRage);
        cd.add(barbarianRage);

        setBarbarianUnarmor(barbarianUnarmor);
        cd.add(barbarianUnarmor);

        setBardFeatures(bardFeatures);
        cd.add(bardFeatures);

        setSCAbility(scAbility);
        cd.add(scAbility);

        setRitCast(ritCast);
        cd.add(ritCast);

        setCastFocus(castFocus);
        cd.add(castFocus);

        setBardInspire(bardInspire);
        cd.add(bardInspire);




        return cd;
    }
}
