package baseball.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BallCompareTest {

    @Test
    void compareBallTest_STRIKE() {
        assertThat(BallCompare.compareBall(new Ball(1,2),new Ball(1,2))).isEqualTo(BallCompare.BallStatus.STRIKE);
    }

    @Test
    void compareBallTest_BALL() {
        assertThat(BallCompare.compareBall(new Ball(1,2),new Ball(3,2))).isEqualTo(BallCompare.BallStatus.BALL);
    }

    @Test
    void compareBallTest_NOTHING() {
        assertThat(BallCompare.compareBall(new Ball(1,2),new Ball(3,4))).isEqualTo(BallCompare.BallStatus.NOTHING);
    }
}