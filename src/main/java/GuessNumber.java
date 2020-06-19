import java.util.ArrayList;
import java.util.List;

public class GuessNumber {

    public String answer(List<Integer> gameAnswer, List<Integer> userAnswer) {
        int countA=0;
        int countB=0;
        int count=0;
        for (int i : gameAnswer) {
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
