package lfg.characterbuilder;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;


// THIS CLASS IS NOT YET IMPLEMENTED ---------------------------------------------------------------

public class NoobQuestionnaire extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noob_questionnaire);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
       /*
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        */
    int currentIndex = 0;
    TextView mainQuestion = (TextView)findViewById(R.id.questText);
    TextView choiceOne = (TextView)findViewById(R.id.cOneText);
    TextView choiceTwo = (TextView)findViewById(R.id.cTwoText);
    TextView choiceThree = (TextView)findViewById(R.id.cThreeText);
    TextView choiceFour = (TextView)findViewById(R.id.cFourText);

    Questionnaire nQuestionnaire = new Questionnaire();
    Question testQuestion = new Question("ayy Lmao", "my", "darling", "dansGame", "twitch.tv");
    nQuestionnaire.questionList.add(testQuestion);
    nQuestionnaire.printElement(0);

    mainQuestion.setText(nQuestionnaire.questionList.get(currentIndex).questionText);
    }
}
