package baseball.model;

public class BallStatus {
    public enum Status {STRIKE, BALL, NOTHING}

    int strike = 0;
    int ball = 0;

    public void addStatusCount(Status status){
        if(status == Status.STRIKE){
            addStrike();
        }

        if(status == Status.BALL){
            addBall();
        }
    }

    public void addStrike(){
        this.strike++;
    }

    public void addBall(){
        this.ball++;
    }

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }
}
