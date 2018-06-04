package org.launchcode.java.studios.QuizTime;

import java.util.ArrayList;

public abstract class Question {

    protected String questionBody;
    protected ArrayList<String> questionChoices;
    protected String questionAnswer;
    protected int questionPoints;
    protected String userInput;
    protected boolean isUserCorrect;

    protected Question(String aQuestion, ArrayList<String> theChoices, String aAnswer, int thePoints) {
        this.questionBody = aQuestion;
        this.questionChoices = theChoices;
        this.questionAnswer = aAnswer;
        this.questionPoints = thePoints;
    }

    protected abstract String askQuestion();
    protected abstract boolean processAnswer(String input);
    protected abstract String tellAnswer(boolean isUserCorrect);

}
