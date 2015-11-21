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
    String duration;
    String components;
    String dragonAncestry[];
    String castTime;
    String school;
    String backgroundType;
    boolean chaClassSkills[];
    boolean backgroundSkills[];
    boolean raceSkills[];
    boolean savingThrows[]; // {str,dex,con,int,wis,cha}
    boolean spells[];//which classes are proficient in the spell.
    String save1; //saving throw 1
    String save2; //savomg throw 2
    boolean has; //character has this data object
    boolean prof; //character is proficient in this
    String range;
    int spellLevel;
    int startGold;
    int speed; //the speed of the character by race.
    int extraCantrips; //some races get an additional cantrip.
    int dlevel; //what level the player gets this
    int hitdie; //hp at level one is always 1 hit die + Constitiution modifier.
    int numHitDie; //number of hit dice the player has (should be = to level)
    int numclassSkills;
    String cDomain[];
    int invocations[];
    int profbonus[]; //19 index long (20 for 20 levels) holds the prof bonus for that level.
    int statBoost[]; //{str,dex,con,int,wis,cha} any ability modifier
    int classPoints[]; //rage, ki, sorcery points.
    int ragedamage[];
    int sneakDice[];
    int mArts[];
    int knownCantrips[];
    int knownSpells[];
    int spellslots1[];
    int spellslots2[];
    int spellslots3[];
    int spellslots4[];
    int spellslots5[];
    int spellslots6[];
    int spellslots7[];
    int spellslots8[];
    int spellslots9[];

}
