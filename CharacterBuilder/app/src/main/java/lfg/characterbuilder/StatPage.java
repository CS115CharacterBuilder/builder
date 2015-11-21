package lfg.characterbuilder;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class StatPage extends Fragment {
    protected View mView;

    Character gotChar;
    TextView HPCurr;
    TextView TempHP;
    TextView HDCount;
    int[] stats;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View fragmentView = inflater.inflate(R.layout.activity_stat_page, container, false);
        this.mView = fragmentView;
        gotChar = getActivity().getIntent().getParcelableExtra("characterTag");

        //Grab and set stats bundle
        Bundle args = getArguments();

        int[] caughtStatsArray = args.getIntArray("statsToFrag");
        stats = caughtStatsArray;

        if (stats == null) {
            Log.d("DEBUG", "CAUGHT STATS ARRAY WAS NULL");
        }

        //Grab and set character
        gotChar = args.getParcelable("charToStats");

        //stats = /*gotChar.getStats();*/ new int[16];
        //for(int i = 0; i < stats.length; i++) {
        //stats[i] = 0;
        //}


        //Initialize stat value textviews
        HPCurr = (TextView) mView.findViewById(R.id.HpCurr);
        TempHP = (TextView) mView.findViewById(R.id.TempHP);
        HDCount = (TextView) mView.findViewById(R.id.HDCount);


        TextView StrVal = (TextView) mView.findViewById(R.id.StrVal);
        StrVal.setText(Integer.toString(stats[0]));
        TextView DexVal = (TextView) mView.findViewById(R.id.DexVal);
        DexVal.setText(Integer.toString(stats[1]));
        TextView ConVal = (TextView) mView.findViewById(R.id.ConVal);
        //ConVal.setText(Integer.toString(stats[2]));
        TextView IntVal = (TextView) mView.findViewById(R.id.IntVal);
        //IntVal.setText(Integer.toString(stats[3]));
        TextView WisVal = (TextView) mView.findViewById(R.id.WisVal);
        //WisVal.setText(Integer.toString(stats[4]));
        TextView CharVal = (TextView) mView.findViewById(R.id.CharVal);
        //CharVal.setText(Integer.toString(stats[5]));
        //Initialize stat modifier textviews
        TextView StrMod = (TextView) mView.findViewById(R.id.StrMod);
        //StrMod.setText(findMod(stats[0]));
        TextView DexMod = (TextView) mView.findViewById(R.id.DexMod);
        //DexMod.setText(findMod(stats[1]));
        TextView ConMod = (TextView) mView.findViewById(R.id.ConMod);
        //ConMod.setText(findMod(stats[2]));
        TextView IntMod = (TextView) mView.findViewById(R.id.IntMod);
        //IntMod.setText(findMod(stats[3]));
        TextView WisMod = (TextView) mView.findViewById(R.id.WisMod);
        //WisMod.setText(findMod(stats[4]));
        TextView CharMod = (TextView) mView.findViewById(R.id.CharMod);
        //CharMod.setText(findMod(stats[5]));

        //Initialize stat save textviews
        TextView StrSave = (TextView) mView.findViewById(R.id.StrSave);
        TextView DexSave = (TextView) mView.findViewById(R.id.DexSave);
        TextView ConSave = (TextView) mView.findViewById(R.id.ConSave);
        TextView IntSave = (TextView) mView.findViewById(R.id.IntSave);
        TextView WisSave = (TextView) mView.findViewById(R.id.WisSave);
        TextView CharSave = (TextView) mView.findViewById(R.id.CharSave);
        //Initialize miscellaneous textviews

        TextView ProfVal = (TextView) mView.findViewById(R.id.ProfVal);
        //ProfVal.setText(Integer.toString(stats[6]));
        TextView IniVal = (TextView) mView.findViewById(R.id.IniVal);
        //IniVal.setText(Integer.toString(stats[7]));
        TextView ACVal = (TextView) mView.findViewById(R.id.ACVal);
        //ACVal.setText(Integer.toString(((stats[1] - 10)/2) + 10));
        TextView SpdVal = (TextView) mView.findViewById(R.id.SpdVal);
        //SpdVal.setText(Integer.toString(stats[8]));
        TextView PercVal = (TextView) mView.findViewById(R.id.PercVal);
        //PercVal.setText(Integer.toString(stats[9]));
        TextView HDCount = (TextView) mView.findViewById(R.id.HDCount);
        //HDCount.setText(Integer.toString(stats[10]));
        TextView HDType = (TextView) mView.findViewById(R.id.HDType);
        //HDType.setText("D" +Integer.toString(stats[11]));
        TextView HPCurr = (TextView) mView.findViewById(R.id.HpCurr);
        //HPCurr.setText(Integer.toString(stats[12]));
        TextView HPTotal = (TextView) mView.findViewById(R.id.HPTotal);
        //HPTotal.setText(Integer.toString(stats[13]));
        TextView TempHP = (TextView) mView.findViewById(R.id.TempHP);
        //TempHP.setText(Integer.toString(stats[14]));
        return this.mView;
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
