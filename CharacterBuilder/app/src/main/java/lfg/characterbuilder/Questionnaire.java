package lfg.characterbuilder;

import java.util.ArrayList;

/**
 * Created by Andy on 10/21/2015.
 */
public class Questionnaire {
    ArrayList<Question> questionList;

    public Questionnaire(){
        questionList = new ArrayList<Question>();
    }

    //prints the question at the chosen element
    void printElement(int location){
        Question quest = questionList.get(location);
        quest.QtoString();
    }

}
