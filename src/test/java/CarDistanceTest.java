import domain.Car;
import domain.Race;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class CarDistanceTest {

    private Car car;

    @BeforeEach
    void setUp() {
        car = new Car();
    }

    @DisplayName("진행된 횟수와 거리의 초기값은 0이어야한다.")
    @Test
    void cycle_and_distance_default_check () {
        assertThat(car.getCycleCount()).isEqualTo(0);
        assertThat(car.getDistance()).isEqualTo(0);
    }

    @DisplayName("해당하는 자동차의 총 진행된 횟수와 거리를 갖고 있어야된다.")
    @Test
    void move_after_distance_and_cycle_check() {
        // when
        car.move(4);
        car.move(5);
        car.move(2);
        // then
        assertThat(car.getDistance()).isEqualTo(2);
        assertThat(car.getCycleCount()).isEqualTo(3);
    }

    @DisplayName("random 값이 4이상 9이하 일 경우 전진한다.")
    @ParameterizedTest
    @ValueSource(ints = {-1, 0, 1, 2, 3, 4, 5, 7, 8, 9})
    void move_car_distance(int random) {
        // given
        int givenCheckValue = 0;

        // when
        car.move(random);

        if (random > 3 && random < 10) {
            givenCheckValue = 1;
        }
        // then
        assertThat(car.getDistance()).isEqualTo(givenCheckValue);
    }
}
