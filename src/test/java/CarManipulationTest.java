import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class CarManipulationTest {

    @DisplayName("자동차 전진/멈춤 판단 - 파라미터값이 4이상이면 true(전진), 3이하면 false(멈춤)를 리턴한다")
    @ParameterizedTest
    @MethodSource("carMoveForwardTestCases")
    void checkShouldCarMoveForward(int input, boolean expectedValue) {
        CarManipulation carManipulation = new CarManipulation();

        boolean shouldMoveForward = carManipulation.shouldMoveForward(input);

        assertThat(shouldMoveForward).isEqualTo(expectedValue);
    }

    private static Stream<Object[]> carMoveForwardTestCases() {
        return Stream.of(
                new Object[]{1, false},
                new Object[]{3, false},
                new Object[]{4, true},
                new Object[]{5, true}
        );
    }

}
