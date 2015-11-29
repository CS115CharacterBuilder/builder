package lfg.characterbuilder;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class BackgroundPage extends Fragment {
    Character gotChar;
    View mView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        super.onCreateView(inflater, container, savedInstanceState);
        Bundle args = getArguments();
        gotChar = args.getParcelable("charToStats");
        View fragmentView = inflater.inflate(R.layout.activity_background_page, container, false);
        mView = fragmentView;
        EditText NameVal = (EditText) this.mView.findViewById(R.id.NameVal);
        NameVal.setText(gotChar.getCharacterName());
        TextView ClassVal = (TextView) this.mView.findViewById(R.id.ClassVal);
        ClassVal.setText(gotChar.getCharacterClass());
        TextView LvlVal = (TextView) this.mView.findViewById(R.id.LvlVal);
        LvlVal.setText(Integer.toString(gotChar.getLevel()));
        EditText AlignmentVal = (EditText) this.mView.findViewById(R.id.AlignmentVal);
        AlignmentVal.setText(gotChar.getAlignment());
        EditText DeityVal = (EditText) this.mView.findViewById(R.id.DeityVal);
        DeityVal.setText(gotChar.getDeity());
        EditText BackgroundVal = (EditText) this.mView.findViewById(R.id.BackgroundVal);
        BackgroundVal.setText(gotChar.getType());
        String Name = NameVal.getText().toString();
        String Class = ClassVal.getText().toString();
        String Lvl = LvlVal.getText().toString();
        String Alignment = AlignmentVal.getText().toString();
        String Deity = DeityVal.getText().toString();
        String Background = BackgroundVal.getText().toString();
        return this.mView;
    }
}
