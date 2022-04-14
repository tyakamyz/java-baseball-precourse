package baseball.model;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UserBallsTest {

    @Test
    void compareBalls() {
       UserBalls userBalls = new UserBalls();
       userBalls.addBalls(Arrays.asList(2,4,3));

       AnswerBalls answerBalls = new AnswerBalls();
       answerBalls.addBalls(Arrays.asList(3,4,2));

       userBalls.compareBalls(answerBalls);

       assertThat(userBalls.ballStatus.getBall()).isEqualTo(2);
       assertThat(userBalls.ballStatus.getStrike()).isEqualTo(1);
    }
}