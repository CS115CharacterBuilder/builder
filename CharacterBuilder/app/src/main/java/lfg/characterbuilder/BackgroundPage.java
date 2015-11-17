package lfg.characterbuilder;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BackgroundPage extends Fragment {
    Character gotChar = getActivity().getIntent().getParcelableExtra("characterTag");

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView NameVal = (TextView) getView().findViewById(R.id.NameVal);
        TextView ClassVal = (TextView) getView().findViewById(R.id.ClassVal);
        ClassVal.setText(gotChar.getCharacterName());
        TextView LvlVal = (TextView) getView().findViewById(R.id.LvlVal);
        LvlVal.setText(gotChar.getLevel());
        TextView AlignmentVal = (TextView) getView().findViewById(R.id.AlignmentVal);
        AlignmentVal.setText(gotChar.getAlignment());
        TextView DeityVal = (TextView) getView().findViewById(R.id.DeityVal);
        DeityVal.setText(gotChar.getDeity());
        TextView BackgroundVal = (TextView) getView().findViewById(R.id.BackgroundVal);
        BackgroundVal.setText(gotChar.getType());
        String Name = NameVal.getText().toString();
        String Class = ClassVal.getText().toString();
        String Lvl = LvlVal.getText().toString();
        String Alignment = AlignmentVal.getText().toString();
        String Deity = DeityVal.getText().toString();
        String Background = BackgroundVal.getText().toString();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.activity_background_page, container, false);
    }
}
