import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
    @Test
    void duplicateCarNamesTest() {
        int carCount = 4;
        String carNames = "Peter,Parker,Peter,Rabbit";
        assertThatExceptionOfType(RuntimeException.class).isThrownBy(() -> {
            carFactory.makeCars(carCount, carNames);
        });
    }

    @DisplayName("이름 목록을 입력받아 자동차를 만들 수 있다.")
    @Test
    void makeCarTest() {
        int carCount = 4;
        String carNames = "Wendy,Lizzy,Annie,Allie";
        List<Car> cars = carFactory.makeCars(carCount, carNames);

        assertThat(cars).isNotEmpty();
    }
}
