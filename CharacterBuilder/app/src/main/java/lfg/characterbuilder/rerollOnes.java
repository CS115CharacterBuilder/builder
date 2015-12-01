package lfg.characterbuilder;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.concurrent.ThreadLocalRandom;

public class rerollOnes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reroll_ones);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }
    public void rollDiceDropOnes(View view){
        Log.d("Roll", "in the roll dice function");
        int totalValue = 0;
        String result;
        for(int i = 0; i < 3;){
            Log.d("loop", "i is equal to:" + i);
            int randomNumber = ThreadLocalRandom.current().nextInt(1, 6 + 1);
            Log.d("rollDice", "r is " + randomNumber);

            if( randomNumber == 1){
                continue;
            }
            totalValue += randomNumber;
            i++;
        }
        result = Integer.toString(totalValue);
        TextView tv = (TextView) findViewById(R.id.rerollOnesResult);
        tv.setText(result);
    }
}