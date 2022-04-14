package baseball.model;

import java.util.Objects;

public class Ball {
    private final int MIN_NUMBER_COUNT = 1;
    private final int MAX_NUMBER_COUNT = 9;

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

    public int getNumber() {
        return number;
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
