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

    //This method returns all the race data
    public ArrayList<Data> getRd() {
        setAbility1(ability1); //Be sure to set all abilities first
        rd.add(ability1);//Then add them to the Arraylist
        return rd;
    }
}
