package baseball.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class BallTest {
    @Test
    void createBall_예외테스트() {
        assertThatThrownBy(() -> new Ball(1,0)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> new Ball(1,10)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void compareBallTest_STRIKE() {



        assertThat(new Ball(1,2).compareBall(new Ball(1,2))).isEqualTo(BallStatus.Status.STRIKE);
    }

    @Test
    void compareBallTest_BALL() {
        assertThat(new Ball(1,2).compareBall(new Ball(3,2))).isEqualTo(BallStatus.Status.BALL);
    }

    @Test
    void compareBallTest_NOTHING() {
        assertThat(new Ball(1,2).compareBall(new Ball(1,5))).isEqualTo(BallStatus.Status.NOTHING);
    }
}