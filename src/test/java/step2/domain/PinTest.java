package step2.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PinTest {

    @DisplayName("핀이 쓰러진 갯수 만큼 남은 핀의 수가 감소한다.")
    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 7, 9})
    void pin_fall_remainingPin_minus(int countOfHit){
        Pin pin = new Pin();
        pin.fall(countOfHit);
        assertThat(pin.getRemainingPin()).isEqualTo(10 - countOfHit);
    }

    @DisplayName("핀이 남아 있는 갯수보다 쓰러트린 갯수가 많으면 예외처리한다.")
    @Test
    void count_of_hit_greater_than_remaining() {
        Pin pin = new Pin();
        assertThatThrownBy(() -> pin.fall(11))
            .isInstanceOf(IllegalStateException.class);
    }
}
