package baseball.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AnswerBallsTest {

    @Test
    void createAnswerBalls() {
        AnswerBalls answerBalls = new AnswerBalls();
        assertThat(answerBalls.balls.size()).isEqualTo(3);
    }
}