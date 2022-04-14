package baseball.model;

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
            return "낫싱";
        }

        if(this.strikeCount == 0){
            return this.ballCount + "볼";
        }

        if(this.ballCount == 0){
            return this.strikeCount + "스트라이크";
        }

        return this.ballCount + "볼 " + this.strikeCount + "스트라이크";
    }
}
