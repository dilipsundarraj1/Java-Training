package com.learnJava.interfaces;

/**
 * Created by z001qgd on 1/5/18.
 */
public class Question implements  Complexity {


    private String question, answer;
    private int complexity;

    public Question(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    @Override
    public void setComplexity(int level) {

     complexity = level;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public int getComplexity() {
        return complexity;
    }


}
