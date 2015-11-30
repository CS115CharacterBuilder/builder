package lfg.characterbuilder;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class CharacterStats extends AppCompatActivity {

    /*stats follow the following format: (Strength, Dex, Constitution, Int, Wis, Char, Proficiency,
    Initiative, Speed, Perception, Hit Dice number, Hit Dice type, Current HP, Total HP
    Temoporary HP)
     */

    private EditText CharNAME;
    private String Name;

    private EditText CharCLASS;
    private String Class;


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
    private EditText CharTEMP;
    private String TemporaryHP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_stats);
        Button savebtn = (Button) findViewById(R.id.charbtn);
        Character gotChar = getIntent().getParcelableExtra("characterTag");
        loadViews();
    }

    /*private EditText CharSTR = (EditText) findViewById(R.id.CharSTR);
    private String STR = CharSTR.getText().toString();
    private EditText CharPROF = (EditText) findViewById(R.id.CharPROF);
    private String Prof = CharPROF.getText().toString();
    private EditText CharCON = (EditText) findViewById(R.id.CharCON);
    private String CON = CharCON.getText().toString();
    private EditText CharINI = (EditText) findViewById(R.id.CharINI);
    private String INI = CharINI.getText().toString();
    private EditText CharDEX = (EditText) findViewById(R.id.CharDEX);
    private String DEX = CharDEX.getText().toString();
    private EditText CharSPD = (EditText) findViewById(R.id.CharSPD);
    private String SPD = CharSPD.getText().toString();
    private EditText CharINT = (EditText) findViewById(R.id.CharINT);
    private String INT = CharINT.getText().toString();
    private EditText CharPER = (EditText) findViewById(R.id.CharPER);
    private String PER = CharPER.getText().toString();
    private EditText CharWIS = (EditText) findViewById(R.id.CharWIS);
    private String WIS = CharWIS.getText().toString();
    private EditText CharHD = (EditText) findViewById(R.id.CharHD);
    private String HD = CharHD.getText().toString();
    private EditText CharCHAR = (EditText) findViewById(R.id.CharCHAR);
    private String CHAR = CharCHAR.getText().toString();
    private EditText CharHP = (EditText) findViewById(R.id.CharHP);
    private String HP = CharHP.getText().toString();
    private EditText CharTEMP = (EditText) findViewById(R.id.CharTEMP);
    private String TempHP = CharTEMP.getText().toString();*/
    /*EditText CharNAME = (EditText) findViewById(R.id.CharNAME);
    String Name = CharNAME.getText().toString();*/
    /*private EditText CharRACE = (EditText) findViewById(R.id.CharRACE);
    private String Race = CharRACE.getText().toString();
    private EditText CharCLASS = (EditText) findViewById(R.id.CharCLASS);
    private String Class = CharCLASS.getText().toString();
        /*String saveName = Name + "_" + Race + "_" + Class;
        String saveInfo = Name + " " + Race + " " + Class + " " + STR + " " + Prof + " "
                + CON + " " + INI + " " + DEX + " " + SPD + " " + INT + " " + PER + " "
                + WIS + " " + HD + " " + CHAR + " " + HP + " " + TempHP;
        int duration = Toast.LENGTH_LONG;
        Context context = getApplicationContext();
        FileOutputStream fOut = null;*/


    //LoadViews READS from the passed Character Object
    //and UPDATES text views
    private void loadViews(){

        //Recieve Passed Character From HomeActivity
        Character gotChar = getIntent().getParcelableExtra("characterTag");

        //Grab Public TextView fields
        CharNAME = (EditText) findViewById(R.id.CharNAME);
        Name = CharNAME.getText().toString();
        CharCLASS = (EditText) findViewById(R.id.CharCLASS);
        Class = CharCLASS.getText().toString();

        //Case Character Field is NULL, VOID, or uninitialized
        if (gotChar == null) {
            CharNAME.setText("CHAR_NAME_VOID");
            CharCLASS.setText("CHAR_CLASS_VOID");
        }
        else{
            CharNAME.setText(gotChar.getCharacterName());
            CharCLASS.setText(gotChar.getCharacterClass());
        }
    }

    //SaveStats WRITES to the SharedPreferences file
    //with the name of the character unique_id
    public void saveStats(View view){
        //Recieve loaded character
        Character gotChar = getIntent().getParcelableExtra("characterTag");

        //Open up it's sp file and make an editor
        SharedPreferences sharedStats = getSharedPreferences(gotChar.getUnique_id(), Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedStats.edit();

        //Save the char stats
        editor.putString("CHAR_NAME", CharNAME.getText().toString());
        editor.putString("CHAR_CLASS", CharCLASS.getText().toString());
        editor.putInt("CHAR_PHOTO", gotChar.getPhotoId());
        editor.apply(); //maybe commit here?


        //Alert User that the current character has been saved
        Toast.makeText(CharacterStats.this,"Saved!", Toast.LENGTH_SHORT).show();

    }
}
