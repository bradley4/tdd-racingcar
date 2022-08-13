import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class RuleTest {
    Rule rule;

    @BeforeEach
    void setUp() {
        rule = new Rule();
    }

    @DisplayName("랜덤 숫자가 4 이상, 9이하이면 true를 반환한다.")
    @ParameterizedTest
    @ValueSource(ints = {4, 5, 6, 7, 8, 9})
    void judgeMovementTrueTest(int randomNumber) {
        boolean result = rule.judgeMovement(randomNumber);

        assertThat(result).isTrue();
    }

    @DisplayName("랜덤 숫자가 0 이상, 3이하이면 false를 반환한다.")
    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 3})
    void judgeMovementFalseTest(int randomNumber) {
        boolean result = rule.judgeMovement(randomNumber);

        assertThat(result).isFalse();
    }

    @DisplayName("랜덤 숫자가 0 미만, 9 초과일 경우 에러를 던진다.")
    @ParameterizedTest
    @ValueSource(ints = {10, -3, 33})
    void judgeMovementErrorTest(int randomNumber) {
        assertThatExceptionOfType(RuntimeException.class).isThrownBy(() -> {
            rule.judgeMovement(randomNumber);
        });
    }
}
