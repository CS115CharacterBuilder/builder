package lfg.characterbuilder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SpellDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //pulls values from intent
        String name = getIntent().getParcelableExtra("Name");
        int lvl = getIntent().getParcelableExtra("Lvl");
        String school = getIntent().getParcelableExtra("School");
        String range = getIntent().getParcelableExtra("Range");
        String components = getIntent().getParcelableExtra("Components");
        String castTime = getIntent().getParcelableExtra("CastTime");
        String duration = getIntent().getParcelableExtra("Duration");
        String flavor = getIntent().getParcelableExtra("Flavor");

        //declares textviews
        TextView Name = (TextView) findViewById(R.id.sName);
        TextView Lvl = (TextView) findViewById(R.id.sLvl);
        TextView School = (TextView) findViewById(R.id.sSchool);
        TextView Range = (TextView) findViewById(R.id.sRange);
        TextView Components = (TextView) findViewById(R.id.sComponents);
        TextView CastTime = (TextView) findViewById(R.id.sCastTime);
        TextView Duration = (TextView) findViewById(R.id.sDuration);
        TextView Flavor = (TextView) findViewById(R.id.sFlavor);

        //sets textviews
        Name.setText(name);
        Lvl.setText(Integer.toString(lvl));
        School.setText(school);
        Range.setText(range);
        Components.setText(components);
        CastTime.setText(castTime);
        Duration.setText(duration);
        Flavor.setText(flavor);
        setContentView(R.layout.activity_spell_details);
    }
}
