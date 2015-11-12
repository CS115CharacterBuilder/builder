package lfg.characterbuilder;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;


// THIS CLASS IS NOT YET IMPLEMENTED FULLY ---------------------------------------------------------
// BASE FUNCTIONALITY WORKS


public class NoobQuestionnaire extends AppCompatActivity implements AdapterView.OnItemClickListener {
    int questionNumber;
    //ARRAY USED TO PARSE QUESTIONS AFTER QUESTIONNAIRE IS OVER
    ArrayList<NQTag> tagParseArray = new ArrayList<NQTag>();

    //ALL TAGS ARE CONTAINED HERE
    ArrayList<NQTag> tagArray = new ArrayList<NQTag>();


    class NQTag{
        String hello;
        ArrayList<String> tagList;
        NQTag(ArrayList<String> attributes){
            //hello = "hello!";
            //Toast.makeText(NoobQuestionnaire.this, "Ayy lmao, this is a test for the INSIDE", Toast.LENGTH_SHORT).show();
            tagList = new ArrayList<String>(attributes);
        }

        void printHello(){
            Log.d("nqtag", "This is working!");
        }
        void printList(){
            for(int i = 0; i < this.tagList.size(); i++){
                Log.d("tagList", this.tagList.get(i));
            }
        }
    }






    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noob_questionnaire);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        questionNumber = 0;
//----------------------------------TEXTVIEWS--------------------------------------------------------
        final TextView mainQuestion = (TextView)findViewById(R.id.questText);
        final TextView choiceOne = (TextView)findViewById(R.id.cOneText);
        final TextView choiceTwo = (TextView)findViewById(R.id.cTwoText);
        final TextView choiceThree = (TextView)findViewById(R.id.cThreeText);
        final TextView choiceFour = (TextView)findViewById(R.id.cFourText);
//----------------------------------TEXTVIEWS--------------------------------------------------------

//----------------------------Tag 0.0---------------------------------------------------------
        ArrayList<String> testList = new ArrayList<String>();
        testList.add("This");
        testList.add("is");
        testList.add("a");
        testList.add("Test");
        NQTag test = new NoobQuestionnaire.NQTag(testList);

        tagArray.add(test);
//--------------------------------------------------------------------------------------------------

//-----------------------------------------Tag 0.1--------------------------------------------------
        ArrayList<String> listOneTwo = new ArrayList<String>();
        listOneTwo.add("test");
        listOneTwo.add("for");
        listOneTwo.add("listOneTwo");
        listOneTwo.add("this is only a test");
        NQTag tagOneTwo = new NoobQuestionnaire.NQTag(listOneTwo);

        tagArray.add(tagOneTwo);
//--------------------------------------------------------------------------------------------------
//-----------------------------------------Tag 0.2--------------------------------------------------
        ArrayList<String> listZeroTwo = new ArrayList<String>();
        listZeroTwo.add("test");
        listZeroTwo.add("for");
        listZeroTwo.add("listOneTwo");
        listZeroTwo.add("this is only a test");
        NQTag tagZeroTwo = new NoobQuestionnaire.NQTag(listZeroTwo);

        tagArray.add(tagZeroTwo);
//--------------------------------------------------------------------------------------------------
//-----------------------------------------Tag 0.3--------------------------------------------------
        ArrayList<String> listZeroThree = new ArrayList<String>();
        listZeroThree.add("test");
        listZeroThree.add("for");
        listZeroThree.add("listOneTwo");
        listZeroThree.add("this is only a test");
        NQTag tagZeroThree = new NoobQuestionnaire.NQTag(listZeroThree);

        tagArray.add(tagZeroThree);
//--------------------------------------------------------------------------------------------------
        //displays the questions at the start
        displayQuestion(questionNumber, mainQuestion, choiceOne, choiceTwo, choiceThree, choiceFour, tagArray, tagParseArray);

        choiceOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(NoobQuestionnaire.this, "Ayy lmao, this is a test for the onClick", Toast.LENGTH_SHORT).show();
                choiceOne.setText("clicked!");
                NQTag tempTag = (NQTag) v.getTag();
                tempTag.printList();
                tagParseArray.add(tempTag);

                displayQuestion(questionNumber, mainQuestion, choiceOne, choiceTwo, choiceThree, choiceFour, tagArray, tagParseArray);

            }
        });
        choiceTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(NoobQuestionnaire.this, "Ayy lmao, this is a test for the onClick", Toast.LENGTH_SHORT).show();
                choiceTwo.setText("clicked!");
                NQTag tempTag = (NQTag) v.getTag();
                tempTag.printList();
                tagParseArray.add(tempTag);
            }
        });
        choiceThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(NoobQuestionnaire.this, "Ayy lmao, this is a test for the onClick", Toast.LENGTH_SHORT).show();
                choiceThree.setText("clicked!");
                NQTag tempTag = (NQTag) v.getTag();
                tempTag.printList();
                tagParseArray.add(tempTag);
            }
        });
        choiceFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(NoobQuestionnaire.this, "Ayy lmao, this is a test for the onClick", Toast.LENGTH_SHORT).show();
                choiceFour.setText("clicked!");
                NQTag tempTag = (NQTag) v.getTag();
                tempTag.printList();
                tagParseArray.add(tempTag);

            }
        });

   // mainQuestion.setText(nQuestionnaire.questionList.get(currentIndex).questionText);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        //Toast.makeText(NoobQuestionnaire.this, "Ayy lmao, OITEMCLICK", Toast.LENGTH_SHORT).show();
    }

    public void displayQuestion(int qNumber, TextView main, TextView one, TextView two, TextView three, TextView four,
                                ArrayList<NQTag> questionTagArray, ArrayList<NQTag> parseArray){
        switch(qNumber){
            case 0:
                main.setText("The following statement most accurately describes my athletic ability.");
                one.setText("I was picked to Play for a professional sports team");
                one.setTag(questionTagArray.get(questionNumber * 4));
                two.setText("When being picked for a team, I am always picked first");
                one.setTag(questionTagArray.get(questionNumber * 4 + 1));
                three.setText("I have some athletic ability, but it isn't noteworthy");
                one.setTag(questionTagArray.get(questionNumber * 4 + 2));
                four.setText("When being picked for a team, I'm always last");
                one.setTag(questionTagArray.get(questionNumber * 4 + 3));
                questionNumber++;
                break;
            case 1:
                main.setText("Oh boy here we go, touching me a shit");
                break;
            default:
                break;
        }
    }

}
