import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @DisplayName("자동차를 이동한다")
    @ParameterizedTest
    @MethodSource("moveCarTestCases")
    void moveCar(boolean input, String expectedValue) {
        Car car = new Car();
        String movement = car.moveCar(input);

        assertThat(movement).isEqualTo(expectedValue);
    }

    private static Stream<Object[]> moveCarTestCases() {
        return Stream.of(
                new Object[]{true, "-"},
                new Object[]{false, ""}
        );
    }

}
