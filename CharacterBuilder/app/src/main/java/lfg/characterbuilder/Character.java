package lfg.characterbuilder;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Alex on 10/12/2015.
 */
public class Character implements Parcelable {

    private String unique_id;
    private String char_name;
    private String char_class;
    private int char_photoId;


    /*private String char_race;*/
   /* private String char_strength;
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
    private String char_temporaryhp;*/


    //Constructor for Character Object
    Character(String unique_id, String char_name, String char_class, int char_photoId) {
        this.unique_id = unique_id;
        this.char_name = char_name;
        this.char_class = char_class;
        this.char_photoId = char_photoId;
    }

    //Parcel Constructor Allows Object to be passed
    public Character(Parcel in){
        String[] data = new String[4];

        in.readStringArray(data);
        this.unique_id = data[0];
        this.char_name = data[1];
        this.char_class = data[2];
        this.char_photoId = Integer.parseInt(data[3]);

    }

    @Override
    public int describeContents() {
        //TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags){
        //TODO Auto-generated method stub
        dest.writeStringArray(new String[]{this.unique_id,this.char_name,this.char_class,String.valueOf(this.char_photoId)});
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

    public String getCharacterName() {
        return this.char_name;
    }

    public String getCharacterClass() {
        return this.char_class;
    }

    //public String getCharacterRace() { return this.char_race; }

    public int getPhotoId() {
        return this.char_photoId;
    }

    public void setCharacterName(String new_name){
        this.char_name = new_name;
    }

    public void setCharacterClass(String new_class) {
        this.char_class = new_class;
    }

    //public void setCharacterRace(String new_race) { this.char_race = new_race; }

    public void setPhotoId(int new_photoId) {
        this.char_photoId = new_photoId;
    }

}


