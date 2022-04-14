package baseball.model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class BallsTest {

    @Test
    void addBalls_예외테스트() {
        assertThatThrownBy(() -> new Balls().addBalls(new ArrayList<>(Arrays.asList(1,2,3,4)))).isInstanceOf(IllegalArgumentException.class);
    }
}