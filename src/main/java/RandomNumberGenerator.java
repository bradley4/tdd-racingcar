import java.util.random.RandomGenerator;

public class RandomNumberGenerator {

    public int getPositiveSingleDigit() {
        RandomGenerator generator = RandomGenerator.getDefault();
        return generator.nextInt(10);
    }

}
