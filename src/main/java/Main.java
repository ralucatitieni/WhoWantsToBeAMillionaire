import ro.jademy.GameSetup;
import ro.jademy.Level;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Level level = new Level("Level 1");
        GameSetup game = GameSetup.setupGame();

        int questionNumber=game.extractQuestion();
        game.printQuestion(questionNumber);

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your answer");
        String answer=sc.next();
        game.checkAnswer(answer, questionNumber);

    }
}
