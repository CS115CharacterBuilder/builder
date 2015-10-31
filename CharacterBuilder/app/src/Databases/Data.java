package Databases;
import java.util.*;
/**
 * Created by AndrewMiller on 10/29/15.
 */
public class Data {
    String abilName; //The ability name
    String dClass; //character class
    String dRace; //character race
    String flavor; //the flavor text for the thing
    String size; //the size of the character by race
    String vision; //the type of eye sight the character has
    String resistance; //any resistances the character has.
    String weaponProf; //any weapon proficiencies the character gets from race.
    String toolProf; //tool prof from race.
    String armorProf; //armor...
    String skillProf; //Skills proficient (this will need to be searched and applied to proficiences the charcter has on creation.)
    String languages; //any languagese.
    String extraCantripsByName; //if there is a spell gained by name.
    String misc1; //other stuff
    String misc2;
    String dragonAncestry[];
    boolean has; //character has this data object
    boolean prof; //character is proficient in this
    int statBoost[]; //{str,dex,con,int,wis,cha} any ability modifier
    int speed; //the speed of the character by race.
    int extraCantrips; //some races get an additional cantrip.
    int dlevel; //what level the player gets this
}
