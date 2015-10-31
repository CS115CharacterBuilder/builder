package Databases;
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
        hillDwarfSubrace.abilName = "Hill Dwarf Subrace";
        hillDwarfSubrace.dlevel = 1;
        hillDwarfSubrace.dRace = "Dwarf";
        int stats[] = {0,0,0,0,1,0};
        hillDwarfSubrace.statBoost = stats;
        hillDwarfSubrace.misc1 = "Dwarven Toughness. Your hit point maximum increases by 1, and it increases by 1 every time you gain a level.";
    }

    Data mountianDwarfSubrace = new Data();
    public void setMountianDwarfStatBoost(Data mountianDwarfSubrace){
        mountianDwarfSubrace.abilName = "Mountian Dwarf Subrace";
        mountianDwarfSubrace.dlevel = 1;
        mountianDwarfSubrace.dRace = "Dwarf";
        int stats[] = {2,0,0,0,0,0};
        mountianDwarfSubrace.statBoost = stats;
        mountianDwarfSubrace.armorProf = "Light Armor, Medium Armor";
    }

    Data dwarfTraits = new Data();
    public void setDwarfTraits(Data dwarfTraits) {
        dwarfTraits.abilName = "Dwarven Traits";
        dwarfTraits.dRace = "Dwarf";
        dwarfTraits.dlevel = 1;
        int stats[] = {0, 0, 2, 0, 0, 0};
        dwarfTraits.statBoost = stats;
        dwarfTraits.size = "Medium";
        dwarfTraits.speed = 25;
        dwarfTraits.vision = "Dark Vision:Accustomed to life underground, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.";
        dwarfTraits.resistance = "Poison. Save vs. Poison. Resistant to poison damage.";
        dwarfTraits.weaponProf = "Battleaxe, Handaxe, Throwing Hammer, War Hammer";
        dwarfTraits.toolProf =  "Smith Tools, Brewers Supplies, Mason's Tools";
        dwarfTraits.languages = "Common, Dwarvish";
    }

    Data elfTraits = new Data();
    public void setElfTraits(Data elfTraits){
        elfTraits.abilName = "Elf Traits";
        elfTraits.dlevel = 1;
        elfTraits.dRace = "Elf";
        int stats[] = {0,2,0,0,0,0};
        elfTraits.statBoost = stats;
        elfTraits.size = "Medium";
        elfTraits.speed = 30;
        elfTraits.vision = "Dark Vision: Dark Vision:Accustomed to life underground, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.";
        elfTraits.skillProf = "Perception";
        elfTraits.resistance = "Charm. Advantage on save vs charm. Can not be put to sleep.";
        elfTraits.misc1 = "Trance.Elvesdon’tneedtosleep.Instead,they meditate deeply, remaining semiconscious, for 4\n" +
                "hours a day. (The Common word for such meditation\n" +
                "is “trance.”) While meditating, you can dream after a fashion; such dreams are actually mental exercises that have become reflexive through years of practice. After resting in this way, you gain the same benefit that a human does from 8 hours of sleep.";
        elfTraits.languages = "Common, Elvish";
    }

    Data highElfSubrace = new Data();
    public void setHighElfSubrace(Data highElfSubrace){
        highElfSubrace.abilName = "High Elf Subrace";
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
        woodElfSubrace.dRace = "Elf";
        woodElfSubrace.dlevel = 1;
        int stats[] = {0,0,0,0,1,0};
        woodElfSubrace.statBoost = stats;
        woodElfSubrace.speed = 35;
        woodElfSubrace.weaponProf = "Longsword, Shortsword, Shortbow, Longbow";
        woodElfSubrace.misc1 = "Mask of the Wild. You can attempt to hide even when you are only lightly obscured by foliage, heavy rain, falling snow, mist and other natural phenomena.";
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

    Data halflingTraits = new Data();
    public void setHalflingTraits(Data halflingTraits){
        halflingTraits.abilName = "Halfling Traits";
        dRace = "Halfling";
        dlevel = 1;
        int stats[] = {0,2,0,0,0,0};
        halflingTraits.statBoost = stats;
        halflingTraits.size = "Small";
        halflingTraits.speed = 25;
        halflingTraits.misc1 = "Lucky. When you roll a 1 on an attack roll, abiliy check, or saving throw, you can reroll the die and must use the new roll.";
        halflingTraits.resistance = "Brave. You have advantage on saving throws against being frightened.";
        halflingTraits.misc2 = "Halfling Nimbleness. You can move through the space of any creature that is of a size larger than yours.";
        halflingTraits.languages = "Halfling, Common";
    }
    Data lightfootSubrace = new Data();
    public void setLightfootSubrace(Data lightfootSubrace){
        lightfootSubrace.abilName = "Lightfoot Subrace";
        lightfootSubrace.dlevel = 1;
        lightfootSubrace.dRace = "Halfling";
        int stats[] = {0,0,0,0,0,1};
        lightfootSubrace.statBoost = stats;
        lightfootSubrace.misc1 = "Naturally Stealthy. You can attempt to hide even when you are obscured only by a creature that is atleast one size larger than you.";
    }

    Data stoutSubrace = new Data();
    public void setStoutSubrace(Data stoutSubrace){
        stoutSubrace.abilName = "Stout Subrace";
        stoutSubrace.dRace = "Halfling";
        stoutSubrace.dlevel = 1;
        int stats[] = {0,0,1,0,0,0};
        stoutSubrace.resistance = "Stout Resiliance. You have advantage on saving throws against poison, and you have resistance against poison damage";
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
        dragonbornTraits.dlevel = 1;
        int stats[] = {2,0,0,0,0,1};
        dragonbornTraits.statBoost = stats;
        dragonbornTraits.size = "Medium";
        dragonbornTraits.speed = 30;
        dragonbornTraits.resistance = "Damage Resistance. You have resistance to the damage type associated with your draconic ancestry.";
        dragonbornTraits.languages = "Common, Draconic";
        String anc[] = {"Black","Blue","Brass","Bronze","Copper","Gold","Green","Red","Silver","White"};
        dragonbornTraits.dragonAncestry = anc;
        dragonbornTraits.misc1 = "Breath Weapon. You can use your action to exhale destructive energy. Your draconic ancestry determines the size, shape, and damage type of the exhalation.\n" +
                "When you use your breath weapon, each creature in the area of the exhalation must make a saving throw, the type of which is determined by your draconic ancestry. The DC for this saving throw equals 8 +\n" +
                "your Constitution modifier + your proficiency bonus. A creature takes 2d6 damage on a failed save, and half as much damage on a successful one. The damage increases to 3d6 at 6th level, 4d6 at 11th level, and 5d6 at 16th level. After you use your breath weapon, you can’t use it again until you complete a short or long rest.";

    }

    Data gnomeTraits = new Data();
    public void setGnomeTraits(Data gnomeTraits){
        gnomeTraits.abilName = "Gnome Traits";
        gnomeTraits.dRace = "Gnome";
        gnomeTraits.dlevel = 1;
        int stats[] = {0,0,0,2,0,0};
        gnomeTraits.statBoost = stats;
        gnomeTraits.size = "Small";
        gnomeTraits.speed = 25;
        gnomeTraits.vision = "Darkvision. Accustomed to life underground, you have superior vision in dark and dim conditions. You can\n" +
                "see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can't discern color in darkness, only shades of gray.";
        gnomeTraits.resistance = "Gnome Cunning. You have advantage on all Intelligence, Wisdom, and Charisma saving throws against magic.";
        gnomeTraits.languages = "Common, Gnomish";
    }

    Data forestGnomeSubrace = new Data();
    public void setForestGnomeSubrace(Data forestGnomeSubrace){
        forestGnomeSubrace.abilName = "Forest Gnome Subrace";
        forestGnomeSubrace.dRace = "Gnome";
        forestGnomeSubrace.dlevel = 1;
        int stats[] = {0,1,0,0,0,0};
        forestGnomeSubrace.statBoost = stats;
        forestGnomeSubrace.extraCantripsByName = "Minor Illusion";
        forestGnomeSubrace.misc1 = "Speak with SmallBeasts. Through sounds and\n" +
                "gestures, you can communicate simple ideas with Small or smaller beasts. Forest gnomes love animals and often keep squirrels, badgers, rabbits, moles, woodpeckers, and other creatures as beloved pets.";
    }

    Data rockGnomeSubRace = new Data();
    public void setRockGnomeSubRace(Data rockGnomeSubRace){
        rockGnomeSubRace.abilName = "Rock Gnome Subrace";
        rockGnomeSubRace.dRace = "Gnome";
        rockGnomeSubRace.dlevel = 1;
        int stats[] = {0,0,1,0,0,0};
        rockGnomeSubRace.statBoost = stats;
        rockGnomeSubRace.misc1 = "Whenever you make an Intelligence (History) check related to magic items, alchemical objects, or technological devices, you can add twice your proficiency bonus, instead of any proficiency bonus you normally apply.";
        rockGnomeSubRace.misc2 = "Tinker. You have proficiency with artisan’s tools (tinker’s tools). Using those tools, you can spend 1\n" +
                "hour and 10 gp worth of materials to construct a Tiny clockwork device (AC 5, 1 hp). The device ceases\n" +
                "to function after 24 hours (unless you spend 1 hour repairing it to keep the device functioning), or when you use your action to dismantle it; at that time, you can reclaim the materials used to create it. You can have up to three such devices active at a time.";
    }

    Data halfElfTraits = new Data();
    public void setHalfElfTraits(Data halfElfTraits){
        halfElfTraits.abilName = "Half Elf Traits";
        halfElfTraits.dRace = "Half Elf";
        halfElfTraits.dlevel = 1;
        int stats[] = {0,0,0,0,0,2}; //Get an addional +1 to any of these...
        halfElfTraits.statBoost = stats;
        halfElfTraits.size = "Medium";
        halfElfTraits.speed = 30;
        halfElfTraits.vision = "Darkvision. Thanks to your elf blood, you have superior vision in dark and dim conditions. You can\n" +
                "see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.";
        halfElfTraits.resistance = "FeyAncestry. You have advantage on saving throws against being charmed, and magic can’t put you to sleep.";
        halfElfTraits.misc1 = "Skill Versatility. You gain proficiency in two skills of your choice.";
        halfElfTraits.languages = "Common, Elvish";
        halfElfTraits.misc2 = "Extra Language";
    }

    Data halforcTraits = new Data();
    public void setHalforcTraits(Data halforcTraits){
        halforcTraits.abilName = "Halforc Traits";
        halforcTraits.dRace = "Halforc";
        halforcTraits.dlevel = 1;
        int stats[] = {2,0,1,0,0,0};
        halforcTraits.statBoost = stats;
        halforcTraits.size = "Medium";
        halforcTraits.speed = 30;
        halforcTraits.vision = "Darkvision. Thanks to your orc blood, you have superior vision in dark and dim conditions. You can\n" +
                "see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can't discern color in darkness, only shades of gray.\n";
        halforcTraits.misc1 = "Menacing. You gain proficiency in the Intimidation skill.";
        halforcTraits.resistance = "RelentlessEndurance.When you are reduced to\n" +
                "0 hit points but not killed outright, you can drop to 1 hit point instead. You can’t use this feature again until you finish a long rest.";
        halforcTraits.misc2 = "SavageAttacks. When you score a critical hit with\n" +
                "a melee weapon attack, you can roll one of the weapon’s damage dice one additional time and add it to the extra damage of the critical hit.";
        halforcTraits.languages = "Common, Orc";
    }

    Data teiflingTraits = new Data();
    public void setTeiflingTraits(Data teiflingTraits){
        teiflingTraits.abilName = "Teifling Traits";
        teiflingTraits.dRace = "Teifling";
        teiflingTraits.dlevel = 1;
        int stats[] = {0,0,0,1,0,1};
        teiflingTraits.statBoost = stats;
        teiflingTraits.size = "Medium";
        teiflingTraits.speed = 30;
        teiflingTraits.vision = "Darkvision. Thanks to your infernal heritage, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.";
        teiflingTraits.resistance = "Hellish Resistance. You have resistance to fire damage.";
        teiflingTraits.extraCantripsByName = "Thaumaturgy";
        teiflingTraits.languages = "Common, Infernal";
    }


    //This method returns all the race data
    public ArrayList<Data> getRd() {
        setAbility1(ability1); //Be sure to set all abilities first
        rd.add(ability1);//Then add them to the Arraylist

        setDwarfTraits(dwarfTraits); //1
        rd.add(dwarfTraits);

        setHillDwarfStatBoost(hillDwarfSubrace); //2
        rd.add(hillDwarfSubrace);

        setMountianDwarfStatBoost(mountianDwarfSubrace); //3
        rd.add(mountianDwarfSubrace);

        setElfTraits(elfTraits); //4
        rd.add(elfTraits);

        setHighElfSubrace(highElfSubrace); //5
        rd.add(highElfSubrace);

        setWoodElfSubrace(woodElfSubrace);//6
        rd.add(woodElfSubrace);

        setDarkElfSubrace(darkElfSubrace);//7
        rd.add(darkElfSubrace);

        setHalflingTraits(halflingTraits);//8
        rd.add(halflingTraits);

        setLightfootSubrace(lightfootSubrace);//9
        rd.add(lightfootSubrace);

        setStoutSubrace(stoutSubrace);//10
        rd.add(stoutSubrace);

        setHumanTraits(humanTraits);//11
        rd.add(humanTraits);

        setDragonbornTraits(dragonbornTraits);//12
        rd.add(dragonbornTraits);

        setGnomeTraits(gnomeTraits);//13
        rd.add(gnomeTraits);

        setForestGnomeSubrace(forestGnomeSubrace);//14
        rd.add(forestGnomeSubrace);

        setRockGnomeSubRace(rockGnomeSubRace);//15
        rd.add(rockGnomeSubRace);

        setHalforcTraits(halforcTraits);//16
        rd.add(halforcTraits);

        setTeiflingTraits(teiflingTraits);//17
        rd.add(teiflingTraits);

        setHalfElfTraits(halflingTraits);//18
        rd.add(halfElfTraits);

        return rd;
    }
}
