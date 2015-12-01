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

public class dropLowestDiceMRKII extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drop_lowest_dice_mrkii);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    public void rollDiceDropLowest(View view){
        Log.d("Roll", "in the roll dice function");
        int totalValue = 0;
        int lowest = 100000;
        String result;
        for(int i = 0; i < 4; i++){
            Log.d("loop", "i is equal to:" + i);
            int randomNumber = ThreadLocalRandom.current().nextInt(1, 6 + 1);
            Log.d("rollDice", "r is " + randomNumber);
            totalValue += randomNumber;
            if( randomNumber < lowest){
                lowest = randomNumber;
            }

        }
        totalValue -= lowest;
        result = Integer.toString(totalValue);
        TextView tv = (TextView) findViewById(R.id.dropLowestResult);
        tv.setText(result);
    }
}
