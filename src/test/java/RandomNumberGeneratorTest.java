import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RandomNumberGeneratorTest {

    @Test
    @DisplayName("0~9 사이 랜덤값을 리턴한")
    void getRandomPositiveSingleDigit() {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        int randomNumber = randomNumberGenerator.getPositiveSingleDigit();

        assertAll(
                () -> assertThat(randomNumber).isPositive(),
                () -> assertThat(randomNumber).isLessThanOrEqualTo(9)
        );
    }

}
