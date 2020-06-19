import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class GuessNumber {
    List<String> gameAnswer;

    public GuessNumber(String s){
        List<String> gameAnswer = Arrays.asList(s.split(" "));
        this.gameAnswer = gameAnswer;
    }

    public String answer(String s) {
        List<String> userAnswer = Arrays.asList(s.split(" "));
        HashSet<String> set = new HashSet<String>(userAnswer);
        if(gameAnswer.size()!=userAnswer.size()||set.size() != userAnswer.size()){
            return "0000";
        }
        int countA=0;
        int countB=0;
        int count=0;
        for (String i : gameAnswer) {
            if(userAnswer.get(count).equals(i)){
                countA++;
            }else if (gameAnswer.contains(userAnswer.get(count))){
                countB++;
            }
            count++;
        }
        return  countA+"A"+countB+"B";
    }
}
