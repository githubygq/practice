import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class GuessNumberTest {

    @Test
    public void should_return_4A0B_when_comparewith_1234_given_1234(){
        //given
        GuessNumber guessNumber = new GuessNumber();
        List<String> gameAnswer = Arrays.asList("1","2","3","4");
        List<String> userAnswer = Arrays.asList("1","2","3","4");
        //when
        String result = guessNumber.answer(gameAnswer,userAnswer);
        //then
        assertEquals("4A0B",result);
    }

    @Test
    public void should_return_0A4B_when_comparewith_4321_given_1234(){
        //given
        GuessNumber guessNumber = new GuessNumber();
        List<String> gameAnswer = Arrays.asList("1","2","3","4");
        List<String> userAnswer = Arrays.asList("4","3","2","1");
        //when
        String result = guessNumber.answer(gameAnswer,userAnswer);
        //then
        assertEquals("0A4B",result);
    }
}
