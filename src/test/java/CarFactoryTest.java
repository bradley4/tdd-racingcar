import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class CarFactoryTest {
    CarFactory carFactory;

    @BeforeEach
    void setUp() {
        carFactory = new CarFactory();
    }

    @DisplayName("자동차를 만들 때 입력된 자동차의 이름이 중복일 경우 에러를 반환한다.")
    @ParameterizedTest
    @ValueSource(strings = "Peter,Parker,Peter,Rabbit")
    void duplicateCarNamesTest(String carNames) {
        assertThatExceptionOfType(RuntimeException.class).isThrownBy(() -> {
            carFactory.makeCars(carNames);
        });
    }

    @DisplayName("이름 목록을 입력받아 자동차를 만들 수 있다.")
    @ParameterizedTest
    @ValueSource(strings = "Wendy,Lizzy,Annie,Allie")
    void makeCarTest(String carNames) {
        List<Car> cars = carFactory.makeCars(carNames);

        assertThat(cars).isNotEmpty();
    }
}
