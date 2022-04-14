package baseball.model;

public class BallCompare {

    public enum BallStatus {BALL, NOTHING, STRIKE}

    public static BallStatus compareBall(Ball answerBall, Ball userBall) {
        if(answerBall.equals(userBall)){
            return BallStatus.STRIKE;
        }

        if(answerBall.getNumber() == userBall.getNumber()){
            return BallStatus.BALL;
        }

        return BallStatus.NOTHING;
    }

}
