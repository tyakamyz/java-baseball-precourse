package baseball.controller;

import baseball.model.AnswerBalls;
import baseball.model.UserBalls;
import baseball.util.StringUtil;
import baseball.view.InputView;
import baseball.view.ResultView;

public class PlayGameController {

    public void playing(){
        int endGameFlag = 1;

        while (endGameFlag == 1){
            solve();
            endGameFlag = InputView.InputGameStartOrEnd();
        }
    }

    private void solve() {
        AnswerBalls answerBalls = new AnswerBalls();

        boolean endGameFlag = false;

        while (!endGameFlag){
            UserBalls userBalls = new UserBalls();
            userBalls.addBalls(StringUtil.stringToIntegerList(InputView.inputNumber()));
            userBalls.compareBalls(answerBalls);
            System.out.println(userBalls.ballStatus.resultScoreReport());

            endGameFlag = userBalls.ballStatus.isEndGame();
        }

        ResultView.gameEndMessage();
    }

}
