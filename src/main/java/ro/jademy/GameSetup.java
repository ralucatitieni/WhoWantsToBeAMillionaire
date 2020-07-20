package ro.jademy;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GameSetup {
    public ArrayList<Level> levelList = new ArrayList<Level>();
    public ArrayList<Question> questionList = new ArrayList<Question>();
    public static Scanner sc = new Scanner(System.in);
    public static Random random = new Random();


    public static GameSetup setupGame() {
        Question question1 = new Question("Who directed Goodfellas, The Wolf of Wall Street and Shutter Island?",
                "James Cameron", "Martin Scorsese", "Christopher Nolan", "Seth Rogan", "Martin Scorsese");
        Question question2 = new Question("Who directed Parasite – the first foreign-language film to win the Academy Award for Best Picture?",
                "Bong Joon-ho", "Park Chan-wook", "Lee Chang-dong", "None of the above", "Bong Joon-ho");
        Question question3 = new Question("Which British actor plays Alfred Pennyworth in Joker (2019)?",
                "Michael Caine", "Anthony Head", "Douglas Hodge", "None of the above", "Douglas Hodge");

        Level level1 = new Level("Level 1");
        level1.questionList.add(question1);
        level1.questionList.add(question2);
        level1.questionList.add(question3);


        GameSetup game = new GameSetup();
        game.questionList.add(question1);
        game.questionList.add(question2);
        game.questionList.add(question3);
        return game;
    }

    public int extractQuestion() {
        int questionNumber = random.nextInt(questionList.size());    //am stocat numarul intrebarii din lista
        return questionNumber;
    }



    public void printQuestion(int questionNumber) {
        questionNumber = extractQuestion();    //am stocat numarul intrebarii din lista

        System.out.println(questionList.get(questionNumber).question);
        System.out.println();
        System.out.println("A.  " + questionList.get(questionNumber).answer1);
        System.out.println("B.  " + questionList.get(questionNumber).answer2);
        System.out.println("C.  " + questionList.get(questionNumber).answer3);
        System.out.println("D.  " + questionList.get(questionNumber).answer4);
    }

    public boolean checkAnswer(String answer, int questionNumber) {


        if (answer.equalsIgnoreCase("A")) {
            if (questionList.get(questionNumber).answer1.equals(questionList.get(questionNumber).correctAnswer)) {
                //printQuestion();
                System.out.println("correct answer");
                return true;

            } else {
                System.out.println("You lost all your money");
            }
        } else if (answer.equalsIgnoreCase("B")) {
            if (questionList.get(questionNumber).answer1.equals(questionList.get(questionNumber).correctAnswer)) {
               // printQuestion();
                System.out.println("correct answer");
                return true;
            } else {
                System.out.println("You lost all your money");
            }
        } else if (answer.equalsIgnoreCase("C")) {
            if (questionList.get(questionNumber).answer1.equals(questionList.get(questionNumber).correctAnswer)) {
               // printQuestion();
                System.out.println("correct answer");
                return true;
            } else {
                System.out.println("You lost all your money");
            }
        } else if (answer.equalsIgnoreCase("D")) {
            if (questionList.get(questionNumber).answer1.equals(questionList.get(questionNumber).correctAnswer)) {
               // printQuestion();
                System.out.println("correct answer");
                return true;
            } else {
                System.out.println("You lost all your money");
            }

        } else {
            System.out.println("Enter a valid answer");

        }
        return false;
    }
}
