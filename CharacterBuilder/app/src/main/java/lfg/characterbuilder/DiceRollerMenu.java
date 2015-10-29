package lfg.characterbuilder;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class DiceRollerMenu extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    int check = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice_roller_menu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        int check = 0;
        Spinner spinner;
        spinner = (Spinner) findViewById(R.id.diceModeSpinner);
        //creating an adapter
        //this chooses what choices are available
        ArrayAdapter adapter =  ArrayAdapter.createFromResource(this, R.array.diceModes,
                android.R.layout.simple_spinner_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
        //https://www.youtube.com/watch?v=aApS2W-j8oM
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_dice_roller_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        //TextView myText = (TextView) view;
        //Toast.makeText(this, "You Selected " + myText.getText(), Toast.LENGTH_SHORT).show();
        check = check + 1;
        if (check > 1) {
            switch (position) {
                case 0:
                    Log.d("case", "in case o");
                    Toast.makeText(this, "position: " + position, Toast.LENGTH_SHORT).show();
                    break;
                case 1:
                    Log.d("case", "in case 1");
                    Toast.makeText(this, "position: " + position, Toast.LENGTH_SHORT).show();
                    Intent customDiceIntent = new Intent(this, customDiceActivity.class);
                    startActivity(customDiceIntent);
                    break;
                case 2:
                    Toast.makeText(this, "position: " + position, Toast.LENGTH_SHORT).show();
                    Intent dropLowestIntent = new Intent(this, dropLowestDiceMRKII.class);
                    startActivity(dropLowestIntent);
                    break;
                case 3:
                    Toast.makeText(this, "position: " + position, Toast.LENGTH_SHORT).show();
                    Intent rerollOnesIntent = new Intent(this, rerollOnes.class);
                    startActivity(rerollOnesIntent);
                    break;
                default:
                    Toast.makeText(this, "ayy lmao", Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
