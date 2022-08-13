import java.util.Random;

public class Dice {
    Random dice = new Random();

    public int getRandomNumber() {
        return dice.nextInt(10);
    }
}
