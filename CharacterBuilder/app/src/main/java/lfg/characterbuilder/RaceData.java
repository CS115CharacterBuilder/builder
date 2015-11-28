package lfg.characterbuilder;

import java.util.*;
/**
 * Created by AndrewMiller on 10/28/15.
 * RaceData holds all the abilities, powers and features that come from race.
 */

public class RaceData extends Data {
    ArrayList<Data> rd = new ArrayList<Data>();

    //Sample ability
    Data ability1 = new Data(); //declare a new ability object
    public void setAbility1(Data ability1) { //populate it
        this.ability1 = ability1;
        ability1.abilName = "TestAbility";
        ability1.dClass = "Peasant";
        ability1.dRace = "Human Scum";
        ability1.flavor = "From the long lost hills of buttoncreakkk he farms mud for all the land.";
        int stats[] = {1,0,0,0,0,0};
        ability1.statBoost = stats;
        ability1.has = true;
        ability1.prof = true;
    }

    Data hillDwarfSubrace = new Data();
    public void setHillDwarfStatBoost(Data hillDwarfSubrace){
        hillDwarfSubrace.abilName = "Hill Dwarf Features";
        hillDwarfSubrace.subrace = "Hill Dwarf";
        hillDwarfSubrace.dlevel = 1;
        hillDwarfSubrace.dRace = "Dwarf";
        int stats[] = {0,0,0,0,1,0};
        hillDwarfSubrace.statBoost = stats;
        hillDwarfSubrace.flavor = "As a hill dwarf, you have keen senses, deep intuition, and remarkable resilience. The gold dwarves of Faerun in their mighty southern kingdom are hill dwarves, as are the exiled Neidar and the debased Klar of Krynn in the Dragonlance setting.";
    }

    Data hilldwarfDwarvenToughness = new Data();
    public void setHilldwarfDwarvenToughness(Data hilldwarfDwarvenToughness){
        hilldwarfDwarvenToughness.abilName = "Dwarven Toughness";
        hilldwarfDwarvenToughness.subrace = "Hill Dwarf";
        hilldwarfDwarvenToughness.dlevel = 1;
        hilldwarfDwarvenToughness.dRace = "Dwarf";
        hilldwarfDwarvenToughness.flavor = "Dwarven Toughness. Your hit point maximum increases by 1, and it increases by 1 every time you gain a level.";
    }


    Data mountianDwarfSubrace = new Data();
    public void setMountianDwarfStatBoost(Data mountianDwarfSubrace){
        mountianDwarfSubrace.abilName = "Mountian Dwarf Features";
        mountianDwarfSubrace.subrace = "Mountian Dwarf";
        mountianDwarfSubrace.dlevel = 1;
        mountianDwarfSubrace.dRace = "Dwarf";
        int stats[] = {2,0,0,0,0,0};
        mountianDwarfSubrace.statBoost = stats;
        mountianDwarfSubrace.armorProf = "Light Armor, Medium Armor";
        mountianDwarfSubrace.flavor = "As a mountain dwarf, you're strong and hardy, accustomed to a difficult life in rugged terrain. You’re probably on the tall side (for a dwarf), and tend toward lighter coloration. The shield dwarves of northern Faerun, as well as the ruling Hylar clan and the noble Daewar clan of Dragonlance, are mountain dwarves.";
    }

    Data dwarfTraits = new Data();
    public void setDwarfTraits(Data dwarfTraits) {
        dwarfTraits.abilName = "Dwarven Traits";
        dwarfTraits.dRace = "Dwarf";
        dwarfTraits.dlevel = 0;
        int stats[] = {0, 0, 2, 0, 0, 0};
        dwarfTraits.statBoost = stats;
        dwarfTraits.size = "Medium";
        dwarfTraits.speed = 25;
        dwarfTraits.weaponProf = "Battleaxe, Handaxe, Throwing Hammer, War Hammer";
        dwarfTraits.toolProf =  "Smith Tools, Brewers Supplies, Mason's Tools";
        dwarfTraits.languages = "Common, Dwarvish";
        dwarfTraits.flavor = "";
    }

    Data dwarfResistance = new Data();
    public void setDwarfResistance(Data dwarfResistance){
        dwarfResistance.abilName = "Dwarf Resistance";
        dwarfResistance.dRace = "Dwarf";
        dwarfResistance.dlevel = 0;
        dwarfResistance.flavor = "Dwarven Resilience. You have advantage on saving throws against poison, and you have resistance against poison damage";
    }

    Data dwarfVision = new Data();
    public void setDwarfVision(Data dwarfVision){
        dwarfVision.abilName = "Dwarf Vision";
        dwarfVision.dRace = "Dwarf";
        dwarfVision.dlevel = 0;
        dwarfVision.flavor = "Dark Vision: Accustomed to life underground, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.";
    }

    Data elfTraits = new Data();
    public void setElfTraits(Data elfTraits){
        elfTraits.abilName = "Elf Traits";
        elfTraits.dlevel = 0;
        elfTraits.dRace = "Elf";
        int stats[] = {0,2,0,0,0,0};
        elfTraits.statBoost = stats;
        elfTraits.size = "Medium";
        elfTraits.speed = 30;
        //Skills alphabetically: Acrobatics, Animal Handling, Arcana, Athletics, Deception, History, Insight, Intimidation,Investigation, Medicine, Nature, Perception, Performance, Persuasion, Religion, Sleight of Hand, Stealth, Survival.
        boolean raceSkills[] = {false,false,false,false,false,false,false,false,false,false,false,false,true,false,false,false,false,false};
        elfTraits.raceSkills = raceSkills;
        elfTraits.languages = "Common, Elvish";
    }

    Data elfVision = new Data();
    public void setElfVision(Data elfVision){
        elfVision.abilName = "Elf Vision";
        elfVision.dRace = "Elf";
        elfVision.dlevel = 0;
        elfVision.flavor = "Darkvision. Accustomed to twilit forests and the night sky, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.";
    }

    Data elfResistance = new Data();
    public void setElfResistance(Data elfResistance){
        elfResistance.abilName = "Fey Ancestry";
        elfResistance.dRace = "Elf";
        elfResistance.dlevel = 0;
        elfResistance.flavor = "Fey Ancestry. You have advantage on saving throws against being charmed, and magic can’t put you to sleep.";
    }

    Data elfTrance = new Data();
    public void setElfTrance(Data elfTrance){
        elfTrance.abilName = "Trance";
        elfTrance.dRace = "Elf";
        elfTrance.dlevel = 0;
        elfTrance.flavor = "Trance.Elvesdon’tneedtosleep.Instead,they meditate deeply, remaining semiconscious, for 4\n" +
                "hours a day. (The Common word for such meditation\n" +
                "is “trance.”) W hile meditating, you can dream after a fashion; such dreams are actually mental exercises that have become reflexive through years of practice. After resting in this way, you gain the same benefit that a human does from 8 hours of sleep.";
    }

    Data highElfSubrace = new Data();
    public void setHighElfSubrace(Data highElfSubrace){
        highElfSubrace.abilName = "High Elf Subrace";
        highElfSubrace.subrace = "High Elf";
        highElfSubrace.dlevel = 1;
        highElfSubrace.dRace = "Elf";
        int stats[] = {0,0,0,1,0,0};
        highElfSubrace.statBoost = stats;
        highElfSubrace.weaponProf = "Longsword, Shortsword, Longbow";
        highElfSubrace.extraCantrips = 1;
        highElfSubrace.misc1 = "High Elves read and write one extra language.";
    }

    Data woodElfSubrace = new Data();
    public void setWoodElfSubrace(Data woodElfSubrace){
        woodElfSubrace.abilName = "Wood Elf Subrace";
        woodElfSubrace.subrace = "Wood Elf";
        woodElfSubrace.dRace = "Elf";
        woodElfSubrace.dlevel = 1;
        int stats[] = {0,0,0,0,1,0};
        woodElfSubrace.statBoost = stats;
        woodElfSubrace.speed = 35;
        woodElfSubrace.weaponProf = "Longsword, Shortsword, Shortbow, Longbow";
    }

    Data woodElfMaskofTheWild = new Data();
    public void setWoodElfMaskofTheWild(Data woodElfMaskofTheWild){
        woodElfMaskofTheWild.abilName = "Trance";
        woodElfMaskofTheWild.subrace = "Wood Elf";
        woodElfMaskofTheWild.dRace = "Elf";
        woodElfMaskofTheWild.dlevel = 1;
        woodElfMaskofTheWild.flavor = "Mask of the Wild. You can attempt to hide even when you are only lightly obscured by foliage, heavy rain, falling snow, mist, and other natural phenomena.";
    }

    Data darkElfSubrace = new Data();
    public void setDarkElfSubrace(Data darkElfSubrace){
        darkElfSubrace.abilName = "Dark Elf Subrace";
        darkElfSubrace.dRace = "Elf";
        darkElfSubrace.dlevel = 1;
        int stats[] = {0,0,0,0,0,1};
        darkElfSubrace.statBoost = stats;
        darkElfSubrace.misc1 = "Superior Dark Vision: Your Darkvision extends to 120ft.";
        darkElfSubrace.misc2 = "Sunlight Sensitivity. You have disadvantage on attack rolls and on Wisdom (Perception) checks that rely on sight when you, the target of your attack, or whatever you are trying to perceive is in direct sunlight.";
        darkElfSubrace.extraCantripsByName = "Dancing Lights";
        darkElfSubrace.weaponProf = "Rapiers, Shortswords, Hand Crossbows";
    }

    Data darkElfVision = new Data();
    public void setDarkElfVision(Data darkElfVision){
        darkElfVision.abilName = "Superior Darkvision";
        darkElfVision.subrace = "Dark Elf";
        darkElfVision.dRace = "Elf";
        darkElfVision.dlevel = 1;
        darkElfVision.flavor = " Your darkvision has a radius of 120 feet.";
    }

    Data sunlightSensitivity = new Data();
    public void setSunlightSensitivity(Data sunlightSensitivity){
        sunlightSensitivity.abilName = "Sunlight Sensitivity";
        sunlightSensitivity.subrace = "Dark Elf";
        sunlightSensitivity.dRace = "Elf";
        sunlightSensitivity.dlevel = 1;
        sunlightSensitivity.flavor = "You have disadvantage on attack rolls and on Wisdom (Perception) checks that rely on sight when you, the target of your attack, or whatever you are trying to perceive is in direct sunlight.";
    }

    Data drowMagic = new Data();
    public void setDrowMagic(Data drowMagic){
        drowMagic.abilName = "Drow Magic";
        drowMagic.subrace = "Dark Elf";
        drowMagic.dRace = "Elf";
        drowMagic.dlevel = 1;
        drowMagic.flavor = "You know the dancing lights cantrip. When you reach 3rd level, you can cast the faerie fire spell once per day. When you reach 5th level, you can also cast the darkness spell once per day. Charisma is your spellcasting ability for these spells.";
    }

    Data halflingTraits = new Data();
    public void setHalflingTraits(Data halflingTraits){
        halflingTraits.abilName = "Halfling Traits";
        dRace = "Halfling";
        dlevel = 0;
        int stats[] = {0,2,0,0,0,0};
        halflingTraits.statBoost = stats;
        halflingTraits.size = "Small";
        halflingTraits.speed = 25;
        halflingTraits.languages = "Halfling, Common";

    }

    Data halflingLuck = new Data();
    public void setHalflingLuck(Data halflingLuck){
        halflingLuck.abilName = "Lucky";
        halflingLuck.dRace = "Halfling";
        halflingLuck.dlevel = 0;
        halflingLuck.flavor = "Lucky. W hen you roll a 1 on an attack roll, ability check, or saving throw, you can reroll the die and must use the new roll.";
    }

    Data halflingBrave = new Data();
    public void setHalflingBrave(Data halflingBrave){
        halflingBrave.abilName = "Brave";
        halflingBrave.dRace = "Halfling";
        halflingBrave.dlevel = 0;
        halflingBrave.flavor = "Brave. You have advantage on saving throws against being frightened.";
    }

    Data halflingNimble = new Data();
    public void setHalflingNimble(Data halflingNimble){
        halflingNimble.abilName = "Halfling Nimbleness";
        halflingNimble.dRace = "Halfling";
        halflingNimble.dlevel = 0;
        halflingNimble.flavor = "You can move through the space of any creature that is of a size larger than yours.";
    }

    Data lightfootSubrace = new Data();
    public void setLightfootSubrace(Data lightfootSubrace){
        lightfootSubrace.abilName = "Lightfoot Features";
        lightfootSubrace.dlevel = 1;
        lightfootSubrace.subrace = "Lightfoot";
        lightfootSubrace.dRace = "Halfling";
        int stats[] = {0,0,0,0,0,1};
        lightfootSubrace.statBoost = stats;
        lightfootSubrace.flavor = "As a lightfoot halfling, you can easily hide from notice, even using other people as cover. You’re inclined to be affable and get along well with others. In the Forgotten Realms, lightfoot halflings have spread the farthest and thus are the most common variety.\n" +
                "Lightfoots are more prone to wanderlust than other halflings, and often dwell alongside other races or take up a nomadic life. In the world of Greyhawk, these halflings are called hairfeet or tallfellows.";
    }

    Data lightfootNaturallyStealthy = new Data();
    public void setLightfootNaturallyStealthy(Data lightfootNaturallyStealthy){
        lightfootNaturallyStealthy.abilName = "Naturally Stealthy";
        lightfootNaturallyStealthy.dRace = "Halfling";
        lightfootNaturallyStealthy.subrace = "LightFoot";
        lightfootNaturallyStealthy.dlevel = 1;
        lightfootNaturallyStealthy.flavor = "NaturallyStealthy. You can attempt to hide even when you are obscured only by a creature that is at least one size larger than you.";
    }

    Data stoutSubrace = new Data();
    public void setStoutSubrace(Data stoutSubrace){
        stoutSubrace.abilName = "Stout Features";
        stoutSubrace.dRace = "Halfling";
        stoutSubrace.subrace = "Stout";
        stoutSubrace.dlevel = 1;
        int stats[] = {0,0,1,0,0,0};
        stoutSubrace.flavor = "As a stout halfling, you’re hardier than average and have some resistance to poison. Some say that stouts have dwarven blood. In the Forgotten Realms, these halflings are called stronghearts, and they’re most common\n" +
                "in the south.";
    }

    Data stoutResilience = new Data();
    public void setStoutResilience(Data stoutResilience){
        stoutResilience.abilName = "Stout Resilience";
        stoutResilience.dRace = "Halfling";
        stoutResilience.subrace = "Stout";
        stoutResilience.dlevel = 1;
        stoutResilience.flavor = "Stout Resilience. You have advantage on saving throws against poison, and you have resistance against poison damage.";
    }

    Data humanTraits = new Data();
    public void setHumanTraits(Data humanTraits){
        humanTraits.abilName = "Human Traits";
        humanTraits.dRace = "Human";
        humanTraits.dlevel = 1;
        int stats[] = {1,1,1,1,1,1};
        humanTraits.statBoost = stats;
        humanTraits.size = "Medium";
        humanTraits.languages = "Common";
        humanTraits.misc1 = "Extra Language";
    }

    Data dragonbornTraits = new Data();
    public void setDragonbornTraits(Data dragonbornTraits){
        dragonbornTraits.abilName = "Dragonborn Traits";
        dragonbornTraits.dRace = "Dragonborn";
        dragonbornTraits.dlevel = 0;
        int stats[] = {2,0,0,0,0,1};
        dragonbornTraits.statBoost = stats;
        dragonbornTraits.size = "Medium";
        dragonbornTraits.speed = 30;
        dragonbornTraits.languages = "Common, Draconic";
        String anc[] = {"Black","Blue","Brass","Bronze","Copper","Gold","Green","Red","Silver","White"};
        dragonbornTraits.dragonAncestry = anc;
    }

    Data dragonbornDamageResistance = new Data();
    public void setDragonbornDamageResistance(Data dragonbornDamageResistance){
        dragonbornDamageResistance.abilName = "Damage Resistance";
        dragonbornDamageResistance.dRace = "Dragonborn";
        dragonbornDamageResistance.dlevel = 0;
        dragonbornDamageResistance.flavor = "Damage Resistance. You have resistance to the damage type associated with your draconic ancestry.";
    }


    Data dragonbornAncestry = new Data();
    public void setDragonbornAncestry(Data dragonbornAncestry){
        dragonbornAncestry.abilName = "Dragonborn Ancestry";
        dragonbornAncestry.dRace = "Dragonborn";
        dragonbornAncestry.dlevel = 0;
        dragonbornAncestry.flavor = "Draconic Ancestry. You have draconic ancestry. Choose one type of dragon from the Draconic Ancestry table. Your breath weapon and damage resistance are determined by the dragon type, as shown in the table.";
    }

    Data dragonbornBreathWeapon = new Data();
    public void setDragonbornBreathWeapon(Data dragonbornBreathWeapon){
        dragonbornBreathWeapon.abilName = "Breath Weapon";
        dragonbornBreathWeapon.dRace = "Dragonborn";
        dragonbornBreathWeapon.dlevel = 0;
        dragonbornBreathWeapon.flavor = "Breath Weapon. You can use your action to exhale destructive energy. Your draconic ancestry determines the size, shape, and damage type of the exhalation.\n" +
                "When you use your breath weapon, each creature in the area of the exhalation must make a saving throw, the type of which is determined by your draconic ancestry. The DC for this saving throw equals 8 +\n" +
                "your Constitution modifier + your proficiency bonus. A creature takes 2d6 damage on a failed save, and half as much damage on a successful one. The damage increases to 3d6 at 6th level, 4d6 at 11th level, and 5d6 at 16th level.\n" +
                "After you use your breath weapon, you can’t use it again until you complete a short or long rest.";
    }

    Data gnomeTraits = new Data();
    public void setGnomeTraits(Data gnomeTraits){
        gnomeTraits.abilName = "Gnome Traits";
        gnomeTraits.dRace = "Gnome";
        gnomeTraits.dlevel = 0;
        int stats[] = {0,0,0,2,0,0};
        gnomeTraits.statBoost = stats;
        gnomeTraits.size = "Small";
        gnomeTraits.speed = 25;
        gnomeTraits.languages = "Common, Gnomish";
    }

    Data gnomeVision = new Data();
    public void setGnomeVision(Data gnomeVision){
        gnomeVision.abilName = "Dark Vision";
        gnomeVision.dRace = "Gnome";
        gnomeVision.dlevel = 0;
        gnomeVision.flavor = "Darkvision. Accustomed to life underground, you have superior vision in dark and dim conditions. You can\n" +
                "see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can't discern color in darkness, only shades of gray.";
    }

    Data gnomeCunning = new Data();
    public void setGnomeCunning(Data gnomeCunning){
        gnomeCunning.abilName = "Gnome Cunning";
        gnomeCunning.dRace = "Gnome";
        gnomeCunning.dlevel = 0;
        gnomeCunning.flavor = "Gnome Cunning. You have advantage on all Intelligence, Wisdom, and Charisma saving throws against magic.";
    }

    Data forestGnomeSubrace = new Data();
    public void setForestGnomeSubrace(Data forestGnomeSubrace){
        forestGnomeSubrace.abilName = "Forest Gnome Subrace";
        forestGnomeSubrace.dRace = "Gnome";
        forestGnomeSubrace.subrace = "Forest Gnome";
        forestGnomeSubrace.dlevel = 1;
        int stats[] = {0,1,0,0,0,0};
        forestGnomeSubrace.statBoost = stats;
    }

    Data forestSpeakWithSmallBeasts = new Data();
    public void setForestSpeakWithSmallBeasts(Data forestSpeakWithSmallBeasts){
        forestSpeakWithSmallBeasts.abilName = "Speak with Small Beasts";
        forestSpeakWithSmallBeasts.dRace = "Gnome";
        forestSpeakWithSmallBeasts.subrace = "Forest Gnome";
        forestSpeakWithSmallBeasts.dlevel = 1;
        forestSpeakWithSmallBeasts.flavor = "Speak with SmallBeasts. Through sounds and\n" +
                "gestures, you can communicate simple ideas with Small or smaller beasts. Forest gnomes love animals and often keep squirrels, badgers, rabbits, moles, woodpeckers, and other creatures as beloved pets.\n";
    }

    Data forestNaturalIllusionist = new Data();
    public void setForestNaturalIllusionist(Data forestNaturalIllusionist){
        forestNaturalIllusionist.abilName = "Natural Illusionist";
        forestNaturalIllusionist.dRace = "Gnome";
        forestNaturalIllusionist.subrace = "Forest Gnome";
        forestNaturalIllusionist.dlevel = 1;
        forestNaturalIllusionist.flavor = "NaturalIllusionist. You know the minor illusion cantrip. Intelligence is your spellcasting ability for it.";
    }

    Data rockGnomeSubRace = new Data();
    public void setRockGnomeSubRace(Data rockGnomeSubRace){
        rockGnomeSubRace.abilName = "Rock Gnome Subrace";
        rockGnomeSubRace.dRace = "Gnome";
        rockGnomeSubRace.dlevel = 1;
        int stats[] = {0,0,1,0,0,0};
        rockGnomeSubRace.statBoost = stats;
    }

    Data rockArtificerLore = new Data();
    public void setRockArtificerLore(Data rockArtificerLore){
        rockArtificerLore.abilName = "Artificer Lore";
        rockArtificerLore.dRace = "Gnome";
        rockArtificerLore.subrace = "Rock Gnome";
        rockArtificerLore.dlevel = 1;
        rockArtificerLore.flavor = "Artificer’s Lore. Whenever you make an Intelligence (History) check related to magic items, alchemical objects, or technological devices, you can add twice your proficiency bonus, instead of any proficiency bonus you normally apply.";
    }

    Data rockTinker = new Data();
    public void setRockTinker(Data rockTinker){
        rockTinker.abilName = "Tinker";
        rockTinker.dRace = "Gnome";
        rockTinker.subrace = "Rock Gnome";
        rockTinker.dlevel = 1;
        rockTinker.flavor = "Tinker. You have proficiency with artisan’s tools (tinker’s tools). Using those tools, you can spend 1\n" +
                "hour and 10 gp worth of materials to construct a Tiny clockwork device (AC 5, 1 hp). The device ceases\n" +
                "to function after 24 hours (unless you spend 1 hour repairing it to keep the device functioning), or when you use your action to dismantle it; at that time, you can reclaim the materials used to create it. You can have up to three such devices active at a time.";
    }

    Data halfElfTraits = new Data();
    public void setHalfElfTraits(Data halfElfTraits){
        halfElfTraits.abilName = "Half Elf Traits";
        halfElfTraits.dRace = "Half Elf";
        halfElfTraits.dlevel = 0;
        int stats[] = {0,0,0,0,0,2}; //Get an addional +1 to any of these...
        halfElfTraits.statBoost = stats;
        halfElfTraits.size = "Medium";
        halfElfTraits.speed = 30;
        halfElfTraits.languages = "Common, Elvish";
        halfElfTraits.misc2 = "Extra Language";
    }

    Data halfelfVision = new Data();
    public void setHalfelfVision(Data halfelfVision){
        halfelfVision.abilName = "Dark Vision";
        halfelfVision.dRace = "Elf";
        halfelfVision.dlevel = 0;
        halfelfVision.flavor = "Darkvision. Thanks to your elf blood, you have superior vision in dark and dim conditions. You can\n" +
                "see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.";
    }

    Data halfelfAncestry = new Data();
    public void setHalfelfAncestry(Data halfelfAncestry){
        halfelfAncestry.abilName = "Fey Ancestry";
        halfelfAncestry.dRace = "Elf";
        halfelfAncestry.dlevel = 0;
        halfelfAncestry.flavor = "Fey Ancestry. You have advantage on saving throws against being charmed, and magic can’t put you to sleep.";
    }

    Data halfelfskills = new Data();
    public void setHalfelfskills(Data halfelfskills){
        halfelfskills.abilName = "Skill Versatility";
        halfelfskills.dRace = "Elf";
        halfelfskills.dlevel = 0;
        halfelfskills.flavor = "Skill Versatility. You gain proficiency in two skills of your choice.";
    }

    Data halforcTraits = new Data();
    public void setHalforcTraits(Data halforcTraits){
        halforcTraits.abilName = "Halforc Traits";
        halforcTraits.dRace = "Halforc";
        halforcTraits.dlevel = 0;
        int stats[] = {2,0,1,0,0,0};
        halforcTraits.statBoost = stats;
        halforcTraits.size = "Medium";
        halforcTraits.speed = 30;
        //Skills alphabetically: Acrobatics, Animal Handling, Arcana, Athletics, Deception, History, Insight, Intimidation,Investigation, Medicine, Nature, Perception, Performance, Persuasion, Religion, Sleight of Hand, Stealth, Survival.
        boolean raceSkills[] = {false,false,false,false,false,false,false,true,false,false,false,false,false,false,false,false,false,false};
        halforcTraits.raceSkills = raceSkills;
        halforcTraits.languages = "Common, Orc";
    }

    Data halforcvision = new Data();
    public void setHalforcvision(Data halforcvision){
        halforcvision.abilName = "Dark Vision";
        halforcvision.dRace = "Half Orc";
        halforcvision.dlevel = 0;
        halforcvision.flavor = "Darkvision. Thanks to your orc blood, you have superior vision in dark and dim conditions. You can\n" +
                "see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can't discern color in darkness, only shades of gray.";
    }

    Data helforcMenacing = new Data();
    public void sethalforcMenacing(Data helforcMenacing){
        helforcMenacing.abilName = "Menacing";
        helforcMenacing.dRace = "Half Orc";
        helforcMenacing.dlevel = 0;
        helforcMenacing.flavor =  "Menacing. You gain proficiency in the Intimidation skill.";
    }

    Data halforcRelesntlessEndurance = new Data();
    public void setHalforcRelesntlessEndurance(Data halforcRelesntlessEndurance){
        halforcRelesntlessEndurance.abilName = "Relentless Endurance";
        halforcRelesntlessEndurance.dRace = "Half Orc";
        halforcRelesntlessEndurance.dlevel = 0;
        halforcRelesntlessEndurance.flavor =  "RelentlessEndurance.When you are reduced to\n" +
                "0 hit points but not killed outright, you can drop to 1 hit point instead. You can’t use this feature again until you finish a long rest.";
    }

    Data halforcSavageAttacks = new Data();
    public void setHalforcSavageAttacks(Data halforcSavageAttacks){
        halforcSavageAttacks.abilName = "Savage Attacks";
        halforcSavageAttacks.dRace = "Half Orc";
        halforcSavageAttacks.dlevel = 0;
        halforcSavageAttacks.flavor =  "Savage Attacks. When you score a critical hit with\n" +
                "a melee weapon attack, you can roll one of the weapon’s damage dice one additional time and add it to the extra damage of the critical hit.";
    }


    Data teiflingTraits = new Data();
    public void setTeiflingTraits(Data teiflingTraits){
        teiflingTraits.abilName = "Teifling Traits";
        teiflingTraits.dRace = "Teifling";
        teiflingTraits.dlevel = 0;
        int stats[] = {0,0,0,1,0,1};
        teiflingTraits.statBoost = stats;
        teiflingTraits.size = "Medium";
        teiflingTraits.speed = 30;
        teiflingTraits.languages = "Common, Infernal";
    }

    Data tieflingVision = new Data();
    public void setTieflingVision(Data tieflingVision){
        tieflingVision.abilName = "Darkvision";
        tieflingVision.dRace = "Tiefling";
        tieflingVision.dlevel = 0;
        tieflingVision.flavor =  "Darkvision. Thanks to your infernal heritage, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.";
    }

    Data tieflingHellishResistance = new Data();
    public void setTieflingHellishResistance(Data tieflingHellishResistance){
        tieflingHellishResistance.abilName = "Hellish Resistance";
        tieflingHellishResistance.dRace = "Tiefling";
        tieflingHellishResistance.dlevel = 0;
        tieflingHellishResistance.flavor =  "Hellish Resistance. You have resistance to fire damage.";
    }

    Data tieflingInfernalLegacy = new Data();
    public void setTieflingInfernalLegacy(Data tieflingInfernalLegacy){
        tieflingInfernalLegacy.abilName = "Infernal Legacy";
        tieflingInfernalLegacy.dRace = "Tiefling";
        tieflingInfernalLegacy.dlevel = 0;
        tieflingInfernalLegacy.flavor =  "Infernal Legacy. You know the thaumaturgy cantrip. Once you reach 3rd level, you can cast the hellish rebuke spell once per day as a 2nd-level spell. Once you reach 5th level, you can also cast the darkness spell once per day. Charisma is your spellcasting ability for these spells.";
    }

    //This method returns all the race data
    public ArrayList<Data> getRd() {
        setAbility1(ability1); //Be sure to set all abilities first
        rd.add(ability1);//Then add them to the Arraylist

        setDwarfTraits(dwarfTraits); //1
        rd.add(dwarfTraits);

        setHillDwarfStatBoost(hillDwarfSubrace); //2
        rd.add(hillDwarfSubrace);

        setHilldwarfDwarvenToughness(hilldwarfDwarvenToughness);
        rd.add(hilldwarfDwarvenToughness);

        setMountianDwarfStatBoost(mountianDwarfSubrace); //3
        rd.add(mountianDwarfSubrace);

        setDwarfVision(dwarfVision);
        rd.add(dwarfVision);

        setDwarfResistance(dwarfResistance);
        rd.add(dwarfResistance);

        setElfTraits(elfTraits); //4
        rd.add(elfTraits);

        setElfResistance(elfResistance);
        rd.add(elfResistance);

        setElfVision(elfVision);
        rd.add(elfVision);

        setElfTrance(elfTrance);
        rd.add(elfTrance);

        setHighElfSubrace(highElfSubrace); //5
        rd.add(highElfSubrace);

        setWoodElfSubrace(woodElfSubrace);//6
        rd.add(woodElfSubrace);

        setWoodElfMaskofTheWild(woodElfMaskofTheWild);
        rd.add(woodElfMaskofTheWild);

        setDarkElfSubrace(darkElfSubrace);//7
        rd.add(darkElfSubrace);

        setDarkElfVision(darkElfVision);
        rd.add(darkElfVision);

        setDrowMagic(drowMagic);
        rd.add(drowMagic);

        setSunlightSensitivity(sunlightSensitivity);
        rd.add(sunlightSensitivity);

        setHalflingTraits(halflingTraits);//8
        rd.add(halflingTraits);

        setHalflingBrave(halflingBrave);
        rd.add(halflingBrave);

        setHalflingLuck(halflingLuck);
        rd.add(halflingLuck);

        setHalflingNimble(halflingNimble);
        rd.add(halflingNimble);

        setLightfootNaturallyStealthy(lightfootNaturallyStealthy);
        rd.add(lightfootNaturallyStealthy);

        setLightfootSubrace(lightfootSubrace);//9
        rd.add(lightfootSubrace);

        setStoutSubrace(stoutSubrace);//10
        rd.add(stoutSubrace);

        setStoutResilience(stoutResilience);
        rd.add(stoutResilience);

        setHumanTraits(humanTraits);//11
        rd.add(humanTraits);

        setDragonbornTraits(dragonbornTraits);//12
        rd.add(dragonbornTraits);

        setDragonbornAncestry(dragonbornAncestry);
        rd.add(dragonbornAncestry);

        setDragonbornBreathWeapon(dragonbornBreathWeapon);
        rd.add(dragonbornBreathWeapon);

        setDragonbornDamageResistance(dragonbornDamageResistance);
        rd.add(dragonbornDamageResistance);

        setGnomeTraits(gnomeTraits);//13
        rd.add(gnomeTraits);

        setGnomeCunning(gnomeCunning);
        rd.add(gnomeCunning);

        setGnomeVision(gnomeVision);
        rd.add(gnomeVision);

        setForestGnomeSubrace(forestGnomeSubrace);//14
        rd.add(forestGnomeSubrace);

        setForestNaturalIllusionist(forestNaturalIllusionist);
        rd.add(forestNaturalIllusionist);

        setForestSpeakWithSmallBeasts(forestSpeakWithSmallBeasts);
        rd.add(forestSpeakWithSmallBeasts);

        setRockGnomeSubRace(rockGnomeSubRace);//15
        rd.add(rockGnomeSubRace);

        setRockArtificerLore(rockArtificerLore);
        rd.add(rockArtificerLore);

        setRockTinker(rockTinker);
        rd.add(rockTinker);

        setHalfElfTraits(halflingTraits);//18
        rd.add(halfElfTraits);

        setHalfelfAncestry(halfelfAncestry);
        rd.add(halfelfAncestry);

        setHalfelfVision(halfelfVision);
        rd.add(halfelfVision);

        setHalfelfskills(halfelfskills);
        rd.add(halfelfskills);

        setHalforcTraits(halforcTraits);//16
        rd.add(halforcTraits);

        sethalforcMenacing(helforcMenacing);
        rd.add(helforcMenacing);

        setHalforcRelesntlessEndurance(halforcRelesntlessEndurance);
        rd.add(halforcRelesntlessEndurance);

        setHalforcvision(halforcvision);
        rd.add(halforcvision);

        setHalforcSavageAttacks(halforcSavageAttacks);
        rd.add(halforcSavageAttacks);

        setTeiflingTraits(teiflingTraits);//17
        rd.add(teiflingTraits);

        setTieflingHellishResistance(tieflingHellishResistance);
        rd.add(tieflingHellishResistance);

        setTieflingVision(tieflingVision);
        rd.add(tieflingVision);

        setTieflingInfernalLegacy(tieflingInfernalLegacy);
        rd.add(tieflingInfernalLegacy);

        return rd;
    }
}
