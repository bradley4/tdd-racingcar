import domain.Car;
import domain.Race;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class RaceTest {

    @DisplayName("레이스 횟수를 입력 받는다.")
    @ParameterizedTest
    @ValueSource(ints = {4, 5, 6, 7, 8, 9})
    void input_number_race_cycle(int cycle) {
        // given
        Race race = new Race(cycle);
        // then
        assertThat(race.getCycle()).isEqualTo(cycle);
    }

    @DisplayName("참가 해야 할 차 개수를 입력 받는다.")
    @ParameterizedTest
    @ValueSource(ints = {4, 5, 6, 7, 8, 9})
    void input_number_race_car(int carCount) {
        // given
        Race race = new Race(2);
        // when
        race.addCar(carCount);
        // then
        assertThat(race.getCar().size()).isEqualTo(carCount);
    }


    @Test
    @DisplayName("입력 받은 횟수와 자동차로 레이스가 가능해야한다")
    void run_race() {
        // given
        Race race = new Race(1);

        // when
        race.addCar(1);

        race.run();
        // then
        // 검증 어떻게;;;
    }

}
