import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    @DisplayName("자동차를 이동한다")
    void moveCar() {
        Car car = new Car();
        char movement = car.moveCar();

        assertThat(movement).isEqualTo('-');
    }


}
