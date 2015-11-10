package lfg.characterbuilder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class StatPage extends AppCompatActivity {

    TextView HPCurr = (TextView) findViewById(R.id.HpCurr);
    TextView TempHP = (TextView) findViewById(R.id.TempHP);
    TextView HDCount = (TextView) findViewById(R.id.HDCount);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stat_page);
        //Initialize stat modifier textviews
        TextView StrMod = (TextView) findViewById(R.id.StrMod);
        TextView DexMod = (TextView) findViewById(R.id.DexMod);
        TextView ConMod = (TextView) findViewById(R.id.ConMod);
        TextView IntMod = (TextView) findViewById(R.id.IntMod);
        TextView WisMod = (TextView) findViewById(R.id.WisMod);
        TextView CharMod = (TextView) findViewById(R.id.CharMod);
        //Initialize stat value textviews
        TextView StrVal = (TextView) findViewById(R.id.StrVal);
        TextView DexVal = (TextView) findViewById(R.id.DexVal);
        TextView ConVal = (TextView) findViewById(R.id.ConVal);
        TextView IntVal = (TextView) findViewById(R.id.IntVal);
        TextView WisVal = (TextView) findViewById(R.id.WisVal);
        TextView CharVal = (TextView) findViewById(R.id.CharVal);
        //Initialize stat save textviews
        TextView StrSave = (TextView) findViewById(R.id.StrSave);
        TextView DexSave = (TextView) findViewById(R.id.DexSave);
        TextView ConSave = (TextView) findViewById(R.id.ConSave);
        TextView IntSave = (TextView) findViewById(R.id.IntSave);
        TextView WisSave = (TextView) findViewById(R.id.WisSave);
        TextView CharSave = (TextView) findViewById(R.id.CharSave);
        //Initialize miscellaneous textviews
        TextView ProfVal = (TextView) findViewById(R.id.ProfVal);
        TextView IniVal = (TextView) findViewById(R.id.IniVal);
        TextView ACVal = (TextView) findViewById(R.id.ACVal);
        TextView SpdVal = (TextView) findViewById(R.id.SpdVal);
        TextView PercVal = (TextView) findViewById(R.id.PercVal);
        TextView HDType = (TextView) findViewById(R.id.HDType);

        TextView HPTotal = (TextView) findViewById(R.id.HPTotal);


        int modValue = 0;// = findMod(Character.Str);
        StrMod.setText(modValue);
        /*StrVal.setText(Character.STR);
        DexMod.setText(modValue);
        DexVal.setText(Character.Dex);
        ConMod.setText(modValue);
        ConVal.setText(Character.Con);
        IntMod.setText(modValue);
        IntVal.setText(Character.Int);
        WisMod.setText(modValue);
        WisVal.setText(Character.Wis);
        CharMod.setText(modValue);
        CharVal.setText(Character.Char);
        ProfVal.setText(Character.char_proficiency);
        IniVal.setText(Character.char_initiative);
        ACVal.setText(Character.char_armorclass);
        SpdVal.setText(Character.char_speed);
        PercVal.setText(Character.char_perception);*/



    }

    //takes stat value and converts it into the modifier
    public String findMod(int x) {
        int statMod = (x - 10)/2;
        String modValue;
        if(statMod > 0) {
            modValue = "+" + Integer.toString(statMod);
        }else {
            modValue = Integer.toString(statMod);
        }
        return modValue;
    }

    public void addHP () {
        int hp = (Integer)char_hitpoints;
        hp += 1;
        String newhp = Integer.toString(hp);
        HPCurr.setText(newhp);
    }

    public void removeHP () {
        int hp = (Integer)char_hitpoints;
        hp -= 1;
        String newhp = Integer.toString(hp);
        HPCurr.setText(newhp);
    }

    public void addTHP () {
        int hp = (Integer)char_temporaryhp;
        hp += 1;
        String newhp = Integer.toString(hp);
        TempHP.setText(newhp);
    }

    public void removeTHP () {
        int hp = (Integer)char_temporaryhp;
        hp -= 1;
        String newhp = Integer.toString(hp);
        TempHP.setText(newhp);
    }

    public void addHD () {
        int hp = (Integer)char_hitdice;
        hp += 1;
        String newhp = Integer.toString(hp);
        HDCount.setText(newhp);
    }

    public void removeHD () {
        int hp = (Integer)char_hitdice;
        hp -= 1;
        String newhp = Integer.toString(hp);
        HDCount.setText(newhp);
    }
}
