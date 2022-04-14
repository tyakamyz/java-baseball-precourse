package baseball.model;

public class UserBalls extends Balls{
    public BallStatus ballStatus;

    UserBalls(){
        this.ballStatus = new BallStatus();
    }

    public void compareBalls(Balls anwerBalls){

        for(Ball userBall : this.balls){
            for(Ball anwerBall : anwerBalls.balls){
                this.ballStatus.addStatusCount(userBall.compareBall(anwerBall));
            }
        }
    }
}
