package lfg.characterbuilder;

/**
 * Created by Alex on 10/12/2015.
 */
public class Character {

    private String char_name;
    private String char_class;
    private String char_race;
    private int char_photoId;

    private String char_strength;
    private String char_proficiency;
    private String char_charisma;
    private String char_hitdice;
    private String char_constitution;
    private String char_initiative;
    private String char_dexterity;
    private String char_armorclass;
    private String char_intelligence;
    private String char_speed;
    private String char_wisdom;
    private String char_perception;
    private String char_hitpoints;
    private String char_temporaryhp;


    //Constructor for Character Object
    Character(String char_name, String char_class, int char_photoId) {
        this.char_name = char_name;
        this.char_class = char_class;
        this.char_photoId = char_photoId;
    }

    //Standard Accessors and Mutator Functions
    public String getCharacterName() {
        return this.char_name;
    }

    public String getCharacterClass() {
        return this.char_class;
    }

    public String getCharacterRace() { return this.char_race; }

    public int getPhotoId() {
        return this.char_photoId;
    }

    public void setCharacterName(String new_name){
        this.char_name = new_name;
    }

    public void setCharacterClass(String new_class) {
        this.char_class = new_class;
    }

    public void setCharacterRace(String new_race) { this.char_race = new_race; }

    public void setPhotoId(int new_photoId) {
        this.char_photoId = new_photoId;
    }

}


