package baseball.model;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class UserBallsTest {

    @Test
    void compareBalls() {
       UserBalls userBalls = new UserBalls();
       userBalls.addBalls(Arrays.asList(2,4,3));

       Balls answerBalls = new Balls();
       answerBalls.addBalls(Arrays.asList(3,4,2));

       userBalls.compareBalls(answerBalls);

       assertThat(userBalls.ballStatus.getBallCount()).isEqualTo(2);
       assertThat(userBalls.ballStatus.getStrikeCount()).isEqualTo(1);
    }
}