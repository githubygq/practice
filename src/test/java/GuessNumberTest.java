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
}
