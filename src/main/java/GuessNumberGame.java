public class GuessNumberGame {
    private static final int MAX_TRY_TIMES = 6;
    GuessNumber guessNumber;
    GameStatus gameStatus;
    private int leftTryTimes = MAX_TRY_TIMES;
    public GuessNumberGame(GuessNumber guessNumber) {
        this.guessNumber=guessNumber;
    }

    public String guess(String s) {
        String result = guessNumber.answer(s);
        leftTryTimes--;
        if ("4A0B".equals(result)){
            gameStatus=GameStatus.SUCCEED;
        }else if (leftTryTimes==0){
            gameStatus=GameStatus.FAILED;
        }else {
            gameStatus=GameStatus.CONTINUED;
        }
        return result;
    }

    public GameStatus getStatus() {
        return gameStatus;
    }
}
