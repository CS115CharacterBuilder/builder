package lfg.characterbuilder;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class StatPage extends Fragment {

    /*TextView HPCurr = (TextView) getView().findViewById(R.id.HpCurr);
    TextView TempHP = (TextView) getView().findViewById(R.id.TempHP);
    TextView HDCount = (TextView) getView().findViewById(R.id.HDCount);*/
    protected View mView;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View fragmentView = inflater.inflate(R.layout.activity_stat_page, container, false);
        this.mView  = fragmentView;
        if (this.mView == null) {
            Toast.makeText(getActivity(),"FragmentView was null", Toast.LENGTH_SHORT).show();
        }
        TextView HPCurr = (TextView) mView.findViewById(R.id.HpCurr);
        TextView TempHP = (TextView) mView.findViewById(R.id.TempHP);
        TextView HDCount = (TextView) mView.findViewById(R.id.HDCount);
        //Initialize stat modifier textviews
        TextView StrMod = (TextView) mView.findViewById(R.id.StrMod);
        TextView DexMod = (TextView) mView.findViewById(R.id.DexMod);
        TextView ConMod = (TextView) mView.findViewById(R.id.ConMod);
        TextView IntMod = (TextView) mView.findViewById(R.id.IntMod);
        TextView WisMod = (TextView) mView.findViewById(R.id.WisMod);
        TextView CharMod = (TextView) mView.findViewById(R.id.CharMod);
        //Initialize stat value textviews
        TextView StrVal = (TextView) mView.findViewById(R.id.StrVal);
        TextView DexVal = (TextView) mView.findViewById(R.id.DexVal);
        TextView ConVal = (TextView) mView.findViewById(R.id.ConVal);
        TextView IntVal = (TextView) mView.findViewById(R.id.IntVal);
        TextView WisVal = (TextView) mView.findViewById(R.id.WisVal);
        TextView CharVal = (TextView) mView.findViewById(R.id.CharVal);
        //Initialize stat save textviews
        TextView StrSave = (TextView) mView.findViewById(R.id.StrSave);
        TextView DexSave = (TextView) mView.findViewById(R.id.DexSave);
        TextView ConSave = (TextView) mView.findViewById(R.id.ConSave);
        TextView IntSave = (TextView) mView.findViewById(R.id.IntSave);
        TextView WisSave = (TextView) mView.findViewById(R.id.WisSave);
        TextView CharSave = (TextView) mView.findViewById(R.id.CharSave);
        //Initialize miscellaneous textviews
        TextView ProfVal = (TextView) mView.findViewById(R.id.ProfVal);
        TextView IniVal = (TextView) mView.findViewById(R.id.IniVal);
        TextView ACVal = (TextView) mView.findViewById(R.id.ACVal);
        TextView SpdVal = (TextView) mView.findViewById(R.id.SpdVal);
        TextView PercVal = (TextView) mView.findViewById(R.id.PercVal);
        TextView HDType = (TextView) mView.findViewById(R.id.HDType);

        TextView HPTotal = (TextView) mView.findViewById(R.id.HPTotal);
        return inflater.inflate(R.layout.activity_stat_page,container,false);
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
/*
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
    */
}
