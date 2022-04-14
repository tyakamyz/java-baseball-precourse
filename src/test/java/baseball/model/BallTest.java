package baseball.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class BallTest {
    @Test
    void createBall_예외테스트() {
        assertThatThrownBy(() -> new Ball(1,0)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> new Ball(1,10)).isInstanceOf(IllegalArgumentException.class);
    }
}