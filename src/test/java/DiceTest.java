import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DiceTest {
    Dice dice;

    @BeforeEach
    void setUp() {
        dice = new Dice();
    }

    @DisplayName("주사위를 굴리면 0 부터 9 사이의 랜덤 숫자를 반환한다.")
    @Test
    void getRandomNumberTest() {
        int randomNumber = dice.getRandomNumber();

        assertThat(randomNumber).isBetween(0, 9);
    }

}
