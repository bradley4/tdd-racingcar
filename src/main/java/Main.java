import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("자동차 대수는 몇 대인가요?");
        int carCount = sc.nextInt();

        System.out.println("시도할 횟수는 몇 회인가요?");
        int tryCount = sc.nextInt();

        String[] totalMoved = new String[carCount];
        Arrays.fill(totalMoved, "");

        for (int i = 0; i < tryCount; i++) {
            setCarMovement(carCount, totalMoved);
            System.out.println();
        }
    }

    private static void setCarMovement(int carCount, String[] totalMoved) {
        Car car = new Car();
        CarManipulation carManipulation = new CarManipulation();
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();

        for (int j = 0; j < carCount; j++) {
            int randomNumber = randomNumberGenerator.getPositiveSingleDigit();
            boolean shouldMove = carManipulation.shouldMoveForward(randomNumber);

            totalMoved[j] += car.moveCar(shouldMove);
            System.out.println(totalMoved[j]);
        }
    }

}
