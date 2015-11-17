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
        void iterateAndAdd(ArrayList<NQTag> arrayOfTags, Homunculus hom){
            for(int i = 0; i < arrayOfTags.size(); i++){
                for(int j = 0; j < arrayOfTags.get(i).tagList.size(); j++){
                    //create a method in homunculus that parses the string
                    hom.parseString(arrayOfTags.get(i).tagList.get(j));
                }
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
        testList.add("Barbarian");
        NQTag test = new NoobQuestionnaire.NQTag(testList);

        tagArray.add(test);
//--------------------------------------------------------------------------------------------------

//-----------------------------------------Tag 0.1--------------------------------------------------
        ArrayList<String> listOneTwo = new ArrayList<String>();
        listOneTwo.add("Fighter");
        //listOneTwo.add("listOneTwo");
        //listOneTwo.add("this is only a test");
        NQTag tagOneTwo = new NoobQuestionnaire.NQTag(listOneTwo);

        tagArray.add(tagOneTwo);
//--------------------------------------------------------------------------------------------------
//-----------------------------------------Tag 0.2--------------------------------------------------
        ArrayList<String> listZeroTwo = new ArrayList<String>();
        listZeroTwo.add("Monk");
        NQTag tagZeroTwo = new NoobQuestionnaire.NQTag(listZeroTwo);

        tagArray.add(tagZeroTwo);
//--------------------------------------------------------------------------------------------------
//-----------------------------------------Tag 0.3--------------------------------------------------
        ArrayList<String> listZeroThree = new ArrayList<String>();
        listZeroThree.add("Ranger");
        NQTag tagZeroThree = new NoobQuestionnaire.NQTag(listZeroThree);

        tagArray.add(tagZeroThree);
//--------------------------------------------------------------------------------------------------

//-----------------------------------------Tag 1.0--------------------------------------------------
        ArrayList<String> listOneZero = new ArrayList<String>();
        listOneZero.add("Ranger");
        listOneZero.add("Bard");
        listOneZero.add("Monk");
        listOneZero.add("Rogue");
        listOneZero.add("Elves");
        listOneZero.add("Half-Elves");
        listOneZero.add("Halflings");
        NQTag tagOneZero = new NoobQuestionnaire.NQTag(listOneZero);

        tagArray.add(tagOneZero);
//-----------------------------------------Tag 1.0--------------------------------------------------
//-----------------------------------------Tag 1.1--------------------------------------------------
        ArrayList<String> listOneOne = new ArrayList<String>();
        listOneOne.add("Fighter");
        listOneOne.add("Barbarian");
        listOneOne.add("Half-Orc");
        listOneOne.add("Dwarf");
        listOneOne.add("Dragonborn");
        NQTag tagOneOne = new NoobQuestionnaire.NQTag(listOneOne);

        tagArray.add(tagOneOne);
//-----------------------------------------Tag 1.1--------------------------------------------------

//-----------------------------------------Tag 2.0--------------------------------------------------
        ArrayList<String> listTwoZero = new ArrayList<String>();
        listTwoZero.add("Barbarian");
        listTwoZero.add("Half-Orc");
        listTwoZero.add("Dragonborn");
        listTwoZero.add("Dwarf");

        NQTag tagTwoZero = new NoobQuestionnaire.NQTag(listTwoZero);

        tagArray.add(tagTwoZero);
//-----------------------------------------Tag 2.0--------------------------------------------------

//-----------------------------------------Tag 2.1--------------------------------------------------

        ArrayList<String> listTwoOne = new ArrayList<String>();
        listTwoOne.add("Fighter");
        listTwoOne.add("Paladin");
        listTwoOne.add("Monk");
        listTwoOne.add("Dwarf");
        listTwoOne.add("Human");

        NQTag tagTwoOne = new NoobQuestionnaire.NQTag(listTwoOne);

        tagArray.add(tagTwoOne);
//-----------------------------------------Tag 2.1--------------------------------------------------

//-----------------------------------------Tag 3.0--------------------------------------------------
        //its better to be
        //physically powerful
        ArrayList<String> listThreeZero = new ArrayList<String>();
        listThreeZero.add("Barbarian");
        listThreeZero.add("Fighter");
        listThreeZero.add("Half-Orc");
        listThreeZero.add("Dragonborn");
        listThreeZero.add("Dwarf");

        NQTag tagThreeZero = new NoobQuestionnaire.NQTag(listThreeZero);

        tagArray.add(tagThreeZero);

//-----------------------------------------Tag 3.0--------------------------------------------------
//-----------------------------------------Tag 3.1--------------------------------------------------
        ArrayList<String> listThreeOne = new ArrayList<String>();
        listThreeOne.add("Monk");
        listThreeOne.add("Ranger");
        listThreeOne.add("Rogue");
        listThreeOne.add("Elf");
        listThreeOne.add("Half-Elf");
        listThreeOne.add("Tiefling");
        listThreeOne.add("Halfling");
        listThreeOne.add("Gnome");

        NQTag tagThreeOne = new NoobQuestionnaire.NQTag(listThreeOne);

        tagArray.add(tagThreeOne);
//-----------------------------------------Tag 3.1--------------------------------------------------



        //displays the questions at the start
        displayQuestion(questionNumber, mainQuestion, choiceOne, choiceTwo, choiceThree, choiceFour, tagArray, tagParseArray);

        choiceOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(NoobQuestionnaire.this, "Ayy lmao, this is a test for the onClick", Toast.LENGTH_SHORT).show();
                choiceOne.setText("clicked!");
                NQTag tempTag = (NQTag) v.getTag();
                //tempTag.printList();
                tagParseArray.add(tempTag);
                for(int a = 0; a < tagParseArray.size(); a++){
                  tagParseArray.get(a).printList();
                }
                displayQuestion(questionNumber, mainQuestion, choiceOne, choiceTwo, choiceThree, choiceFour, tagArray, tagParseArray);

            }
        });
        choiceTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(NoobQuestionnaire.this, "Ayy lmao, this is a test for the onClick", Toast.LENGTH_SHORT).show();
                choiceTwo.setText("clicked!");
                NQTag tempTag = (NQTag) v.getTag();
                //tempTag.printList();
                tagParseArray.add(tempTag);
                displayQuestion(questionNumber, mainQuestion, choiceOne, choiceTwo, choiceThree, choiceFour, tagArray, tagParseArray);
            }
        });
        choiceThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(NoobQuestionnaire.this, "Ayy lmao, this is a test for the onClick", Toast.LENGTH_SHORT).show();
                choiceThree.setText("clicked!");
                NQTag tempTag = (NQTag) v.getTag();
                //tempTag.printList();
                tagParseArray.add(tempTag);
                displayQuestion(questionNumber, mainQuestion, choiceOne, choiceTwo, choiceThree, choiceFour, tagArray, tagParseArray);
            }
        });
        choiceFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(NoobQuestionnaire.this, "Ayy lmao, this is a test for the onClick", Toast.LENGTH_SHORT).show();
                choiceFour.setText("clicked!");
                NQTag tempTag = (NQTag) v.getTag();
                //tempTag.printList();
                tagParseArray.add(tempTag);
                displayQuestion(questionNumber, mainQuestion, choiceOne, choiceTwo, choiceThree, choiceFour, tagArray, tagParseArray);

            }
        });

   // mainQuestion.setText(nQuestionnaire.questionList.get(currentIndex).questionText);


    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        //Toast.makeText(NoobQuestionnaire.this, "Ayy lmao, OITEMCLICK", Toast.LENGTH_SHORT).show();
    }

    //sets up the text and the tags. Each case is a new question
    public void displayQuestion(int qNumber, TextView main, TextView one, TextView two, TextView three, TextView four,
                                ArrayList<NQTag> questionTagArray, ArrayList<NQTag> parseArray){
        switch(qNumber){
            case 0:
                main.setText("The following statement most accurately describes my athletic ability.");
                one.setText("I was picked to Play for a professional sports team");
                one.setTag(questionTagArray.get(questionNumber * 4));
                two.setText("When being picked for a team, I am always picked first");
                two.setTag(questionTagArray.get(questionNumber * 4 + 1));
                three.setText("I have some athletic ability, but it isn't noteworthy");
                three.setTag(questionTagArray.get(questionNumber * 4 + 2));
                four.setText("When being picked for a team, I'm always last");
                four.setTag(questionTagArray.get(questionNumber * 4 + 3));
                questionNumber++;
                break;
            //TAGS 4,5
            case 1:
                main.setText("It's better to be:");
                one.setText("Graceful");
                one.setTag(questionTagArray.get(4));
                two.setText("Tough");
                two.setTag(questionTagArray.get(5));
                three.setVisibility(three.INVISIBLE);
                four.setVisibility(three.INVISIBLE);
                questionNumber++;
                break;
            //TAGS 6,7
            case 2:
                main.setText("Its better to have");
                one.setText("Great Strength");
                one.setTag(questionTagArray.get(6));
                two.setText("Great Stamina");
                two.setTag(questionTagArray.get(7));
                questionNumber++;
                break;
            //tags 7,8
            case 3:
                main.setText("Its better to be");
                one.setText("Physically Powerful");
                one.setTag(questionTagArray.get(7));
                two.setText("Physically Agile");
                two.setTag(questionTagArray.get(7));
                questionNumber++;
                break;
            //tags 9.10
            case 4:
                main.setText("It's worse to be:");
                one.setText("Unliked");
                one.setTag(questionTagArray.get(9));
                two.setText("Weak");
                two.setTag(questionTagArray.get(10));
                questionNumber++;
                break;
            //tags 11, 12
            case 5:
                main.setText("It's worse to be:");
                one.setText("Too Skinny");
                one.setTag(questionTagArray.get(11));
                two.setText("Too Stocky");
                two.setTag(questionTagArray.get(12));
                questionNumber++;
                break;
            //tags 13, 14
            case 6:
                main.setText("It's better to be:");
                one.setText("Smart");
                one.setTag(questionTagArray.get(13));
                two.setText("Strong");
                two.setTag(questionTagArray.get(14));
                questionNumber++;
                break;
            //tags 15, 16
            case 7:
                main.setText("The wilderness is a nice place to visit, but I wouldn't want to live there.");
                one.setText("True");
                one.setTag(questionTagArray.get(15));
                two.setText("False");
                two.setTag(questionTagArray.get(16));
                questionNumber++;
                break;
            default:
                break;
        }
        //for(int a = 0; a < parseArray.size(); a++){
            //parseArray.get(a).printList();
        //}
    }

}
