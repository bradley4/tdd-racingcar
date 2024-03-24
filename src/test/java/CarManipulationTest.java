import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class CarManipulationTest {

    @ParameterizedTest
    @DisplayName("파라미터값이 4이상이면 true, 3이하면 false를 리턴한다")
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
