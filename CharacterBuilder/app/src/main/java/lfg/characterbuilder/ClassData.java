package lfg.characterbuilder;
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
        barbarianFeatures.dlevel = 0;
        int pbonus[] = {2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6};
        int rages[] = {2,2,3,3,3,4,4,4,4,4,4,5,5,5,5,5,6,6,6,100};
        int rageDam[] = {2,2,2,2,2,2,2,2,3,3,3,3,3,3,3,3,4,4,4,4,4};
        //                {Str,  Dex  ,Con  ,Int  ,Wis  ,Cha  };
        boolean saves[] = {true,false,true,false,false,false};
        barbarianFeatures.profbonus = pbonus;
        barbarianFeatures.classPoints = rages;
        barbarianFeatures.ragedamage = rageDam;
        barbarianFeatures.hitdie = 12;
        barbarianFeatures.armorProf = "Light Armor, Medium Armor, Shields";
        barbarianFeatures.weaponProf = "Simple Weapons, Martial Weapons";
        barbarianFeatures.savingThrows = saves;
        //Skills alphabetically: Acrobatics, Animal Handling, Arcana, Athletics, Deception, History, Insight, Intimidation,Investigation, Medicine, Nature, Perception, Performance, Persuasion, Religion, Sleight of Hand, Stealth, Survival.
        boolean classskills[] = {false,true,false,true,false,false,false,true,false,false,true,true,false,false,false,false,false,true};
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
        bardFeatures.dlevel = 0;
        bardFeatures.dClass = "Bard";
        int pbonus[] = {2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6};
        int cans[] = {2,2,2,3,3,3,3,3,3,4,4,4,4,4,4,4,4,4,4,4};
        int spells[] = {4,5,6,7,8,9,10,11,12,14,15,15,16,18,19,19,20,22,22,22};
        int slot1[] = {2,3,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4};
        //                {Str,  Dex  ,Con  ,Int  ,Wis  ,Cha  };
        boolean saves[] = {false,true,false,false,false,true};
        //add other spell slots for later levels here.
        bardFeatures.profbonus = pbonus;
        bardFeatures.knownCantrips = cans;
        bardFeatures.knownSpells = spells;
        bardFeatures.spellslots1 = slot1;
        bardFeatures.hitdie = 8;
        bardFeatures.armorProf = "Light Armor";
        bardFeatures.weaponProf = "Simple Weapons, Hand Crossbow, Longswords, Rapiers, Shortswords";
        //Skills alphabetically: Acrobatics, Animal Handling, Arcana, Athletics, Deception, History, Insight, Intimidation,Investigation, Medicine, Nature, Perception, Performance, Persuasion, Religion, Sleight of Hand, Stealth, Survival.
        boolean classskills[] = {true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true};
        bardFeatures.numclassSkills = 3;
        bardFeatures.chaClassSkills = classskills;
        bardFeatures.savingThrows = saves;
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
        clericFeatures.dlevel = 0;
        clericFeatures.dClass = "Cleric";
        int pbonus[] = {2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6};
        int cans[] = {3,3,3,4,4,4,4,4,4,5,5,5,5,5,5,5,5,5,5,5};
        int slot1[] = {2,3,4,4,4,4,4,4,5,5,5,5,5,5,5,5,5,5,5};
        String domain[] = {"Knowledge","Life","Light","Nature","Tempest","Trickery","War"};
        //                {Str,  Dex  ,Con  ,Int  ,Wis  ,Cha  };
        boolean saves[] = {false,false,false,false,true,true};

        clericFeatures.profbonus = pbonus;
        clericFeatures.knownCantrips = cans;
        clericFeatures.spellslots1 = slot1;
        clericFeatures.hitdie = 8;
        clericFeatures.armorProf = "Light Armor, Medium Armor, Shields";
        clericFeatures.weaponProf = "All Simple Weapons";
        clericFeatures.numclassSkills = 2;
        //Skills alphabetically: Acrobatics, Animal Handling, Arcana, Athletics, Deception, History, Insight, Intimidation,Investigation, Medicine, Nature, Perception, Performance, Persuasion, Religion, Sleight of Hand, Stealth, Survival.
        boolean classskills[] = {false,false,false,false,false,true,true,false,false,true,false,true,false,false,true,false,false,false};
        clericFeatures.chaClassSkills = classskills;
        clericFeatures.savingThrows = saves;
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
        druidFeatures.dlevel = 0;
        druidFeatures.dClass = "Druid";
        int pbonus[]= {2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6};
        int cans[]  = {2,2,2,3,3,3,3,3,3,4,4,4,4,4,4,4,4,4,4,4};
        int slot1[] = {2,3,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4};
        //                {Str,  Dex  ,Con  ,Int  ,Wis  ,Cha  };
        boolean saves[] = {false,false,false,true,true,false};

        druidFeatures.profbonus = pbonus;
        druidFeatures.knownCantrips = cans;
        druidFeatures.spellslots1 = slot1;
        druidFeatures.hitdie = 8;
        druidFeatures.armorProf = "Light Armor, Medium Armor, Shields (but nothing made of metal)";
        druidFeatures.weaponProf = "Clubs, Daggers, Darts, Javelins, Maces, Quarterstaffs, Scimitars, Sickles, Slings, Spears";
        druidFeatures.numclassSkills = 2;
        //                      {0    ,1    ,2    ,3    ,4    ,5    ,6    ,7    ,8    ,9    ,10   ,11   ,12   ,13   ,14   ,15   ,16   ,17  }
        boolean classskills[] = {false,true ,true ,false,false,false,true ,false,false,true ,true ,false,true ,false,true ,false,false,true};
        druidFeatures.toolProf = "Herbalism Kit";
        druidFeatures.chaClassSkills = classskills;
        druidFeatures.savingThrows = saves;
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
        fighterFeatures.dlevel = 0;
        fighterFeatures.dClass = "Fighter";
        int pbonus[]= {2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6};
        //                {Str,  Dex  ,Con  ,Int  ,Wis  ,Cha  };
        boolean saves[] = {true,false,true,false,false,false};

        fighterFeatures.profbonus = pbonus;
        fighterFeatures.hitdie = 10;
        fighterFeatures.armorProf = "All Armor, Shields)";
        fighterFeatures.weaponProf = "Simple Weapons, Martial Weapons";
        fighterFeatures.numclassSkills = 2;
        boolean classskills[] = {true,true,false,true,false,true,true,true,false,false,false,true,false,false,false,false,false,true};
        fighterFeatures.chaClassSkills = classskills;
        fighterFeatures.savingThrows = saves;
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
        monkFeatures.dlevel = 0;
        monkFeatures.dClass = "Monk";
        int pbonus[] = {2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6};
        int marts[] = {4,4,4,4,6,6,6,6,6,6,8,8,8,8,8,8,10,10,10,10};
        int ki[] = {0,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        //                {Str,  Dex  ,Con  ,Int  ,Wis  ,Cha  };
        boolean saves[] = {true,true,false,false,false,false};

        monkFeatures.profbonus = pbonus;
        monkFeatures.classPoints = ki;
        monkFeatures.mArts = marts;
        monkFeatures.hitdie = 8;
        monkFeatures.armorProf = "None";
        monkFeatures.weaponProf = "Simple Weapons, Shortswords";
        //                      {0    ,1   ,2    ,3    ,4   ,5   ,6   ,7   ,8    ,9   ,10     ,11   ,12   ,13   ,14   ,15   ,16   ,17  }
        boolean classskills[] = {true,false,false,true,false,true,true,false,false,false,false,false,false,false,true,false,false,true};
        monkFeatures.numclassSkills = 2;
        monkFeatures.chaClassSkills = classskills;
        monkFeatures.savingThrows = saves;
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

    Data paladinFeatures = new Data();
    public void setPaladinFeature(Data paladinFeatures){
        paladinFeatures.abilName = "Paladin Class Features";
        paladinFeatures.dlevel = 0;
        paladinFeatures.dClass = "Paladin";
        int pbonus[]= {2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6};
        int slot1[] = {0,2,3,3,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4};
        paladinFeatures.profbonus = pbonus;
        paladinFeatures.spellslots1 = slot1;
        paladinFeatures.hitdie = 10;
        paladinFeatures.armorProf = "All Armor, Shields";
        paladinFeatures.weaponProf = "Simple Weapons, Martial Weapons";
        paladinFeatures.numclassSkills = 2;
        //                      {0    ,1    ,2    ,3    ,4    ,5    ,6    ,7    ,8    ,9    ,10   ,11   ,12   ,13   ,14   ,15   ,16   ,17  }
        boolean classskills[] = {false,false,false,true,false,false,true,true,false,true,false,false,false,true,true,false,false,false};
        paladinFeatures.chaClassSkills = classskills;
        paladinFeatures.save1 = "Wisdom";
        paladinFeatures.save2 = "Charisma";
    }

    Data paladinDivineSense = new Data();
    public void setPaladinDivineSense(Data paladinDivineSense){
        paladinDivineSense.abilName = "Divine Sense";
        paladinDivineSense.dlevel = 1;
        paladinDivineSense.dClass = "Paladin";
        paladinDivineSense.flavor = "The presence of strong evil registers on your senses like a noxious odor, and powerful good rings like heavenly music in your ears. As an action, you can open your awareness to detect such forces. Until the end of your next turn, you know the location of any celestial, fiend, or undead within 60 feet of you that is not behind total cover. You know the type (celestial, fiend, or undead) of any being whose presence you sense, but not its identity (the vampire Count Strahd von Zarovich, for instance). Within the same radius, you also detect the presence\n" +
                "of any place or object that has been consecrated or desecrated, as with the hallow spell.\n" +
                "You can use this feature a number of times equal to\n" +
                "1 + your Charisma modifier. When you finish a long rest,\n" +
                "you regain all expended uses.\n";
    }

    Data paladinLayOnHands = new Data();
    public void setPaladinLayOnHands(Data paladinLayOnHands){
        paladinLayOnHands.abilName = "Lay On Hands";
        paladinLayOnHands.dlevel = 1;
        paladinLayOnHands.dClass = "Paladin";
        paladinLayOnHands.flavor = "Your blessed touch can heal wounds. You have a pool of healing power that replenishes when you take a long rest. With that pool, you can restore a total number of hit points equal to your paladin level x 5.\n" +
                "As an action, you can touch a creature and draw power from the pool to restore a number of hit points\n" +
                "to that creature, up to the maximum amount remaining in your pool.\n" +
                "Alternatively, you can expend 5 hit points from your pool of healing to cure the target of one disease or neutralize one poison affecting it. You can cure multiple diseases and neutralize multiple poisons with a single use of Lay on Hands, expending hit points separately for each one.\n" +
                "This feature has no effect on undead and constructs.";
    }

    Data rangerFeatures = new Data();
    public void setRangerFeatures(Data rangerFeatures){
        rangerFeatures.abilName = "Ranger Class Features";
        rangerFeatures.dlevel = 0;
        rangerFeatures.dClass = "Ranger";
        int pbonus[] = {2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6};
        int spells[] = {0,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9,10,10,11,11};
        int slot1[]  = {0,2,3,3,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4};
        //add other spell slots for later levels here.
        //                {Str,  Dex  ,Con  ,Int  ,Wis  ,Cha  };
        boolean saves[] = {true,true,false,false,false,false};

        rangerFeatures.profbonus = pbonus;
        rangerFeatures.knownSpells = spells;
        rangerFeatures.spellslots1 = slot1;
        rangerFeatures.hitdie = 10;
        rangerFeatures.armorProf = "Light Armor, Medium Armor, Shields";
        rangerFeatures.weaponProf = "Simple Weapons, Martial Weapons";
        //                      {0    ,1    ,2    ,3    ,4    ,5    ,6    ,7    ,8    ,9    ,10   ,11   ,12   ,13   ,14   ,15   ,16   ,17  }
        boolean classskills[] = {false,true,false,true,false,false,true,false,true,false,true,true,false,false,false,false,true,true};
        rangerFeatures.numclassSkills = 3;
        rangerFeatures.chaClassSkills = classskills;
        rangerFeatures.savingThrows = saves;
    }

    Data rangerFavoredEnemy = new Data();
    public void setRangerFavoredEnemy(Data rangerFavoredEnemy){
        rangerFavoredEnemy.abilName = "Favored Enemy";
        rangerFavoredEnemy.dlevel = 1;
        rangerFavoredEnemy.dClass = "Ranger";
        rangerFavoredEnemy.flavor = "Beginning at 1st level, you have significant experience studying, tracking, hunting, and even talking to a certain type of enemy.\n" +
                "Choose a type of favored enemy: aberrations,\n" +
                "beasts, celestials, constructs, dragons, elementals, fey, fiends, giants, monstrosities, oozes, plants, or undead. Alternatively, you can select two races of humanoid (such as gnolls and orcs) as favored enemies.\n" +
                "You have advantage on Wisdom (Survival) checks to track your favored enemies, as well as on Intelligence checks to recall information about them.\n" +
                "When you gain this feature, you also learn one language of your choice that is spoken by your favored enemies, if they speak one at all.\n" +
                "You choose one additional favored enemy, as well as an associated language, at 6th and 14th level. As you gain levels, your choices should reflect the types of monsters you have encountered on your adventures.";
    }

    Data rangerNaturalExplorer = new Data();
    public void setRangerNaturalExplorer(Data rangerNaturalExplorer) {
        rangerNaturalExplorer.abilName = "Natural Exploration";
        rangerNaturalExplorer.dlevel = 0;
        rangerNaturalExplorer.dClass = "Ranger";
        rangerNaturalExplorer.flavor = "You are particularly familiar with one type of natural environment and are adept at traveling and surviving in such regions. Choose one type of favored terrain: arctic, coast, desert, forest, grassland, mountain, swamp,\n" +
                "or the Underdark. When you make an Intelligence or Wisdomcheckrelatedtoyourfavoredterrain,your proficiency bonus is doubled if you are using a skill that you’re proficient in.\n" +
                "While traveling for an hour or more in your favored terrain, you gain the following benefits:\n" +
                "• Difficult terrain doesn’t slow your group’s travel.\n" +
                "• Your group can’t becom e lost except by magical\n" +
                "means.\n" +
                "• Even when you are engaged in another activity while\n" +
                "traveling (such as foraging, navigating, or tracking),\n" +
                "you remain alert to danger.\n" +
                "• If you are traveling alone, you can move stealthily at\n" +
                "a normal pace.\n" +
                "• When you forage, you find twice as much food as you\n" +
                "normally would.\n" +
                "• While tracking other creatures, you also learn their\n" +
                "exact number, their sizes, and how long ago they passed through the area.\n" +
                "You choose additional favored terrain types at 6th and 10th level.";
    }

    Data rogueFeatures = new Data();
    public void setRogueFeatures(Data rogueFeatures){
        rogueFeatures.abilName = "Rogue Class Features";
        rogueFeatures.dlevel = 0;
        rogueFeatures.dClass = "Rogue";
        int pbonus[] = {2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6};
        int sneekDie[] = {1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9,10,10};
        //add other spell slots for later levels here.
        //                {Str,  Dex  ,Con  ,Int  ,Wis  ,Cha  };
        boolean saves[] = {false,true,false,true,false,false};

        rogueFeatures.profbonus = pbonus;
        rogueFeatures.sneakDice = sneekDie;
        rogueFeatures.hitdie = 8;
        rogueFeatures.armorProf = "Light Armor";
        rogueFeatures.weaponProf = "Simple Weapons, Hand Crossbow, Longsword, Rapier, Shortsword";
        //                      {0    ,1    ,2    ,3    ,4    ,5    ,6    ,7    ,8    ,9    ,10   ,11   ,12   ,13   ,14   ,15   ,16   ,17  }
        boolean classskills[] = {true,false,false,true,true,false,true,true,true,false,false,true,false,true,false,true,true,false};
        rogueFeatures.numclassSkills = 4;
        rogueFeatures.chaClassSkills = classskills;
        rogueFeatures.savingThrows = saves;
        rogueFeatures.toolProf = "Theives Tools";
    }

    Data rogueExpertise = new Data();
    public void setRogueExpertise(Data rogueExpertise){
        rogueExpertise.abilName = "Expertise";
        rogueExpertise.dlevel = 1;
        rogueExpertise.dClass = "Rogue";
        rogueExpertise.flavor = "At 1st level, choose two of your skill proficiencies, or one of your skill proficiencies and your proficiency with thieves’ tools. Your proficiency bonus is doubled for any ability check you make that uses either of the chosen proficiencies.\n" +
                "At 6th level, you can choose two more of your proficiencies (in skills or with thieves’ tools) to gain this benefit.\n";
    }

    Data rogueSneakAttack = new Data();
    public void setRogueSneakAttack(Data rogueSneakAttack){
        rogueSneakAttack.abilName = "Sneak Attack";
        rogueSneakAttack.dlevel = 1;
        rogueSneakAttack.dClass = "Rogue";
        rogueSneakAttack.flavor = "Beginning at 1st level, you know how to strike subtly and exploit a foe’s distraction. Once per turn, you can deal an extra 1d6 damage to one creature you hit with an attack if you have advantage on the attack roll. The attack must use a finesse or a ranged weapon.\n" +
                "You don’t need advantage on the attack roll if another enemy of the target is within 5 feet of it, that enemy isn’t incapacitated, and you don’t have disadvantage on the attack roll.\n" +
                "The amount of the extra damage increases as you gain levels in this class, as shown in the Sneak Attack column of the Rogue table.";
    }

    Data rogueThievesCant = new Data();
    public void setRogueThievesCant(Data rogueThievesCant){
        rogueThievesCant.abilName = "Thieves' Cant";
        rogueThievesCant.dlevel = 1;
        rogueThievesCant.dClass = "Rogue";
        rogueThievesCant.flavor =  "During your rogue training you learned thieves’ cant, a secret mix of dialect, jargon, and code that allows you to hide messages in seemingly normal conversation. Only another creature that knows thieves’ cant understands such messages. It takes four times longer to convey such a message than it does to speak the same idea plainly.\n" +
                "In addition, you understand a set of secret signs and symbols used to convey short, simple messages, such as whether an area is dangerous or the territory of a thieves’ guild, whether loot is nearby, or whether the people in an area are easy marks or will provide a safe house for thieves on the run.";
    }

    Data sorcererFeatures = new Data();
    public void setSorcererFeatures(Data sorcererFeatures){
        sorcererFeatures.abilName = "Sorcerer Class Features";
        sorcererFeatures.dlevel = 0;
        sorcererFeatures.dClass = "Sorcerer";
        int pbonus[] = {2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6};
        int sorcPoints[] = {0,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int cans[] = {4,4,4,5,5,5,5,5,5,6,6,6,6,6,6,6,6,6,6,6};
        int spells[] = {2,3,4,5,6,7,8,9,10,11,12,12,13,13,14,14,15,15,15,15};
        int slot1[] = {2,3,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4};
        //add other spell slots for later levels here.
        //                {Str,  Dex  ,Con  ,Int  ,Wis  ,Cha  };
        boolean saves[] = {false,false,true,false,false,true};

        sorcererFeatures.classPoints = sorcPoints;
        sorcererFeatures.profbonus = pbonus;
        sorcererFeatures.knownCantrips = cans;
        sorcererFeatures.knownSpells = spells;
        sorcererFeatures.spellslots1 = slot1;
        sorcererFeatures.hitdie = 6;
        sorcererFeatures.armorProf = "None";
        sorcererFeatures.weaponProf = "Daggers, Darts, Slings, Quarterstaffs, Light Crossbows";
        //                      {0    ,1    ,2    ,3    ,4    ,5    ,6    ,7    ,8    ,9    ,10   ,11   ,12   ,13   ,14   ,15   ,16   ,17  }
        boolean classskills[] = {false,false,true,false,true,false,true,true,false,false,false,false,false,true,true,false,false,false};
        sorcererFeatures.numclassSkills = 2;
        sorcererFeatures.chaClassSkills = classskills;
        sorcererFeatures.savingThrows = saves;
        sorcererFeatures.toolProf = "Three musical instraments of your choice.";
    }

    Data sorcSCFocus = new Data();
    public void setSorcSCFocus(Data sorcSCFocus){
        sorcSCFocus.abilName = "Spellcasting Focus";
        sorcSCFocus.dlevel = 1;
        sorcSCFocus.dClass = "Sorcerer";
        sorcSCFocus.flavor = "You can use an arcane focus (found in chapter 5) as a spellcasting focus for your sorcerer spells.";
    }

    Data sorcSCAbility = new Data();
    public void setSorcSCAbility(Data sorcSCAbility){
        sorcSCAbility.abilName = "Spellcasting Ability";
        sorcSCAbility.dlevel = 1;
        sorcSCAbility.dClass = "Sorcerer";
        sorcSCAbility.flavor = "Charisma is your spellcasting ability for your sorcerer spells, since the power of your magic relies on your ability to project your will into the world. You use your Charisma whenever a spell refers to your spellcasting ability. In addition, you use your Charisma modifier when setting the saving throw DC for a sorcerer spell you cast and when making an attack roll with one.";
    }

    Data sorcDraconicAncestor = new Data();
    public void setSorcDraconicAncestor(Data sorcDraconicAncestor){
        sorcDraconicAncestor.abilName = "Draconic Bloodline";
        sorcDraconicAncestor.dlevel = 1;
        sorcDraconicAncestor.dClass = "Sorcerer";
        sorcDraconicAncestor.flavor = "At 1st level, you choose one type of dragon as your ancestor. The damage type associated with each dragon is used by features you gain later. You can speak, read, and write Draconic. Additionally, whenever you make a Charisma check when interacting with dragons, your proficiency bonus is doubled if it applies to the check.";
    }

    Data sorcDraconicResilience = new Data();
    public void setSorcDraconicResilience(Data sorcDraconicResilience){
        sorcDraconicResilience.abilName = "Draconic Resistance";
        sorcDraconicResilience.dlevel = 1;
        sorcDraconicResilience.dClass = "Sorcerer";
        sorcDraconicResilience.flavor = "At 1st level, you choose one type of dragon as your ancestor. The damage type associated with each dragon is used by features you gain later. You can speak, read, and write Draconic. Additionally, whenever you make a Charisma check when interacting with dragons, your proficiency bonus is doubled if it applies to the check.";
    }

    Data sorcWildMagicSurge = new Data();
    public void setSorcWildMagicSurge(Data sorcWildMagicSurge){
        sorcWildMagicSurge.abilName = "Wild Magic Surge";
        sorcWildMagicSurge.dlevel = 1;
        sorcWildMagicSurge.dClass = "Sorcerer";
        sorcWildMagicSurge.flavor = "Starting when you choose this origin at 1st level, your spellcasting can unleash surges of untamed magic. Immediately after you cast a sorcerer spell of 1st level or higher, the DM can have you roll a d20. If you roll a\n" +
                "1, roll on the Wild Magic Surge table to create a random magical effect.";
    }

    Data sorcTidesOfChaos = new Data();
    public void setSorcTidesOfChaos(Data sorcTidesOfChaos){
        sorcTidesOfChaos.abilName = "Tides Of Chaos";
        sorcTidesOfChaos.dlevel = 1;
        sorcTidesOfChaos.dClass = "Sorcerer";
        sorcTidesOfChaos.flavor = "Starting when you choose this origin at 1st level, your spellcasting can unleash surges of untamed magic. Immediately after you cast a sorcerer spell of 1st level or higher, the DM can have you roll a d20. If you roll a\n" +
                "1, roll on the Wild Magic Surge table to create a random magical effect.";
    }

    Data warlockFeatures = new Data();
    public void setWarlockFeatures(Data warlockFeatures){
        warlockFeatures.abilName = "Warlock Class Features";
        warlockFeatures.dlevel = 0;
        warlockFeatures.dClass = "Warlock";
        int pbonus[] = {2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6};
        int cans[] = {2,2,2,3,3,3,3,3,3,4,4,4,4,4,4,4,4,4,4,4};
        int spells[] = {2,3,4,5,6,7,8,9,10,10,11,11,12,12,13,13,14,14,15,15};
        int slot1[] = {1,2,2,2,2,2,2,2,2,2,3,3,3,3,3,3,4,4,4,4};
        int slotlevel[] = {1,1,2,2,3,3,4,4,5,5,5,5,5,5,5,5,5,5,5,5};
        int inv[] = {0,2,2,2,3,3,4,4,5,5,5,6,6,6,7,7,7,8,8,8};
        //add other spell slots for later levels here.
        //                {Str,  Dex  ,Con  ,Int  ,Wis  ,Cha  };
        boolean saves[] = {false,false,false,false,true,true};

        warlockFeatures.classPoints = slotlevel;//this is the level of the spell slots.
        warlockFeatures.profbonus = pbonus;
        warlockFeatures.knownCantrips = cans;
        warlockFeatures.knownSpells = spells;
        warlockFeatures.spellslots1 = slot1;
        warlockFeatures.invocations = inv;
        warlockFeatures.hitdie = 8;
        warlockFeatures.armorProf = "Light Armor";
        warlockFeatures.weaponProf = "Simple Weapons";
        //                      {0    ,1    ,2    ,3    ,4    ,5    ,6    ,7    ,8    ,9    ,10   ,11   ,12   ,13   ,14   ,15   ,16   ,17  }
        boolean classskills[] = {false,false,true,false,true,true,false,true,true,false,true,false,false,false,true,false,false,false};

        warlockFeatures.numclassSkills = 2;
        warlockFeatures.chaClassSkills = classskills;
        warlockFeatures.savingThrows = saves;
    }

    Data warlockSCAbility = new Data();
    public void setWarlockSCAbility(Data warlockSCAbility){
        warlockSCAbility.abilName = "Spellcasting Ability";
        warlockSCAbility.dlevel = 1;
        warlockSCAbility.dClass = "Warlock";
        warlockSCAbility.flavor =  "Charisma is your spellcasting ability for your warlock spells, so you use your Charisma whenever a spell refers to your spellcasting ability. In addition, you use your Charisma modifier when setting the saving throw DC for a warlock spell you cast and when making an attack roll with one.\n";
    }

    Data warlockSCFocus = new Data();
    public void setWarlockSCFocus(Data warlockSCFocus){
        warlockSCFocus.abilName = "Spellcasting Focus";
        warlockSCFocus.dlevel = 1;
        warlockSCFocus.dClass = "Warlock";
        warlockSCFocus.flavor =  "You can use an arcane focus (found in chapter 5) as a spellcasting focus for your warlock spells.\n";
    }

    Data warlockEldrichInvocation = new Data();
    public void setWarlockEldrichInvocation(Data warlockEldrichInvocation){
        warlockEldrichInvocation.abilName = "Eldrich Invocation";
        warlockEldrichInvocation.dlevel = 2;
        warlockEldrichInvocation.dClass = "Warlock";
        warlockEldrichInvocation.flavor =  "In your study of occult lore, you have unearthed eldritch invocations, fragments of forbidden knowledge that imbue you with an abiding magical ability.\n" +
                "At 2nd level, you gain two eldritch invocations of your choice. Your invocation options are detailed at the end of the class description. When you gain certain warlock levels, you gain additional invocations of your choice,\n" +
                "as shown in the Invocations Known column of the Warlock table.\n" +
                "Additionally, when you gain a level in this class,\n" +
                "you can choose one of the invocations you know and replace it with another invocation that you could learn at that level.";
    }

    Data wizardFeatures = new Data();
    public void setWizardFeatures(Data wizardFeatures){
        wizardFeatures.abilName = "Wizard Class Features";
        wizardFeatures.dlevel = 0;
        wizardFeatures.dClass = "Wizard";
        int pbonus[] = {2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6};
        int cans[] = {3,3,3,4,4,4,4,4,4,5,5,5,5,5,5,5,5,5,5,5};
        int slot1[] = {2,3,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4};
        //add other spell slots for later levels here.
        //                {Str,  Dex  ,Con  ,Int  ,Wis  ,Cha  };
        boolean saves[] = {false,false,false,true,true,false};

        wizardFeatures.profbonus = pbonus;
        wizardFeatures.knownCantrips = cans;
        wizardFeatures.spellslots1 = slot1;
        wizardFeatures.hitdie = 6;
        wizardFeatures.armorProf = "None";
        wizardFeatures.weaponProf = "Dagger, Darts, Slings, Quarterstaffs, Light Crossbows";
        //                      {0    ,1    ,2    ,3    ,4    ,5    ,6    ,7    ,8    ,9    ,10   ,11   ,12   ,13   ,14   ,15   ,16   ,17  }
        boolean classskills[] = {false,false,true,false,false,true,true,false,true,true,false,false,false,false,true,false,false,false};
        wizardFeatures.numclassSkills = 2;
        wizardFeatures.chaClassSkills = classskills;
        wizardFeatures.savingThrows = saves;
        wizardFeatures.toolProf = "Three musical instraments of your choice.";
    }

    Data wizardSCFocus = new Data();
    public void setWizardSCFocus(Data wizardSCFocus){
        wizardSCFocus.abilName = "Spellcasting Focus";
        wizardSCFocus.dlevel = 1;
        wizardSCFocus.dClass = "Wizard";
        wizardSCFocus.flavor =  "Intelligence is your spellcasting ability for your wizard spells, since you learn your spells through dedicated study and memorization. You use your Intelligence whenever a spell refers to your spellcasting ability.\n" +
                "In addition, you use your Intelligence modifier when setting the saving throw DC for a wizard spell you cast and when making an attack roll with one.\n";
    }

    Data wizardSpellbook = new Data();
    public void setWizardSpellbook(Data wizardSpellbook){
        wizardSpellbook.abilName = "Spellbook";
        wizardSpellbook.dlevel = 1;
        wizardSpellbook.dClass = "Wizard";
        wizardSpellbook.flavor =  "At 1st level, you have a spellbook containing six 1st-level wizard spells of your choice.";
    }

    Data wizardRitualCasting= new Data();
    public void setWizardRitualCasting(Data wizardRitualCasting){
        wizardRitualCasting.abilName = "Ritual Casting";
        wizardRitualCasting.dlevel = 1;
        wizardRitualCasting.dClass = "Wizard";
        wizardRitualCasting.flavor =  "You can cast a wizard spell as a ritual if that spell has the ritual tag and you have the spell in your spellbook. You don't need to have the spell prepared.\n";
    }

    Data wizardArcaneRecovery= new Data();
    public void setWizardArcaneRecovery(Data wizardArcaneRecovery){
        wizardArcaneRecovery.abilName = "Arcane Recovery";
        wizardArcaneRecovery.dlevel = 1;
        wizardArcaneRecovery.dClass = "Wizard";
        wizardArcaneRecovery.flavor =  "\n" +
                "You have learned to regain some of your magical energy by studying your spellbook. Once per day when you finish a short rest, you can choose expended spell slots to recover. The spell slots can have a combined level that is equal to or less than half your wizard level (rounded up), and none of the slots can be 6th level or higher.\n" +
                "For example, if you’re a 4th-level wizard, you can recover up to two levels worth of spell slots. You can recover either a 2nd-level spell slot or two 1st-level spell slots.";
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

        //paladin
        setPaladinFeature(paladinFeatures);
        cd.add(paladinFeatures);

        setPaladinLayOnHands(paladinLayOnHands);
        cd.add(paladinLayOnHands);

        setPaladinDivineSense(paladinDivineSense);
        cd.add(paladinDivineSense);

        //ranger
        setRangerFeatures(rangerFeatures);
        cd.add(rangerFeatures);

        setRangerFavoredEnemy(rangerFavoredEnemy);
        cd.add(rangerFavoredEnemy);

        setRangerNaturalExplorer(rangerNaturalExplorer);
        cd.add(rangerNaturalExplorer);

        //rogue
        setRogueFeatures(rogueFeatures);
        cd.add(rogueFeatures);

        setRogueExpertise(rogueExpertise);
        cd.add(rogueExpertise);

        setRogueSneakAttack(rogueSneakAttack);
        cd.add(rogueSneakAttack);

        setRogueThievesCant(rogueThievesCant);
        cd.add(rogueThievesCant);

        //sorcerer
        setSorcererFeatures(sorcererFeatures);
        cd.add(sorcererFeatures);

        setSorcDraconicAncestor(sorcDraconicAncestor);
        cd.add(sorcDraconicAncestor);

        setSorcDraconicResilience(sorcDraconicResilience);
        cd.add(sorcDraconicResilience);

        setSorcSCAbility(sorcSCAbility);
        cd.add(sorcSCAbility);

        setSorcSCFocus(sorcSCFocus);
        cd.add(sorcSCFocus);

        setSorcWildMagicSurge(sorcWildMagicSurge);
        cd.add(sorcWildMagicSurge);

        setSorcTidesOfChaos(sorcTidesOfChaos);
        cd.add(sorcTidesOfChaos);

        //warlock
        setWarlockFeatures(warlockFeatures);
        cd.add(warlockFeatures);

        setWarlockEldrichInvocation(warlockEldrichInvocation);
        cd.add(warlockEldrichInvocation);

        setWarlockSCAbility(warlockSCAbility);
        cd.add(warlockSCAbility);

        //wizard
        setWizardFeatures(wizardFeatures);
        cd.add(wizardFeatures);

        setWizardSpellbook(wizardSpellbook);
        cd.add(wizardSpellbook);

        setWizardArcaneRecovery(wizardArcaneRecovery);
        cd.add(wizardArcaneRecovery);

        setWizardRitualCasting(wizardRitualCasting);
        cd.add(wizardRitualCasting);

        setWizardSCFocus(wizardSCFocus);
        cd.add(wizardSCFocus);

        return cd;
    }
}
