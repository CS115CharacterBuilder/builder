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
    public void setAbility1() { //populate it
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
    public void setHillDwarfStatBoost(){
        hillDwarfSubrace.abilName = "Hill Dwarf Ability Score Increase";
        int stats[] = {0,0,0,0,1,0};
        hillDwarfSubrace.statBoost = stats;
        hillDwarfSubrace.misc1 = "Dwarven Toughness. Your hit point maximum increases by 1, and it increases by 1 every time you gain a level.";
    }

    Data mountianDwarfSubrace = new Data();
    public void setMountianDwarfStatBoost(){
        mountianDwarfSubrace.abilName = "Mountian Dwarf Ability Score Increase";
        int stats[] = {0,0,0,0,1,0};
        mountianDwarfSubrace.statBoost = stats;
        mountianDwarfSubrace.armorProf = "Light Armor, Medium Armor";
    }

    Data dwarfTraits = new Data();
    public void setDwarfTraits() {
        dwarfTraits.abilName = "Dwarven Traits";
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

    //This method returns all the race data
    public ArrayList<Data> getRd(){
        setAbility1(); //Be sure to set all abilities first
        rd.add(ability1);//Then add them to the Arraylist

        setHillDwarfStatBoost();
        rd.add(hillDwarfSubrace);

        setMountianDwarfStatBoost();
        rd.add(mountianDwarfSubrace);

        setDwarfTraits();
        rd.add(dwarfTraits);


        return rd;
    }
}
