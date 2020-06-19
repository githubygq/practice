import java.util.ArrayList;
import java.util.List;

public class GuessNumber {

    public String answer(List<String> gameAnswer, List<String> userAnswer) {
        int countA=0;
        int countB=0;
        int count=0;
        for (String i : gameAnswer) {
            if(userAnswer.get(count)==i){
                countA++;
            }else if (gameAnswer.contains(userAnswer.get(count))){
                countB++;
            }
            count++;
        }
        return  countA+"A"+countB+"B";
    }
}
