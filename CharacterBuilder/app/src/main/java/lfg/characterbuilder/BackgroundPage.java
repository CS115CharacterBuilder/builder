package lfg.characterbuilder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class BackgroundPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_background_page);
        TextView NameVal = (TextView) findViewById(R.id.NameVal);
        TextView ClassVal = (TextView) findViewById(R.id.ClassVal);
        TextView LvlVal = (TextView) findViewById(R.id.LvlVal);
        TextView AlignmentVal = (TextView) findViewById(R.id.AlignmentVal);
        TextView DeityVal = (TextView) findViewById(R.id.DeityVal);
        TextView BackgroundVal = (TextView) findViewById(R.id.BackgroundVal);
        String Name = NameVal.getText().toString();
        String Class = ClassVal.getText().toString();
        String Lvl = LvlVal.getText().toString();
        String Alignment = AlignmentVal.getText().toString();
        String Deity = DeityVal.getText().toString();
        String Background = BackgroundVal.getText().toString();
    }
}
