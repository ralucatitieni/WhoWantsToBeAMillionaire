package ro.jademy;

import java.util.ArrayList;

public class Level {
    public String difficultyLevel;
    public ArrayList<Question> questionList=new ArrayList<Question>();

    public Level(String difficultyLevel){
        this.difficultyLevel=difficultyLevel;
    }
}
