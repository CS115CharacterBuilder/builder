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
        bardFeatures.numclassSkills = 3;
        bardFeatures.chaClassSkills = chaSkills;
        bardFeatures.save1 = "Dexterity";
        bardFeatures.save2 = "Charisma";
        bardFeatures.toolProf = "Three musical instraments of your choice.";
    }

    Data bardscAbility = new Data();
    public void setbardSCAbility(Data scAbility){
        scAbility.abilName = "Spell Casting Ability";
        scAbility.dlevel = 1;
        scAbility.dClass = "Bard";
        scAbility.flavor = "Charisma is your spellcasting ability for your bard spells. Your magic comes from the heart and soul you pour into the performance of your music or oration. You use your Charisma whenever a spell refers to your spellcasting ability. In addition, you use your Charisma\n" +
                "modifier when setting the saving throw DC for a bard spell you cast and when making an attack roll with one.";
    }

    Data bardritCast = new Data();
    public void setbardRitCast(Data bardritCast){
        bardritCast.abilName = "Ritual Casting";
        bardritCast.dClass = "Bard";
        bardritCast.dlevel = 1;
        bardritCast.flavor = "You can cast any bard spell you know as a ritual if that spell has the ritual tag.";
    }

    Data bardcastFocus = new Data();
    public void setbardCastFocus(Data bardcastFocus){
        bardcastFocus.abilName = "Spellcasting Focus";
        bardcastFocus.dlevel = 1;
        bardcastFocus.dClass = "Bard";
        bardcastFocus.flavor = "You can use a musical instrument (found in chapter 5) as a spellcasting focus for your bard spells.";
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
        String domain[] = {"Knowledge","Life","Light","Nature","Tempest","Trickery","War"};
        clericFeatures.profbonus = pbonus;
        clericFeatures.knownCantrips = cans;
        clericFeatures.spellslots1 = slot1;
        clericFeatures.hitdie = 8;
        clericFeatures.armorProf = "Light Armor, Medium Armor, Shields";
        clericFeatures.weaponProf = "All Simple Weapons";
        clericFeatures.numclassSkills = 2;
        String chaSkills[] = {"History","Insight","Medicine","Persuasion","Religion"};
        clericFeatures.chaClassSkills = chaSkills;
        clericFeatures.save1 = "Wisdom";
        clericFeatures.save2 = "Charisma";
        clericFeatures.cDomain = domain;
    }

    Data clericscAbility = new Data();
    public void setclericSCAbility(Data scAbility){
        scAbility.abilName = "Spell Casting Ability";
        scAbility.dlevel = 1;
        scAbility.dClass = "Cleric";
        scAbility.flavor = "Wisdom is your spellcasting ability for your cleric spells. The power of your spells comes from your devotion to your deity. You use your Wisdom whenever a cleric spell refers to your spellcasting ability. In addition, you use your Wisdom modifier when setting the saving throw DC for a cleric spell you cast and when making an attack roll with one.";
    }

    Data clericritCast = new Data();
    public void setclericRitCast(Data bardritCast){
        bardritCast.abilName = "Ritual Casting";
        bardritCast.dClass = "Cleric";
        bardritCast.dlevel = 1;
        bardritCast.flavor = "You can cast a cleric spell as a ritual if that spell has the ritual tag and you have the spell prepared.";
    }

    Data clericcastFocus = new Data();
    public void setclericCastFocus(Data bardcastFocus){
        bardcastFocus.abilName = "Spellcasting Focus";
        bardcastFocus.dlevel = 1;
        bardcastFocus.dClass = "Cleric";
        bardcastFocus.flavor = "You can use a holy symbol (found in chapter 5) as a spellcasting focus for your cleric spells.";
    }

    Data druidFeatures = new Data();
    public void setDruidFeature(Data druidFeatures){
        druidFeatures.abilName = "Druid Class Features";
        druidFeatures.dlevel = 1;
        druidFeatures.dClass = "Druid";
        int pbonus[]= {2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6};
        int cans[]  = {2,2,2,3,3,3,3,3,3,4,4,4,4,4,4,4,4,4,4,4};
        int slot1[] = {2,3,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4};
        druidFeatures.profbonus = pbonus;
        druidFeatures.knownCantrips = cans;
        druidFeatures.spellslots1 = slot1;
        druidFeatures.hitdie = 8;
        druidFeatures.armorProf = "Light Armor, Medium Armor, Shields (but nothing made of metal)";
        druidFeatures.weaponProf = "Clubs, Daggers, Darts, Javelins, Maces, Quarterstaffs, Scimitars, Sickles, Slings, Spears";
        druidFeatures.numclassSkills = 2;
        String chaSkills[] = {"Arcana","Animal Handling", "Insight", "Medicine", "Nature", "Perception","Religion","Survival"};
        druidFeatures.toolProf = "Herbalism Kit";
        druidFeatures.chaClassSkills = chaSkills;
        druidFeatures.save1 = "Intelligence";
        druidFeatures.save2 = "Wisdom";
    }

    Data druidic = new Data();
    public void setDruidic(Data druidic){
        druidic.abilName = "Druidic";
        druidic.dlevel = 1;
        druidic.dClass = "Druid";
        druidic.flavor = "You know Druidic, the secret language of druids. You can speak the language and use it to leave hidden messages. You and others who know this language automatically spot such a message. Others spot the message’s presence with a successful DC 15 Wisdom (Perception) check but can’t decipher it without magic.";
    }

    Data druidscAbility = new Data();
    public void setDruidSCAbility(Data druidSCAbility){
        druidSCAbility.abilName = "Spell Casting Ability";
        druidSCAbility.dlevel = 1;
        druidSCAbility.dClass = "Druid";
        druidSCAbility.flavor = "Wisdom is your spellcasting ability for your druid\n" +
                "spells, since your magic draws upon your devotion and attunement to nature. You use your Wisdom whenever\n" +
                "a spell refers to your spellcasting ability. In addition,\n" +
                "you use your Wisdom modifier when setting the saving throw DC for a druid spell you cast and when making an attack roll with one.";
    }

    Data druidRitCast = new Data();
    public void setDruidRitCast(Data druidRitCast){
        druidRitCast.abilName = "Ritual Casting";
        druidRitCast.dClass = "Druid";
        druidRitCast.dlevel = 1;
        druidRitCast.flavor = "You can cast a druid spell as a ritual if that spell has the ritual tag and you have the spell prepared.";
    }

    Data druidCastFocus = new Data();
    public void setDruidCastFocus(Data druidCastFocus){
        druidCastFocus.abilName = "Spellcasting Focus";
        druidCastFocus.dlevel = 1;
        druidCastFocus.dClass = "Druid";
        druidCastFocus.flavor = "You can use a druidic focus (found in chapter 5) as a spellcasting focus for your druid spells.";
    }

    Data fighterFeatures = new Data();
    public void setfighterFeature(Data fighterFeatures){
        fighterFeatures.abilName = "Fighter Class Features";
        fighterFeatures.dlevel = 1;
        fighterFeatures.dClass = "Fighter";
        int pbonus[]= {2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6};
        fighterFeatures.profbonus = pbonus;
        fighterFeatures.hitdie = 10;
        fighterFeatures.armorProf = "All Armor, Shields)";
        fighterFeatures.weaponProf = "Simple Weapons, Martial Weapons";
        fighterFeatures.numclassSkills = 2;
        String chaSkills[] = {"Acrobatics","Animal","Handling","Athletics","History","Insight","Intimidation","Perception","Survival"};
        fighterFeatures.chaClassSkills = chaSkills;
        fighterFeatures.save1 = "Strength";
        fighterFeatures.save2 = "Constitution";
    }

    Data fightStyleArchery = new Data();
    public void setFightStyleArchery(Data fightStyleArchery){
        fightStyleArchery.abilName = "Fighting Style Archery";
        fightStyleArchery.dlevel = 1;
        fightStyleArchery.dClass = "Fighter";
        fightStyleArchery.flavor = "You gain a +2 bonus to attack rolls you make with ranged weapons.";
    }

    Data fightStyleDefense = new Data();
    public void setFightStyleDefense(Data fightStyleDefense){
        fightStyleDefense.abilName = "Fighting Style Defense";
        fightStyleDefense.dlevel = 1;
        fightStyleDefense.dClass = "Fighter";
        fightStyleDefense.flavor = "While you are wearing armor, you gain a +1 bonus to AC.";
    }

    Data fightStyleDueling = new Data();
    public void setFightStyleDueling(Data fightStyleDueling){
        fightStyleDueling.abilName = "Fighting Style Dueling";
        fightStyleDueling.dlevel = 1;
        fightStyleDueling.dClass = "Fighter";
        fightStyleDueling.flavor = "When you are wielding a melee weapon in one hand and no other weapons, you gain a +2 bonus to damage rolls with that weapon.";
    }

    Data fightStyleGWF = new Data();
    public void setFightStyleGWF(Data fightStyleGWF){
        fightStyleGWF.abilName = "Fighting Style Great Weapon Fighter";
        fightStyleGWF.dlevel = 1;
        fightStyleGWF.dClass = "Fighter";
        fightStyleGWF.flavor = "When you roll a 1 or 2 on a damage die for an attack you make with a melee weapon that you are wielding with two hands, you can reroll the die and must use the new roll, even if the new roll is a 1 or a 2. The weapon must have the two-handed or versatile property for you to gain this benefit.";
    }

    Data fightStyleProtection = new Data();
    public void setFightStyleProtection(Data fightStyleProtection){
        fightStyleProtection.abilName = "Fighting Style Protection";
        fightStyleProtection.dlevel = 1;
        fightStyleProtection.dClass = "Fighter";
        fightStyleProtection.flavor = "When a creature you can see attacks a target other than you that is within 5 feet of you, you can use your reaction to impose disadvantage on the attack roll. You must be wielding a shield.";
    }

    Data fightStyleTWF = new Data();
    public void setFightStyleTWF(Data fightStyleTWF){
        fightStyleTWF.abilName = "Fighting Style Two Weapon Fighting";
        fightStyleTWF.dlevel = 1;
        fightStyleTWF.dClass = "Fighter";
        fightStyleTWF.flavor = "When you engage in two-weapon fighting, you can add your ability modifier to the damage of the second attack.";
    }

    Data fighterSecondWind = new Data();
    public void setFighterSecondWind(Data fighterSecondWind){
        fighterSecondWind.abilName = "Second Wind";
        fighterSecondWind.dlevel = 1;
        fighterSecondWind.dClass = "Fighter";
        fighterSecondWind.flavor = "You have a limited well of stamina that you can draw on to protect yourself from harm. On your turn, you can use a bonus action to regain hit points equal to 1d10 + your fighter level.\n" +
                "Once you use this feature, you must finish a short or long rest before you can use it again.";
    }

    Data monkFeatures = new Data();
    public void setMonkFeatures(Data monkFeatures){
        monkFeatures.abilName = "Monk Class Features";
        monkFeatures.dlevel = 1;
        monkFeatures.dClass = "Monk";
        int pbonus[] = {2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6};
        int marts[] = {4,4,4,4,6,6,6,6,6,6,8,8,8,8,8,8,10,10,10,10};
        int ki[] = {0,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        monkFeatures.profbonus = pbonus;
        monkFeatures.kiPoints = ki;
        monkFeatures.mArts = marts;
        monkFeatures.hitdie = 8;
        monkFeatures.armorProf = "None";
        monkFeatures.weaponProf = "Simple Weapons, Shortswords";
        String chaSkills[] = {"Acrobatics", "Athletics","History","Insight","Religion","Stealth"};
        monkFeatures.numclassSkills = 2;
        monkFeatures.chaClassSkills = chaSkills;
        monkFeatures.save1 = "Strength";
        monkFeatures.save2 = "Dexterity";
        monkFeatures.toolProf = "Choose one type of artisan’s tools or one musical instrument.";

    }

    Data monkUnarmoredDef = new Data();
    public void setMonkUnarmoredDef(Data monkUnarmoredDef){
        monkUnarmoredDef.abilName = "Unarmored Defense";
        monkUnarmoredDef.dlevel = 1;
        monkUnarmoredDef.dClass = "Monk";
        monkUnarmoredDef.flavor = "\n" +
                "Beginning at 1st level, while you are wearing no armor and not wielding a shield, your AC equals 10 + your Dexterity modifier + your Wisdom modifier.";
    }

    Data monkMartialArts = new Data();
    public void setMonkMartialArts(Data monkMartialArts){
        monkMartialArts.abilName = "Martial Arts";
        monkMartialArts.dlevel = 1;
        monkMartialArts.dClass = "Monk";
        monkMartialArts.flavor = "At 1st level, your practice of martial arts gives you mastery of combat styles that use unarmed strikes and monk weapons, which are shortswords and any simple melee weapons that don’t have the two-handed or heavy property.\n" +
                "You gain the following benefits while you are unarmed or wielding only monk weapons and you aren’t wearing armororwieldingashield:\n" +
                "• You can use Dexterity instead of Strength for the attack and damage rolls of your unarmed strikes and monk weapons.\n" +
                "• You can roll a d4 in place of the normal damage of your unarmed strike or monk weapon. This die changes as you gain monk levels, as shown in the Martial Arts column of the Monk table.\n" +
                "• When you use the Attack action with an unarmed strike or a monk weapon on your turn, you can make one unarmed strike as a bonus action. For example, if you take the Attack action and attack with a quarter- staff, you can also make an unarmed strike as a bonus action, assuming you haven't already taken a bonus action this turn.\n" +
                "Certain monasteries use specialized forms of the monk weapons. For example, you might use a club\n" +
                "that is two lengths of w ood connected by a short chain (called a nunchaku) or a sickle with a shorter, straighter blade (called a kama). Whatever name you use for a monk weapon, you can use the game statistics provided for the weapon in chapter 5.";
    }

    public ArrayList<Data> getCd() {

        //Barbarian
        setBarbarianFeatures(barbarianFeatures);
        cd.add(barbarianFeatures);

        setBarbarianRage(barbarianRage);
        cd.add(barbarianRage);

        setBarbarianUnarmor(barbarianUnarmor);
        cd.add(barbarianUnarmor);

        //bard
        setBardFeatures(bardFeatures);
        cd.add(bardFeatures);

        setbardSCAbility(bardscAbility);
        cd.add(bardscAbility);

        setbardRitCast(bardritCast);
        cd.add(bardritCast);

        setbardCastFocus(bardcastFocus);
        cd.add(bardcastFocus);

        setBardInspire(bardInspire);
        cd.add(bardInspire);

        //cleric
        setClericFeature(clericFeatures);
        cd.add(clericFeatures);

        setclericCastFocus(clericcastFocus);
        cd.add(clericcastFocus);

        setclericRitCast(clericritCast);
        cd.add(clericritCast);

        setclericSCAbility(clericscAbility);
        cd.add(clericscAbility);

        //druid
        setDruidFeature(druidFeatures);
        cd.add(druidFeatures);

        setDruidic(druidic);
        cd.add(druidic);

        setDruidSCAbility(druidscAbility);
        cd.add(druidscAbility);

        setDruidRitCast(druidRitCast);
        cd.add(druidRitCast);

        setDruidCastFocus(druidCastFocus);
        cd.add(druidCastFocus);

        //fighter
        setfighterFeature(fighterFeatures);
        cd.add(fighterFeatures);

        setFightStyleArchery(fightStyleArchery);
        cd.add(fightStyleArchery);

        setFightStyleDefense(fightStyleDefense);
        cd.add(fightStyleDefense);

        setFightStyleDueling(fightStyleDueling);
        cd.add(fightStyleDueling);

        setFightStyleGWF(fightStyleGWF);
        cd.add(fightStyleGWF);

        setFightStyleProtection(fightStyleProtection);
        cd.add(fightStyleProtection);

        setFightStyleTWF(fightStyleTWF);
        cd.add(fightStyleTWF);

        setFighterSecondWind(fighterSecondWind);
        cd.add(fighterSecondWind);

        //monk
        setMonkFeatures(monkFeatures);
        cd.add(monkFeatures);

        setMonkMartialArts(monkMartialArts);
        cd.add(monkMartialArts);

        setMonkUnarmoredDef(monkUnarmoredDef);
        cd.add(monkUnarmoredDef);
        

        return cd;
    }
}
