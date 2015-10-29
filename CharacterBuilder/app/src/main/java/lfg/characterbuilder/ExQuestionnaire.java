package lfg.characterbuilder;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class ExQuestionnaire extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private int questionNumber;
    private int numberOfQuestions = 4;
    private int check;
    private Boolean answeringQuestions;
    private String questionType = "";
    private Homunculus characterTransit = new Homunculus();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex_questionnaire);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        questionNumber = 0;
        answeringQuestions = true;
        check = 0;

        TextView exQuestion = (TextView)findViewById(R.id.mainQuestionEx);
        Spinner experiencedSpinner = (Spinner)findViewById(R.id.exSpinner);

        ArrayAdapter<CharSequence> raceAdapter = ArrayAdapter.createFromResource(this,R.array.raceSpinner,
                android.R.layout.simple_spinner_item);

        ArrayAdapter<CharSequence> classAdapter = ArrayAdapter.createFromResource(this,R.array.classSpinner,
                android.R.layout.simple_spinner_item);

        ArrayAdapter<CharSequence> backgroundAdapter = ArrayAdapter.createFromResource(this,R.array.backgroundSpinner,
                android.R.layout.simple_spinner_item);


        //SETTING AN ADAPTER CHOOSES THE VIEWS THAT POPULATE THE SPINNER.
        experiencedSpinner.setAdapter(raceAdapter);
        //experiencedSpinner.setAdapter(classAdapter);
        //experiencedSpinner.setAdapter(backgroundAdapter);
        experiencedSpinner.setOnItemSelectedListener(this);


        //TextView exChoiceOne = (TextView)findViewById(R.id.choiceOneEx);
        //TextView exChoiceTwo = (TextView)findViewById(R.id.choiceTwoEx);
        //TextView exChoiceThree = (TextView)findViewById(R.id.choiceThreeEx);
        //TextView exChoiceFour = (TextView)findViewById(R.id.choiceFourEx);
        Questionnaire xQuestionnaire = new Questionnaire();
        exQuestion.setText(R.string.exQuestionOne);



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void onItemSelected(AdapterView<?> parent, View view,
                               int pos, long id) {
        //String click = experiencedSpinner.getSelectedItem().toString(); selects the object that was clicked
        //questionNumber++;
        check = check + 1;
        if(check > 1 && pos != 0) {
            questionNumber++;
            Spinner questionSpinner = (Spinner) findViewById(R.id.exSpinner);
            String attri = questionSpinner.getSelectedItem().toString();
            TextView mainQuestion = (TextView) findViewById(R.id.mainQuestionEx);
            displayQuestion(mainQuestion, questionSpinner, questionNumber, attri);
            //questionNumber++;
            Toast.makeText(ExQuestionnaire.this, attri, Toast.LENGTH_SHORT).show();
            determineAttributeToAdd(characterTransit, attri, questionType);
        }
    }

    public void onNothingSelected(AdapterView<?> parent) {
        // Another interface callback
    }
    //figures out the correct adapter to use base on class chosen
    private ArrayAdapter<CharSequence> determineSubraceSpinner(String race){
        ArrayAdapter<CharSequence> subraceSpinner;
        if(race.equals("Dwarf")){
            subraceSpinner = ArrayAdapter.createFromResource(this,R.array.subDwarfSpinner,
                    android.R.layout.simple_spinner_item);
        }
        else if(race.equals("Elf")){
            subraceSpinner = ArrayAdapter.createFromResource(this,R.array.subElfSpinner,
                    android.R.layout.simple_spinner_item);
        }
        else if(race.equals("Halfling")){
            subraceSpinner = ArrayAdapter.createFromResource(this,R.array.subHalflingSpinner,
                    android.R.layout.simple_spinner_item);
        }
        else if(race.equals("Dragonborn")){
            subraceSpinner = ArrayAdapter.createFromResource(this,R.array.subDragonbornSpinner,
                    android.R.layout.simple_spinner_item);
        }
        else{ //Gnomes
            subraceSpinner = ArrayAdapter.createFromResource(this,R.array.subGnomeSpinner,
                    android.R.layout.simple_spinner_item);
        }
        return subraceSpinner;
    }

    //give a string and a Homunculus and it will set the proper string.
    private void determineAttributeToAdd(Homunculus hom, String attribute, String type){
        if(type.equals("Race")) {
            hom.setRace(attribute);
        }
        else if(type.equals("SubRace")){
            hom.setSubrace(attribute);
        }
        else if(type.equals("Class")){
            hom.sethClass(attribute);
        }
        else if(type.equals("Background")){
            hom.setBackGround(attribute);
        }
    }

    //handles changing adapter when you move back and forth in the questionnaire, also questionType
    // is used to manipulate the determineAttributeToAdd class.
    private void displayQuestion(TextView _question, Spinner spinner, /*ArrayAdapter<CharSequence> adapter,*/ int qNumber, String bonusString){
        ArrayAdapter<CharSequence> newAdapter;
            switch (qNumber) {
                case 0:
                    Toast.makeText(ExQuestionnaire.this, "ayyy lmao you're in case 0", Toast.LENGTH_SHORT).show();
                    _question.setText(R.string.exQuestionOne);
                    newAdapter = ArrayAdapter.createFromResource(this, R.array.raceSpinner,
                            android.R.layout.simple_spinner_item);
                    spinner.setAdapter(newAdapter);
                    questionType = "Race";
                    break;
                case 1:
                    Toast.makeText(ExQuestionnaire.this, "ayyy lmao you're in case 1", Toast.LENGTH_SHORT).show();
                    //CONTINUE HERE BRO
                    _question.setText(R.string.exQuestionTwo);
                    //looks at the race and then assigns a subrace spinner.
                    ArrayAdapter<CharSequence> tempAdapter = determineSubraceSpinner(bonusString);
                    newAdapter = tempAdapter;
                    spinner.setAdapter(newAdapter);
                    questionType = "Race";
                    break;
                case 2:
                    Toast.makeText(ExQuestionnaire.this, "You're in case 2 nowwwwwwwww", Toast.LENGTH_SHORT).show();
                    _question.setText(R.string.exQuestionThree);
                    newAdapter = ArrayAdapter.createFromResource(this, R.array.classSpinner,
                            android.R.layout.simple_spinner_item);
                    spinner.setAdapter(newAdapter);
                    questionType = "SubRace";
                    break;
                case 3:
                    Toast.makeText(ExQuestionnaire.this, "You're in case 3 =]", Toast.LENGTH_SHORT).show();
                    _question.setText(R.string.exQuestionFour);
                    newAdapter = ArrayAdapter.createFromResource(this, R.array.classSpinner,
                            android.R.layout.simple_spinner_item);
                    spinner.setAdapter(newAdapter);
                    questionType = "Class";
                    break;
                case 4:
                    questionType = "Background";
                    break;
            }
            //questionNumber++;
    }
}


