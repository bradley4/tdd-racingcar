import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class CarTest {
    Car car;

    @BeforeEach
    void setUp() {
        car = new Car();
    }

    @DisplayName("자동차에 이름을 설정할 수 있어야 한다.")
    @ParameterizedTest
    @ValueSource(strings = "Peter")
    void setNameTest(String name) {
        car.setName(name);

        assertThat(car.getName()).isEqualTo(name);
    }

    @DisplayName("자동차의 이름으로 공백이나 null은 설정할 수 없다.")
    @ParameterizedTest
    @NullAndEmptySource
    void setNullAndEmptyNameTest(String name) {
        assertThatExceptionOfType(RuntimeException.class).isThrownBy(() -> {
            car.setName(name);
        });
    }

    @DisplayName("자동차는 위치를 가지고 있어야 한다.")
    @Test
    void getPositionTest() {
        int result = car.getPosition();

        assertThat(result).isEqualTo(0);
    }

    @DisplayName("자동차는 움직일 수 있어야 한다.")
    @Test
    void moveTest() {
        car.move();

        assertThat(car.getPosition()).isEqualTo(1);
    }
}
