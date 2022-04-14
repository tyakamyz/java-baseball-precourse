package baseball.model;

import java.util.ArrayList;
import java.util.List;

public class Balls {

    static final int BALLS_COUNT = 3;
    public List<Ball> balls;
    public BallStatus ballStatus;

    public Balls() {
        balls = new ArrayList<>();
    }

    public void addBalls(List<Integer> integerList){
        if(integerList.size() != BALLS_COUNT){
            throw new IllegalArgumentException("숫자 3개를 입력해주세요.");
        }

        for (int i = 0; i < integerList.size(); i++) {
            addBall(new Ball(i+1, integerList.get(i)));
        }
    }

    private void addBall(Ball ball) {
        balls.add(ball);
    }
}
