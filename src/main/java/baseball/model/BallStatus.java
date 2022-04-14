package baseball.model;

import baseball.view.ResultView;

public class BallStatus {
    public enum Status {STRIKE, BALL, NOTHING}

    int strikeCount = 0;
    int ballCount = 0;

    public void addStatusCount(Status status){
        if(status == Status.STRIKE){
            addStrike();
            return;
        }

        if(status == Status.BALL){
            addBall();
        }
    }

    public void addStrike(){
        this.strikeCount++;
    }

    public void addBall(){
        this.ballCount++;
    }

    public int getStrikeCount() {
        return strikeCount;
    }

    public int getBallCount() {
        return ballCount;
    }

    public String resultScoreReport(){

        if(this.strikeCount == 0 && this.ballCount == 0){
            return ResultView.NOTHING;
        }

        if(this.strikeCount == 0){
            return this.ballCount + ResultView.BALL;
        }

        if(this.ballCount == 0){
            return this.strikeCount + ResultView.STRIKE;
        }

        return this.ballCount + ResultView.BALL + " " + this.strikeCount + ResultView.STRIKE;
    }
}
