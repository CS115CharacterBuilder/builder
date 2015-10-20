package com.example.kevin.dndbuilder;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CharacterStats extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.CharacterStats);
        Button savebtn = (Button) findViewById(R.id.charbtn);

    }

    public void clickSave(View v) {

        EditText CharSTR = (EditText) findViewById(R.id.CharSTR);
        String STR = CharSTR.getText().toString();
        EditText CharPROF = (EditText) findViewById(R.id.CharPROF);
        String Prof = CharPROF.getText().toString();
        EditText CharCON = (EditText) findViewById(R.id.CharCON);
        String CON = CharCON.getText().toString();
        EditText CharINI = (EditText) findViewById(R.id.CharINI);
        String INI = CharINI.getText().toString();
        EditText CharDEX = (EditText) findViewById(R.id.CharDEX);
        String DEX = CharDEX.getText().toString();
        EditText CharSPD = (EditText) findViewById(R.id.CharSPD);
        String SPD = CharSPD.getText().toString();
        EditText CharINT = (EditText) findViewById(R.id.CharINT);
        String INT = CharINT.getText().toString();
        EditText CharPER = (EditText) findViewById(R.id.CharPER);
        String PER = CharPER.getText().toString();
        EditText CharWIS = (EditText) findViewById(R.id.CharWIS);
        String WIS = CharWIS.getText().toString();
        EditText CharHD = (EditText) findViewById(R.id.CharHD);
        String HD = CharHD.getText().toString();
        EditText CharCHAR = (EditText) findViewById(R.id.CharCHAR);
        String CHAR = CharCHAR.getText().toString();
        EditText CharHP = (EditText) findViewById(R.id.CharHP);
        String HP = CharHP.getText().toString();
        EditText CharTEMP = (EditText) findViewById(R.id.CharTEMP);
        String TempHP = CharTEMP.getText().toString();
        EditText CharNAME = (EditText) findViewById(R.id.CharNAME);
        String Name = CharNAME.getText().toString();
        EditText CharRACE = (EditText) findViewById(R.id.CharRACE);
        String Race = CharRACE.getText().toString();
        EditText CharCLASS = (EditText) findViewById(R.id.CharCLASS);
        String Class = CharCLASS.getText().toString();
        String saveName = Name + "_" + Race + "_" + Class;
        String saveInfo = Name + " " + Race + " " + Class + " " + STR + " " + Prof + " "
                + CON + " " + INI + " " + DEX + " " + SPD + " " + INT + " " + PER + " "
                + WIS + " " + HD + " " + CHAR + " " + HP + " " + TempHP;
        int duration = Toast.LENGTH_LONG;
        Context context = getApplicationContext();
        FileOutputStream fOut = null;

        /*if (File(saveName).exists()) {
            Toast toast = Toast.makeText(context, "Character already exists", duration);

        }*/

        try {
            fOut = openFileOutput(saveName.toString() +"f", MODE_WORLD_READABLE);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            fOut.write(saveInfo.getBytes());
            Toast toast = Toast.makeText(context, "Character saved!", duration);
            toast.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println((saveName.toString() + "f").toString());

    }
}
