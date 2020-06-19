import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class GuessNumberTest {

    @Test
    public void should_return_4A0B_when_comparewith_1234_given_1234(){
        //given
        GuessNumber guessNumber = new GuessNumber("1 2 3 4");
        //when
        String result = guessNumber.answer("1 2 3 4");
        //then
        assertEquals("4A0B",result);
    }

    @Test
    public void should_return_0A4B_when_comparewith_4321_given_1234(){
        //given
        GuessNumber guessNumber = new GuessNumber("1 2 3 4");
        //when
        String result = guessNumber.answer("1 2 3 4");
        //then
        assertEquals("0A4B",result);
    }

    @Test
    public void should_return_succeed_when_get_status_after_input1234_given_1234(){
        //given
        GuessNumber guessNumber = new GuessNumber("1 2 3 4");
        GuessNumberGame guessNumberGame = new GuessNumberGame(guessNumber);
        //when
        guessNumberGame.guess("1 2 3 4");
        GameStatus gameStatus = guessNumberGame.getStatus();
        //then
        assertEquals(GameStatus.SUCCEED,gameStatus);
    }




}
