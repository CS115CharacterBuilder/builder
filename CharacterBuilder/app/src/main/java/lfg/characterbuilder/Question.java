package lfg.characterbuilder;

/**
 * Created by Andy on 10/21/2015.
 */
public class Question {
    String questionText = "";
    String choiceOne = "";
    String choiceTwo = "";
    String choiceThree = "";
    String choiceFour = "";

    public Question(String aQuestion, String cOne, String cTwo, String cThree, String cFour){
        questionText = aQuestion;
        choiceOne = cOne;
        choiceTwo = cTwo;
        choiceThree = cThree;
        choiceFour = cFour;
    }
    //prints the question
    void QtoString(){
        System.out.println("Question: " + this.questionText);
        System.out.println("Choice One: " + this.choiceOne);
        System.out.println("Choice Two: " + this.choiceTwo);
        System.out.println("Choice Three: " + this.choiceThree);
        System.out.println("Choice Four: " + this.choiceFour);
}

}
