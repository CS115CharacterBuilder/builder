package lfg.characterbuilder;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class StatPage extends Fragment {
    protected View mView;

    Character gotChar;
    static TextView HPCurr;
    static TextView TempHP;
    static TextView HDCount;
    int[] stats;
    boolean[] stats_prof;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View fragmentView = inflater.inflate(R.layout.activity_stat_page, container, false);
        this.mView = fragmentView;
        //gotChar = getActivity().getIntent().getParcelableExtra("characterTag");

        //Grab and set stats bundle
        Bundle args = getArguments();
        //gotChar = args.getParcelable("CharacterTag");
        int[] caughtStatsArray = args.getIntArray("statsToFrag");
        stats = caughtStatsArray;
        boolean[] caughtStatProfArray = args.getBooleanArray("statProfBundle");
        if (caughtStatProfArray == null) {
            boolean[] statsproficiencies = new boolean[6];
            for(int i = 0; i < statsproficiencies.length; i++){
                if(i%2 == 0){
                    statsproficiencies[i] = false;
                }
                else {
                    statsproficiencies[i] = true;
                }
            }
            stats_prof = statsproficiencies;
        }
        else stats_prof = caughtStatProfArray;
        
        //Grab and set character
        gotChar = args.getParcelable("charToStats");

        //Initialize stat value textviews
        HPCurr = (TextView) mView.findViewById(R.id.HpCurr);
        TempHP = (TextView) mView.findViewById(R.id.TempHP);
        HDCount = (TextView) mView.findViewById(R.id.HDCount);


        TextView StrVal = (TextView) mView.findViewById(R.id.StrVal);
        StrVal.setText(Integer.toString(stats[0]));
        TextView DexVal = (TextView) mView.findViewById(R.id.DexVal);
        DexVal.setText(Integer.toString(stats[1]));
        TextView ConVal = (TextView) mView.findViewById(R.id.ConVal);
        ConVal.setText(Integer.toString(stats[2]));
        TextView IntVal = (TextView) mView.findViewById(R.id.IntVal);
        IntVal.setText(Integer.toString(stats[3]));
        TextView WisVal = (TextView) mView.findViewById(R.id.WisVal);
        WisVal.setText(Integer.toString(stats[4]));
        TextView CharVal = (TextView) mView.findViewById(R.id.CharVal);
        CharVal.setText(Integer.toString(stats[5]));
        //Initialize stat modifier textviews
        TextView StrMod = (TextView) mView.findViewById(R.id.StrMod);
        StrMod.setText(modToString(findMod(stats[0])));
        TextView DexMod = (TextView) mView.findViewById(R.id.DexMod);
        DexMod.setText(modToString(findMod(stats[1])));
        TextView ConMod = (TextView) mView.findViewById(R.id.ConMod);
        ConMod.setText(modToString(findMod(stats[2])));
        TextView IntMod = (TextView) mView.findViewById(R.id.IntMod);
        IntMod.setText(modToString(findMod(stats[3])));
        TextView WisMod = (TextView) mView.findViewById(R.id.WisMod);
        WisMod.setText(modToString(findMod(stats[4])));
        TextView CharMod = (TextView) mView.findViewById(R.id.CharMod);
        CharMod.setText(modToString(findMod(stats[5])));

        //Initialize stat save textviews
        TextView StrSave = (TextView) mView.findViewById(R.id.StrSave);
        StrSave.setText(modToString(addProf(findMod(stats[0]),0)));
        TextView DexSave = (TextView) mView.findViewById(R.id.DexSave);
        DexSave.setText(modToString(addProf(findMod(stats[1]),1)));
        TextView ConSave = (TextView) mView.findViewById(R.id.ConSave);
        ConSave.setText(modToString(addProf(findMod(stats[2]),2)));
        TextView IntSave = (TextView) mView.findViewById(R.id.IntSave);
        IntSave.setText(modToString(addProf(findMod(stats[3]),3)));
        TextView WisSave = (TextView) mView.findViewById(R.id.WisSave);
        WisSave.setText(modToString(addProf(findMod(stats[4]),4)));
        TextView CharSave = (TextView) mView.findViewById(R.id.CharSave);
        CharSave.setText(modToString(addProf(findMod(stats[5]),5)));

        //Initialize miscellaneous textviews
        TextView ProfVal = (TextView) mView.findViewById(R.id.ProfVal);
        ProfVal.setText(Integer.toString(stats[6]));
        TextView IniVal = (TextView) mView.findViewById(R.id.IniVal);
        IniVal.setText(Integer.toString(stats[7]));
        TextView ACVal = (TextView) mView.findViewById(R.id.ACVal);
        ACVal.setText(Integer.toString(((stats[1] - 10)/2) + 10));
        TextView SpdVal = (TextView) mView.findViewById(R.id.SpdVal);
        SpdVal.setText(Integer.toString(stats[8]));
        TextView PercVal = (TextView) mView.findViewById(R.id.PercVal);
        PercVal.setText(Integer.toString(stats[9]));
        final TextView HDCount = (TextView) mView.findViewById(R.id.HDCount);
        HDCount.setText(Integer.toString(stats[10]));
        TextView HDType = (TextView) mView.findViewById(R.id.HDType);
        HDType.setText("D" +Integer.toString(stats[11]));
        final TextView HPCurr = (TextView) mView.findViewById(R.id.HpCurr);
        HPCurr.setText(Integer.toString(stats[12]));
        TextView HPTotal = (TextView) mView.findViewById(R.id.HPTotal);
        HPTotal.setText(" /" + Integer.toString(stats[13]));
        final TextView TempHP = (TextView) mView.findViewById(R.id.TempHP);
        TempHP.setText(Integer.toString(stats[14]));

        //initialize buttons
        Button hdAdd = (Button) mView.findViewById(R.id.HDAddBtn);
        hdAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int hdCount = stats[10];
                hdCount += 1;
                stats[10] = hdCount;
                String newHDCount = Integer.toString(hdCount);
                HDCount.setText(newHDCount);
            }
        });
        Button hdSub = (Button) mView.findViewById(R.id.HDSubBtn);
        hdSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int hdCount = stats[10];
                if(hdCount == 0) { return;}
                hdCount -= 1;
                stats[10] = hdCount;
                String newHDCount = Integer.toString(hdCount);
                HDCount.setText(newHDCount);
            }
        });
        Button hpAdd = (Button) mView.findViewById(R.id.HPAddBtn);
        hpAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int hp = stats[12];
                if(hp == stats[13]) { return;}
                hp += 1;
                stats[12] = hp;
                String newhp = Integer.toString(hp);
                HPCurr.setText(newhp);
            }
        });
        Button hpSub = (Button) mView.findViewById(R.id.HPSubBtn);
        hpSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int hp = stats[12];
                if(hp == 0) { return;}
                hp -= 1;
                stats[12] = hp;
                String newhp = Integer.toString(hp);
                HPCurr.setText(newhp);
            }
        });
        Button tempAdd = (Button) mView.findViewById(R.id.TempAddBtn);
        tempAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int TempHp = stats[14];
                TempHp += 1;
                stats[14] = TempHp;
                String newTempHp = Integer.toString(TempHp);
                TempHP.setText(newTempHp);
            }
        });
        Button TempSub = (Button) mView.findViewById(R.id.TempSubBtn);
        TempSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int TempHp = stats[14];
                if(TempHp == 0) { return;}
                TempHp -= 1;
                stats[14] = TempHp;
                String newTempHp = Integer.toString(TempHp);
                TempHP.setText(newTempHp);
            }
        });
        return this.mView;
    }

    //takes stat value and converts it into the modifier
    public int findMod(int x) {
        int statMod = (x - 10)/2;
        return statMod;
    }

    public int addProf(int x, int y) {
        int statMod = x;
        if(stats_prof[y]) {
            statMod = x + stats[6];
        }
        return statMod;
    }

    public String modToString(int statMod) {
        String modValue;
        if(statMod > 0) {
            modValue = "+" + Integer.toString(statMod);
        }else {
            modValue = Integer.toString(statMod);
        }
        return modValue;
    }

    public static int getStatPageHPCurr() {
        return Integer.parseInt(HPCurr.getText().toString());
    }

    public static int getStatPageTempHP() {
        return Integer.parseInt(TempHP.getText().toString());
    }

    public static int getStatPageHDCount() {
        return Integer.parseInt(HDCount.getText().toString());
    }

}
