package baseball.model;

import java.util.Objects;

public class Ball {
    private final int round;
    private final int number;

    public Ball(int round, int number) {
        this.round = round;
        this.number = number;
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
