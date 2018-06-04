package org.launchcode.java.studios.QuizTime;

import java.util.ArrayList;

public class MultipleChoice extends Question {

    private String displayChoices;
    private String result;

    public MultipleChoice(String question, ArrayList<String> choices, String answer, int points) {
        super(question, choices, answer, points);
    }
    public String askQuestion(){
        String opener = "This is a Multiple Choice question:";
        String explain = "\nHere are your choices:";

        for (String entry : this.questionChoices) {
            displayChoices.concat("\n" + entry);
        }
        String prompt = "Enter your choice answer here (as a number):";
        return opener + explain + displayChoices + prompt;
    }

    public boolean processAnswer(String input){
        if input.equals(this.questionAnswer) {
            this.isUserCorrect == true;
        }
    }

    public String tellAnswer(boolean whaHappen) {
        String opener = "The correct answer is:\n";
        if (whaHappen == true) {
            result = "You are correct!\n";
        } else {
            result = "You are wrong!\n";
        }
        String score = "This question was worth" + this.questionPoints;
        return opener + this.questionAnswer + "/n"+ result + score + "\n";
    }
}
