package lfg.characterbuilder;

import android.content.Context;
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

public class CharacterStats extends AppCompatActivity {

    private EditText CharNAME;
    private String Name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_stats);
        Button savebtn = (Button) findViewById(R.id.charbtn);

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
    //EditText CharNAME = (EditText) findViewById(R.id.CharNAME);
    //String Name = CharNAME.getText().toString();
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

        /*if (File(saveName).exists()) {
            Toast toast = Toast.makeText(context, "Character already exists", duration);
        }*/

        /*try {
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
        */



    /*public void clickSave(View v) {

        SharedPreferences sharedStats = getSharedPreferences("CHAR_STATS", Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = sharedStats.edit();
        //editor.putString("CHAR_NAME", CharNAME.getText().toString());
        //editor.apply(); //maybe commit here?

        Toast.makeText(CharacterStats.this,"Saved!", Toast.LENGTH_SHORT).show();

    }*/

    private void loadViews(){
        CharNAME = (EditText) findViewById(R.id.CharNAME);
        Name = CharNAME.getText().toString();

        SharedPreferences sharedStats = getSharedPreferences("CHAR_STATS", Context.MODE_PRIVATE);
        String charName = sharedStats.getString("CHAR_NAME", "CHAR_NAME");
        CharNAME.setText(charName);
    }

    //Alex's Shot with using SharedPreferences
    public void saveStats(View view){
        SharedPreferences sharedStats = getSharedPreferences("CHAR_STATS", Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = sharedStats.edit();
        editor.putString("CHAR_NAME", CharNAME.getText().toString());
        editor.apply(); //maybe commit here?

        Toast.makeText(CharacterStats.this,"Saved!", Toast.LENGTH_SHORT).show();

    }
}
