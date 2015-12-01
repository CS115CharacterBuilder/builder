package lfg.characterbuilder;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

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
    private String background_desc;
    private String background_alignment;
    private String background_deity;
    //stats page info
    private int level;
    private int classpoints;
    private boolean[] statsproficiencies;
    /*stats follow the following format: (Strength, Dex, Constitution, Int, Wis, Char, Proficiency,
    Initiative, Speed, Perception, Hit Dice number, Hit Dice type, Current HP, Total HP
    Temoporary HP)
     */
    private int[] stats;

    //skill page info
    private boolean[] skillproficiencies;
    //equipment page info
    private String armorName;
    private String armorMod;
    private String proficiencies;
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


    //Constructor for Character Object - CREATES DEFAULT VALUES
    Character(String unique_id, String char_name, String char_class, int char_photoId) {
        this.unique_id = unique_id;
        this.name = char_name;
        this.class_name = char_class;
        this.photoId = char_photoId;
        this.copper_held = 100;
        this.silver_held = 50;
        this.gold_held = 10;
        this.race = "DEFAULT_RACE";
        this.subrace = "DEFAULT_SUBRACE";
        this.background_type = "DEFAULT_BACKGROUND_TYPE";
        this.background_desc = "Enter a backstory";
        this.background_alignment = "DEFAULT_ALIGNMENT";
        this.background_deity = "DEFAULT_DEITY";
        this.armorName = "Enter Armor";
        this.armorMod = "Enter Modifier";
        this.level = 1;
        this.classpoints = 0;
        this.proficiencies = "";

        //Stats Default
        this.stats = new int[16];
        for(int i = 0; i < stats.length; i++) {
            stats[i] = 666;
        }
        this.statsproficiencies = new boolean[6];
        for(int i = 0; i < this.statsproficiencies.length; i++){
            if(i%2 == 0){
                this.statsproficiencies[i] = false;
            }
            else {
                this.statsproficiencies[i] = true;
            }
        }
        //Skills Default
        this.skillproficiencies = new boolean[18];
        for(int i = 0; i < skillproficiencies.length; i++){
            if(i%2 == 0){
                skillproficiencies[i] = false;
            }
            else {
                skillproficiencies[i] = true;
            }
        }

        // Items Held Default
        this.items_held = new String[2];
        items_held[0] = "Bag";
        items_held[1] = "Rock";

        // Item Description Default
        this.items_description = new String[2];
        items_description[0] = "It's a nice little bag for carrying currency";
        items_description[1] = "It rocks!";


        // Proficiencies Default
        this.proficiencies = "";

        // Armor Default
        this.armorName = "Armor Name";
        this.armorMod = "Armor Modifier";

        // Melee Weapons Held Default
        this.m_weapons_held = new String[1];
        m_weapons_held[0] = "Stick";

        // Melee Weapons Bonus Default
        this.m_weapons_bonus = new String[1];
        m_weapons_bonus[0] = "5";

        // Melee Weapons Damage Default
        this.m_weapons_damage = new String[1];
        m_weapons_damage[0] = "10";

        // Ranged Weapons Held Default Default
        this.r_weapons_held = new String[1];
        r_weapons_held[0] = "Slingshot";

        // Ranged Weapons Bonus Default
        this.r_weapons_bonus = new String[1];
        r_weapons_bonus[0] = "3";

        // Ranged Weapons Damage Default
        this.r_weapons_damage = new String[1];
        r_weapons_damage[0] = "7";

        // Ranged Weapons Ammo Default
        this.r_weapons_ammo = new int[1];
        r_weapons_ammo[0] = 15;

        // Ranged Weapons Range Default
        this.r_weapons_range = new String[1];
        r_weapons_range[0] = "Short";

        // Known Spells Default
        this.known_spells = new String[1];
        known_spells[0] = "Healing";

        // Equipped Spells Default
        this.equipped_spells = new String[1];
        known_spells[0] = "Healing";

    }

    //Parcel Constructor Allows Object to be passed
    public Character(Parcel in){
        String[] data = new String[18];
        in.readStringArray(data);

        this.unique_id = data[0];
        this.name = data[1];
        this.class_name = data[2];
        this.photoId = Integer.parseInt(data[3]);
        this.race = data[4];
        this.subrace = data[5];
        this.copper_held = Integer.parseInt(data[6]);
        this.silver_held = Integer.parseInt(data[7]);
        this.gold_held = Integer.parseInt(data[8]);
        this.background_type = data[9];
        this.background_alignment = data[10];
        this.background_deity = data[11];
        this.level = Integer.parseInt(data[12]);
        this.classpoints = Integer.parseInt(data[13]);
        this.background_desc = data[14];
        this.armorName = data[15];
        this.armorMod = data[16];
        this.proficiencies = data[17];

    }

    @Override
    public int describeContents() {
        //TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags){
        //TODO Auto-generated method stub
        dest.writeStringArray(new String[]{this.unique_id,this.name,this.class_name,
                String.valueOf(this.photoId), this.race, this.subrace, String.valueOf(this.copper_held),
                String.valueOf(this.silver_held), String.valueOf(this.gold_held), this.background_type,
                this.background_alignment, this.background_deity, String.valueOf(this.level),
                String.valueOf(this.classpoints), String.valueOf(this.background_desc),
                String.valueOf(this.armorName), String.valueOf(this.armorMod), String.valueOf(this.proficiencies)});
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

    public String getBackgroundDesc() {return this.background_desc; }

    public String getAlignment() {return this.background_alignment; }

    public String getDeity() { return this.background_deity; }

    public int getLevel () { return this.level; }

    public int getClassPoints() { return this.classpoints; }

    public int[] getStats() {
        return this.stats;
    }

    public boolean[] getSkillproficiencies() { return this.skillproficiencies; }

    public boolean[] getStatsproficiencies() { return this.statsproficiencies; }

    public String getArmorName() { return this.armorName; }

    public String getArmorMod() { return this.armorMod; }

    public String getProficiencies() { return this.proficiencies; }

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

    public void setBackgroundDesc(String newDesc) {this.background_desc = newDesc; }

    public void setAlignment(String newAlignment) {this.background_alignment = newAlignment; }

    public void setDeity(String newDeity) { this.background_deity = newDeity; }

    public void setLevel (int newLevel) { this.level = newLevel; }

    public void setClassPoints(int newClassPoints) { this.classpoints = newClassPoints; }

    public void setStats(int[] newStats) { this.stats = newStats; }

    public void setSkillproficiencies(boolean[] newSkillProficiencies) { this.skillproficiencies = newSkillProficiencies; }

    public void setProficiencies(String newProficiencies) { this.proficiencies = newProficiencies; }

    public void setArmorName(String newAName) { this.armorName = newAName; }

    public void setArmorMod(String newAMod) { this.armorMod = newAMod; }

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


