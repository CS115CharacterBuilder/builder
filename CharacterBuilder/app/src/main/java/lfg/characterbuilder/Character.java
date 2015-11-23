package lfg.characterbuilder;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Alex on 10/12/2015.
 */
public class Character implements Parcelable {

    private String unique_id;
    private String name;
    private String race;
    private String subrace;
    private String class_name;
    private int photoId;
    //items page info
    private int copper_held;
    private int silver_held;
    private int gold_held;
    private String[] items_held;
    private String[] items_description;
    //background page info
    private String background_type;
    private String background_alignment;
    private String background_deity;
    //stats page info
    private int level;
    private int classpoints;
    /*stats follow the following format: (Strength, Dex, Constitution, Int, Wis, Char, Proficiency,
    Initiative, Speed, Perception, Hit Dice number, Hit Dice type, Current HP, Total HP
    Temoporary HP)
     */
    private int[] stats;

    //abilities page info
    private boolean[] skillproficiencies;
    //equipment page info
    private String[] proficiencies;
    private String[] m_weapons_held;
    private String[] m_weapons_bonus;
    private String[] m_weapons_damage;
    private String[] r_weapons_held;
    private String[] r_weapons_bonus;
    private String[] r_weapons_damage;
    private int[] r_weapons_ammo;
    private String[] r_weapons_range;
    //spell page info
    private String[] known_spells;
    private String[] equipped_spells;


    //Constructor for Character Object
    Character(String unique_id, String char_name, String char_class, int char_photoId) {
        this.unique_id = unique_id;
        this.name = char_name;
        this.class_name = char_class;
        this.photoId = char_photoId;
        this.stats = new int[16];
        for(int i = 0; i < stats.length; i++) {
            stats[i] = 666;
        }

    }

    //Parcel Constructor Allows Object to be passed
    public Character(Parcel in){
        String[] data = new String[4];

        in.readStringArray(data);
        this.unique_id = data[0];
        this.name = data[1];
        this.class_name = data[2];
        this.photoId = Integer.parseInt(data[3]);

    }

    @Override
    public int describeContents() {
        //TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags){
        //TODO Auto-generated method stub
        dest.writeStringArray(new String[]{this.unique_id,this.name,this.class_name,String.valueOf(this.photoId)});
    }

    public static final Parcelable.Creator<Character> CREATOR = new Parcelable.Creator<Character>() {
        @Override
        public Character createFromParcel(Parcel source) {
            //TODO Auto-generated method stub
            return new Character(source);
        }

        @Override
        public Character[] newArray(int size) {
            //TODO Auto-generated method stub
            return new Character[size];
        }
    };

    //Standard Accessors and Mutator Functions
    public String getUnique_id(){ return this.unique_id;}

    public String getCharacterName() { return this.name; }

    public String getCharacterClass() { return this.class_name;}

    public String getCharacterRace() { return this.race; }

    public int getPhotoId() { return this.photoId; }

    public String getCharacterSubRace() { return this.subrace; }

    public int getCopper() { return this.copper_held; }

    public int getSilver() { return this.silver_held; }

    public int getGold() { return this.gold_held; }

    public String[] getItemNames() {return this.items_held; }

    public String[] getItemDescriptions() {return this.items_description; }

    public String getType() {return this.background_type; }

    public String getAlignment() {return this.background_alignment; }

    public String getDeity() { return this.background_deity; }

    public int getLevel () { return this.level; }

    public int getClassPoints() { return this.classpoints; }

    public int[] getStats() { return this.stats; }

    public boolean[] getSkillproficiencies() { return this.skillproficiencies; }

    public String[] getProficiencies() { return this.proficiencies; }

    public String[] getmWeapons() { return this.m_weapons_held; }

    public String[] getmWeaponBonus() { return this.m_weapons_bonus; }

    public String[] getmWeaponDamage() { return this.m_weapons_damage; }

    public String[] getrWeapons() { return this.r_weapons_held; }

    public String[] getrWeaponBonus() { return this.r_weapons_bonus; }

    public String[] getrWeaponDamage() { return this.r_weapons_damage; }

    public int[] getrWeaponAmmo() { return this.r_weapons_ammo;}

    public String[] getrWeaponRange() { return this.r_weapons_range;}

    public String[] getKnownSpells() { return this.known_spells;}

    public String[] getEquipped_spells() { return this.equipped_spells; }




    public void setCharacterName(String new_name){
        this.name = new_name;
    }

    public void setCharacterClass(String new_class) { this.class_name = new_class;
    }

    public void setCharacterRace(String new_race) { this.race = new_race; }

    public void setPhotoId(int new_photoId) {
        this.photoId = new_photoId;
    }

    public void setCharacterSubRace( String newSubrace) { this.subrace = newSubrace; }

    public void setCopper(int newCopper) { this.copper_held = newCopper; }

    public void setSilver(int newSilver) { this.silver_held = newSilver; }

    public void setGold(int newGold) { this.gold_held = newGold; }

    public void setItemNames(String[] newItems) {this.items_held = newItems; }

    public void setItemDescriptions(String[] newItemDescriptions) {this.items_description = newItemDescriptions; }

    public void setType(String newType) {this.background_type = newType; }

    public void setAlignment(String newAlignment) {this.background_alignment = newAlignment; }

    public void setDeity(String newDeity) { this.background_deity = newDeity; }

    public void setLevel (int newLevel) { this.level = newLevel; }

    public void setClassPoints(int newClassPoints) { this.classpoints = newClassPoints; }

    public void setStats(int[] newStats) { this.stats = newStats; }

    public void setSkillproficiencies(boolean[] newSkillProficiencies) { this.skillproficiencies = newSkillProficiencies; }

    public void setProficiencies(String[] newProficiencies) { this.proficiencies = newProficiencies; }

    public void setmWeapons(String[] newmWeapons) { this.m_weapons_held = newmWeapons; }

    public void setmWeaponBonus(String[] newmWeaponBonus) { this.m_weapons_bonus = newmWeaponBonus; }

    public void setmWeaponDamage(String[] newmWeaponDamage) { this.m_weapons_damage = newmWeaponDamage; }

    public void setrWeapons(String[] newrWeapons) { this.r_weapons_held = newrWeapons; }

    public void setrWeaponBonus(String[] newrWeaponBonus) { this.r_weapons_bonus = newrWeaponBonus; }

    public void setrWeaponDamage(String[] newrWeaponDamage) { this.r_weapons_damage = newrWeaponDamage; }

    public void setrWeaponAmmo(int[] newrWeaponAmmo) { this.r_weapons_ammo = newrWeaponAmmo;}

    public void setrWeaponRange(String[] newrWeaponRange) { this.r_weapons_range = newrWeaponRange;}

    public void setKnownSpells(String[] newKnownSpells) { this.known_spells = newKnownSpells;}

    public void setEquipped_spells(String[] newEquippedSpells) { this.equipped_spells = newEquippedSpells; }


}


