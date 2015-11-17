package lfg.characterbuilder;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class StatPage extends Fragment {

    TextView HPCurr = (TextView) getView().findViewById(R.id.HpCurr);
    TextView TempHP = (TextView) getView().findViewById(R.id.TempHP);
    TextView HDCount = (TextView) getView().findViewById(R.id.HDCount);


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Initialize stat modifier textviews
        TextView StrMod = (TextView) getView().findViewById(R.id.StrMod);
        TextView DexMod = (TextView) getView().findViewById(R.id.DexMod);
        TextView ConMod = (TextView) getView().findViewById(R.id.ConMod);
        TextView IntMod = (TextView) getView().findViewById(R.id.IntMod);
        TextView WisMod = (TextView) getView().findViewById(R.id.WisMod);
        TextView CharMod = (TextView) getView().findViewById(R.id.CharMod);
        //Initialize stat value textviews
        TextView StrVal = (TextView) getView().findViewById(R.id.StrVal);
        TextView DexVal = (TextView) getView().findViewById(R.id.DexVal);
        TextView ConVal = (TextView) getView().findViewById(R.id.ConVal);
        TextView IntVal = (TextView) getView().findViewById(R.id.IntVal);
        TextView WisVal = (TextView) getView().findViewById(R.id.WisVal);
        TextView CharVal = (TextView) getView().findViewById(R.id.CharVal);
        //Initialize stat save textviews
        TextView StrSave = (TextView) getView().findViewById(R.id.StrSave);
        TextView DexSave = (TextView) getView().findViewById(R.id.DexSave);
        TextView ConSave = (TextView) getView().findViewById(R.id.ConSave);
        TextView IntSave = (TextView) getView().findViewById(R.id.IntSave);
        TextView WisSave = (TextView) getView().findViewById(R.id.WisSave);
        TextView CharSave = (TextView) getView().findViewById(R.id.CharSave);
        //Initialize miscellaneous textviews
        TextView ProfVal = (TextView) getView().findViewById(R.id.ProfVal);
        TextView IniVal = (TextView) getView().findViewById(R.id.IniVal);
        TextView ACVal = (TextView) getView().findViewById(R.id.ACVal);
        TextView SpdVal = (TextView) getView().findViewById(R.id.SpdVal);
        TextView PercVal = (TextView) getView().findViewById(R.id.PercVal);
        TextView HDType = (TextView) getView().findViewById(R.id.HDType);

        TextView HPTotal = (TextView) getView().findViewById(R.id.HPTotal);


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

    int char_hitpoints;
    int char_hitdice;
    int char_temporaryhp;

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
