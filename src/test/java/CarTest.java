import domain.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CarTest {

    private Car car;
    @BeforeEach
    void setUp() {
        car = new Car();
    }

    @DisplayName("자동차는 이동 거리를 갖고 있어야한다.")
    @Test
    void car_distance_null_check() {
        assertThat(car.getCarDistance()).isNotNull();
    }
}
