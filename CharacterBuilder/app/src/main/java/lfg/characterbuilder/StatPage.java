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
    Character gotChar = getActivity().getIntent().getParcelableExtra("characterTag");
    int[] stats = gotChar.getStats();


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Initialize stat value textviews
        TextView StrVal = (TextView) getView().findViewById(R.id.StrVal);
        StrVal.setText(Integer.toString(stats[0]));
        TextView DexVal = (TextView) getView().findViewById(R.id.DexVal);
        DexVal.setText(Integer.toString(stats[1]));
        TextView ConVal = (TextView) getView().findViewById(R.id.ConVal);
        ConVal.setText(Integer.toString(stats[2]));
        TextView IntVal = (TextView) getView().findViewById(R.id.IntVal);
        IntVal.setText(Integer.toString(stats[3]));
        TextView WisVal = (TextView) getView().findViewById(R.id.WisVal);
        WisVal.setText(Integer.toString(stats[4]));
        TextView CharVal = (TextView) getView().findViewById(R.id.CharVal);
        CharVal.setText(Integer.toString(stats[5]));
        //Initialize stat modifier textviews
        TextView StrMod = (TextView) getView().findViewById(R.id.StrMod);
        StrMod.setText(findMod(stats[0]));
        TextView DexMod = (TextView) getView().findViewById(R.id.DexMod);
        DexMod.setText(findMod(stats[1]));
        TextView ConMod = (TextView) getView().findViewById(R.id.ConMod);
        ConMod.setText(findMod(stats[2]));
        TextView IntMod = (TextView) getView().findViewById(R.id.IntMod);
        IntMod.setText(findMod(stats[3]));
        TextView WisMod = (TextView) getView().findViewById(R.id.WisMod);
        WisMod.setText(findMod(stats[4]));
        TextView CharMod = (TextView) getView().findViewById(R.id.CharMod);
        CharMod.setText(findMod(stats[5]));
        //Initialize stat save textviews
        TextView StrSave = (TextView) getView().findViewById(R.id.StrSave);
        TextView DexSave = (TextView) getView().findViewById(R.id.DexSave);
        TextView ConSave = (TextView) getView().findViewById(R.id.ConSave);
        TextView IntSave = (TextView) getView().findViewById(R.id.IntSave);
        TextView WisSave = (TextView) getView().findViewById(R.id.WisSave);
        TextView CharSave = (TextView) getView().findViewById(R.id.CharSave);
        //Initialize miscellaneous textviews
        TextView ProfVal = (TextView) getView().findViewById(R.id.ProfVal);
        ProfVal.setText(Integer.toString(stats[6]));
        TextView IniVal = (TextView) getView().findViewById(R.id.IniVal);
        IniVal.setText(Integer.toString(stats[7]));
        TextView ACVal = (TextView) getView().findViewById(R.id.ACVal);
        //Val.setText(Integer.toString(stats[0]);
        TextView SpdVal = (TextView) getView().findViewById(R.id.SpdVal);
        SpdVal.setText(Integer.toString(stats[8]));
        TextView PercVal = (TextView) getView().findViewById(R.id.PercVal);
        PercVal.setText(Integer.toString(stats[9]));
        TextView HDCount = (TextView) getView().findViewById(R.id.HDCount);
        HDCount.setText(Integer.toString(stats[10]));
        TextView HDType = (TextView) getView().findViewById(R.id.HDType);
        HDType.setText(Integer.toString(stats[11]));
        TextView HPCurr = (TextView) getView().findViewById(R.id.HpCurr);
        HPCurr.setText(Integer.toString(stats[12]));
        TextView HPTotal = (TextView) getView().findViewById(R.id.HPTotal);
        HPTotal.setText(Integer.toString(stats[13]));
        TextView TempHP = (TextView) getView().findViewById(R.id.TempHP);
        TempHP.setText(Integer.toString(stats[14]));
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

    //adds hp value on click
    public void addHP () {
        int hp = stats[12];
        hp += 1;
        stats[12] = hp;
        String newhp = Integer.toString(hp);
        HPCurr.setText(newhp);
    }

    //subtracts hp value on click
    public void removeHP () {
        int hp = stats[12];
        hp -= 1;
        stats[12] = hp;
        String newhp = Integer.toString(hp);
        HPCurr.setText(newhp);
    }

    // adds temp hp value on click
    public void addTHP () {
        int TempHp = stats[14];
        TempHp += 1;
        stats[14] = TempHp;
        String newTempHp = Integer.toString(TempHp);
        TempHP.setText(newTempHp);
    }

    //subtracts temp hp value on click
    public void removeTHP () {
        int TempHp = stats[14];
        TempHp -= 1;
        stats[14] = TempHp;
        String newTempHp = Integer.toString(TempHp);
        TempHP.setText(newTempHp);
    }

    //adds hit dice coutn on click
    public void addHD () {
        int hdCount = stats[10];
        hdCount += 1;
        stats[10] = hdCount;
        String newHDCount = Integer.toString(hdCount);
        HDCount.setText(newHDCount);
    }

    //subtracts hit dice count on click
    public void removeHD () {
        int hdCount = stats[10];
        hdCount -= 1;
        stats[10] = hdCount;
        String newHDCount = Integer.toString(hdCount);
        HDCount.setText(newHDCount);
    }
}
