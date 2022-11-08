package step2.domain;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PlayerTest {

    @DisplayName("플레이어 이름에 영어 이외의 문자가 들어오면 예외처리한다")
    @ParameterizedTest
    @ValueSource(strings = {"명", "명수", "명수A", "123", "AB3"})
    void player_name_can_english(String koreanName) {
        assertThatThrownBy(() -> new Player(koreanName))
            .isInstanceOf(IllegalArgumentException.class);
    }
}
