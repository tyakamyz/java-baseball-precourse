package baseball.model;

public class UserBalls extends Balls{
    public BallStatus ballStatus;

    public UserBalls(){
        this.ballStatus = new BallStatus();
    }

    public void compareBalls(Balls anwerBalls){

        for(Ball userBall : this.balls){
            compareBall(anwerBalls, userBall);
        }
    }

    private void compareBall(Balls anwerBalls, Ball userBall) {
        for(Ball anwerBall : anwerBalls.balls){
            this.ballStatus.addStatusCount(userBall.compareBall(anwerBall));
        }
    }
}
