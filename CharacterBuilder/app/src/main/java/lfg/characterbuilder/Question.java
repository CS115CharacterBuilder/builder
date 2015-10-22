package lfg.characterbuilder;

/**
 * Created by Andy on 10/21/2015.
 */
public class Question {
    String question = "";
    String choiceOne = "";
    String choiceTwo = "";
    String choiceThree = "";
    String choiceFour = "";

    public Question(String aQuestion, String cOne, String cTwo, String cThree, String cFour){
        question = aQuestion;
        choiceOne = cOne;
        choiceTwo = cTwo;
        choiceThree = cThree;
        choiceFour = cFour;
    }

}
