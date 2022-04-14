package baseball.model;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BallStatusTest {

    @Test
    void resultScoreReport_볼과_스트라이크_모두_있을_경우() {
        UserBalls userBalls = new UserBalls();
        userBalls.addBalls(Arrays.asList(2,4,3));

         Balls answerBalls = new Balls();
        answerBalls.addBalls(Arrays.asList(3,4,2));

        userBalls.compareBalls(answerBalls);

        assertThat(userBalls.ballStatus.resultScoreReport()).isEqualTo("2볼 1스트라이크");
    }

    @Test
    void resultScoreReport_스트라이크만_있을_경우() {
        UserBalls userBalls = new UserBalls();
        userBalls.addBalls(Arrays.asList(2,4,3));

        Balls answerBalls = new Balls();
        answerBalls.addBalls(Arrays.asList(2,5,3));

        userBalls.compareBalls(answerBalls);

        assertThat(userBalls.ballStatus.resultScoreReport()).isEqualTo("2스트라이크");
    }

    @Test
    void resultScoreReport_볼만_있을_경우() {
        UserBalls userBalls = new UserBalls();
        userBalls.addBalls(Arrays.asList(2,4,3));

        Balls answerBalls = new Balls();
        answerBalls.addBalls(Arrays.asList(3,5,2));

        userBalls.compareBalls(answerBalls);

        assertThat(userBalls.ballStatus.resultScoreReport()).isEqualTo("2볼");
    }

    @Test
    void resultScoreReport_낫싱일_경우() {
        UserBalls userBalls = new UserBalls();
        userBalls.addBalls(Arrays.asList(1,7,9));

        Balls answerBalls = new Balls();
        answerBalls.addBalls(Arrays.asList(3,4,2));

        userBalls.compareBalls(answerBalls);

        assertThat(userBalls.ballStatus.resultScoreReport()).isEqualTo("낫싱");
    }
}