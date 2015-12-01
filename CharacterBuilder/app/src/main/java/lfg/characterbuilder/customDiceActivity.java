package lfg.characterbuilder;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.concurrent.ThreadLocalRandom;

public class customDiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_dice);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void rollDice(View view){
        Log.d("Roll", "in the roll dice function");
        int numberOfDice = 0;
        int totalValue = 0;
        int diceType = 0;
        String result;
        EditText dNIText = (EditText) findViewById(R.id.diceNumInput);
        EditText dTIText = (EditText) findViewById(R.id.diceTypeInput);
        try{

            numberOfDice = Integer.parseInt(dNIText.getText().toString());
            diceType = Integer.parseInt(dTIText.getText().toString());
        }catch(NumberFormatException nfe){
            Log.d("rollDice", "couldnt parse" + nfe);
        }
        Log.d("values", "dicetype is: " + diceType);
        Log.d("values", "dicetype is: " + numberOfDice);
        for(int i = 0; i < numberOfDice; i++){
            Log.d("loop", "i is equal to:" + i);
            int randomNumber = ThreadLocalRandom.current().nextInt(1, diceType + 1);
            Log.d("rollDice", "r is " + randomNumber);
            totalValue += randomNumber;

        }
        result = Integer.toString(totalValue);
        TextView tv = (TextView) findViewById(R.id.rollResultBox);
        tv.setText(result);
    }

}
