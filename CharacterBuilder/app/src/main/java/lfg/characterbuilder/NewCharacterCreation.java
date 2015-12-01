package lfg.characterbuilder;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class NewCharacterCreation extends AppCompatActivity {

    private EditText CharNAME;
    private String Name;

    private EditText CharCLASS;
    private String Class;

    private EditText CharBACKGROUND;
    private String Background;

    private EditText CharRACE;
    private String Race;

    private EditText CharSUBRACE;
    private String Subrace;

    //Stats - 0
    private EditText CharSTR;
    private String Strength;

    //Stats - 1
    private EditText CharDEX;
    private String Dexerity;

    //Stats - 2
    private EditText CharCON;
    private String Constitution;

    //Stats - 3
    private EditText CharINT;
    private String Intelligence;

    //Stats - 4
    private EditText CharWIS;
    private String Wisdom;

    //Stats - 5
    private EditText CharCHAR;
    private String Charisma;

    //Stats - 6
    private EditText CharPROF;
    private String Proficiency;

    //Stats - 7
    private EditText CharINI;
    private String Initiative;

    //Stats - 8
    private EditText CharSPD;
    private String Speed;

    //Stats - 9
    private EditText CharPER;
    private String Perception;

    //Stats - 10 (Number)
    private EditText CharHD;
    private String HitDice;

    //Stats - 11 (HD Type)
    private EditText CharAC;
    private String ArmorClass;

    //Stats - 12
    private EditText CharHP;
    private String HitPoints;

    //Stats - 13
    private String TotalHP;

    //Stats - 14
    private EditText CharTEMP;
    private String TemporaryHP;

    private static final String STRING_LIST =
            "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    private static final int RANDOM_STRING_LENGTH = 8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_stats);
        Button savebtn = (Button) findViewById(R.id.charbtn);
    }


    private String generateId(){
        StringBuffer randomString = new StringBuffer();
        for(int i =0; i<RANDOM_STRING_LENGTH; ++i){
            int number = getRandomNumber();
            char ch = STRING_LIST.charAt(number);
            randomString.append(ch);
        }
        return randomString.toString();
    }

    private int getRandomNumber(){
        int randomInt;
        Random randomGenerator = new Random();
        randomInt = randomGenerator.nextInt(STRING_LIST.length());
        if (randomInt - 1 == -1) {
            return randomInt;
        } else {
            return randomInt - 1;
        }
    }


    //SaveStats WRITES to the SharedPreferences file
    //with the name of the character unique_id
    public void saveStats(View view){

        //Grab Public TextView fields
        CharNAME = (EditText) findViewById(R.id.CharNAME);
        Name = CharNAME.getText().toString();
        CharCLASS = (EditText) findViewById(R.id.CharCLASS);
        Class = CharCLASS.getText().toString();
        CharBACKGROUND = (EditText) findViewById(R.id.CharBACKGROUND);
        Background = CharBACKGROUND.getText().toString();
        CharRACE = (EditText) findViewById(R.id.CharRACE);
        Race = CharRACE.getText().toString();
        CharSUBRACE = (EditText) findViewById(R.id.CharSUBRACE);
        Subrace = CharSUBRACE.getText().toString();

        CharSTR = (EditText) findViewById(R.id.CharSTR);
        Strength = CharSTR.getText().toString();
        CharDEX = (EditText) findViewById(R.id.CharDEX);
        Dexerity = CharDEX.getText().toString();
        CharCON = (EditText) findViewById(R.id.CharCON);
        Constitution = CharCON.getText().toString();
        CharINT = (EditText) findViewById(R.id.CharINT);
        Intelligence = CharINT.getText().toString();
        CharWIS = (EditText) findViewById(R.id.CharWIS);
        Wisdom = CharWIS.getText().toString();
        CharCHAR = (EditText) findViewById(R.id.CharCHAR);
        Charisma = CharCHAR.getText().toString();
        CharPROF = (EditText) findViewById(R.id.CharPROF);
        Proficiency = CharPROF.getText().toString();
        CharINI = (EditText) findViewById(R.id.CharINI);
        Initiative = CharINI.getText().toString();
        CharSPD = (EditText) findViewById(R.id.CharSPD);
        Speed = CharSPD.getText().toString();
        CharPER = (EditText) findViewById(R.id.CharPER);
        Perception = CharPER.getText().toString();
        CharHD = (EditText) findViewById(R.id.CharHD);
        HitDice = CharHD.getText().toString();
        CharAC = (EditText) findViewById(R.id.CharAC);
        ArmorClass = CharAC.getText().toString();
        CharHP = (EditText) findViewById(R.id.CharHP);
        HitPoints = CharHP.getText().toString();
        TotalHP = HitPoints;
        CharTEMP = (EditText) findViewById(R.id.CharTEMP);
        TemporaryHP = CharTEMP.getText().toString();

        //Package the Stats into a String separated by ","
        String[] statsArray = new String[]{Strength, Dexerity, Constitution,Intelligence,Wisdom,Charisma,
                Proficiency,Initiative,Speed,Perception,HitDice,ArmorClass,HitPoints,TotalHP,TemporaryHP};
        StringBuilder statsString = new StringBuilder();
        for(int i = 0; i < statsArray.length; i++){
            statsString.append(statsArray[i]).append(",");
        }


        //Determine Character Icon
        int characterIcon;
        switch(CharCLASS.getText().toString()){
            case "Barbarian": characterIcon = R.drawable.ic_warrior; break;
            case "barbarian": characterIcon = R.drawable.ic_warrior; break;
            case "Fighter": characterIcon = R.drawable.ic_warrior; break;
            case "fighter": characterIcon = R.drawable.ic_warrior; break;
            case "Paladin": characterIcon = R.drawable.ic_warrior; break;
            case "paladin": characterIcon = R.drawable.ic_warrior; break;
            case "Bard": characterIcon = R.drawable.ic_ranger; break;
            case "bard": characterIcon = R.drawable.ic_ranger; break;
            case "Ranger": characterIcon = R.drawable.ic_ranger; break;
            case "ranger": characterIcon = R.drawable.ic_ranger; break;
            case "Thief": characterIcon = R.drawable.ic_ranger; break;
            case "thief": characterIcon = R.drawable.ic_ranger; break;
            case "Rogue": characterIcon = R.drawable.ic_ranger; break;
            case "rogue": characterIcon = R.drawable.ic_ranger; break;
            case "Cleric": characterIcon = R.drawable.ic_mage; break;
            case "cleric": characterIcon = R.drawable.ic_mage; break;
            case "Druid": characterIcon = R.drawable.ic_mage; break;
            case "druid": characterIcon = R.drawable.ic_mage; break;
            case "Mage": characterIcon = R.drawable.ic_mage; break;
            case "mage": characterIcon = R.drawable.ic_mage; break;
            case "Wizard": characterIcon = R.drawable.ic_mage; break;
            case "wizard": characterIcon = R.drawable.ic_mage; break;
            case "Monk": characterIcon = R.drawable.ic_mage; break;
            case "monk": characterIcon = R.drawable.ic_mage; break;
            case "Mystic": characterIcon = R.drawable.ic_mage; break;
            case "mystic": characterIcon = R.drawable.ic_mage; break;
            case "Sorcerer": characterIcon = R.drawable.ic_mage; break;
            case "sorcerer": characterIcon = R.drawable.ic_mage; break;
            case "Warlock": characterIcon = R.drawable.ic_mage; break;
            case "warlock": characterIcon = R.drawable.ic_mage; break;
            default:
                characterIcon = R.drawable.ic_rules; break;
        }


        //Create the character with a default image
        Character newCharacter = new Character(
                generateId(), CharNAME.getText().toString(),
                CharCLASS.getText().toString(), characterIcon
        );

        //Open up its new SP file and make its editor
        SharedPreferences sharedStats = getSharedPreferences(newCharacter.getUnique_id(), Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedStats.edit();

        //Save the newly formed character stats and packaged string
        editor.putString("CHAR_NAME", newCharacter.getCharacterName());
        editor.putString("CHAR_CLASS", newCharacter.getCharacterClass());
        editor.putString("CHAR_BACKGROUND", Background.toString());
        editor.putString("CHAR_RACE", Race.toString());
        editor.putString("CHAR_SUBRACE", Subrace.toString());
        editor.putInt("CHAR_PHOTO", newCharacter.getPhotoId());
        editor.putString("CHAR_STATS", statsString.toString());
        editor.apply(); //maybe commit here?

        //Alert User that the current character has been saved
        Toast.makeText(NewCharacterCreation.this, "New Character Created!", Toast.LENGTH_SHORT).show();

        //Package the
        Intent returnIntent = new Intent();
        returnIntent.putExtra("newCharacterTag", newCharacter);
        setResult(Activity.RESULT_OK, returnIntent);
        finish();
    }


}
