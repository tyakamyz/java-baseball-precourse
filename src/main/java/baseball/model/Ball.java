package baseball.model;

import java.util.Objects;

public class Ball {
    public static final int MIN_NUMBER_COUNT = 1;
    public static final int MAX_NUMBER_COUNT = 9;

    private final int round;
    private final int number;

    public Ball(int round, int number) {
        isNumberValidCheck(number);

        this.round = round;
        this.number = number;
    }

    private void isNumberValidCheck(int number) {
        if(MIN_NUMBER_COUNT > number || MAX_NUMBER_COUNT < number){
            throw new IllegalArgumentException("1~9 사이의 숫자만 가능 합니다.");
        }
    }

    public BallStatus.Status compareBall(Ball ball) {
        if(this.equals(ball)){
            return BallStatus.Status.STRIKE;
        }

        if(this.number == ball.number){
            return BallStatus.Status.BALL;
        }

        return BallStatus.Status.NOTHING;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return round == ball.round && number == ball.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(round, number);
    }
}
