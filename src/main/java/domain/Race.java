package domain;

import java.util.ArrayList;
import java.util.List;

public class Race {

    private static final int MIN_RANDOM_NUMBER = 0;
    private static final int MAX_RANDOM_NUMBER = 9;
    private static final int ZERO = 0;

    public Race(int cycle) {
        this.cycle = cycle;
        this.car = new ArrayList<>();
    }

    private int cycle;
    private List<Car> car;

    public int getCycle() {
        return cycle;
    }

    public List<Car> getCar() {
        return car;
    }

    public void addCar(int cnt) {
        for (int i = ZERO; i < cnt; i++) {
            car.add(new Car());
        }
    }

    public int random() {
        return (int) (Math.random() * (MAX_RANDOM_NUMBER - MIN_RANDOM_NUMBER + 1)) + MIN_RANDOM_NUMBER;
    }

    public void run() {
        System.out.println("실행 결과");

        for (int i = ZERO; i < cycle; i++) {
            System.out.println();
            for (Car car : this.getCar()) {

                car.move(this.random());

                this.printDistance(car.getDistance());
            }
        }
    }

    public void printDistance(int distance) {
        StringBuffer str = new StringBuffer();

        for (int i = 0; i < distance; i++) {
            str.append("-");
        }
        System.out.println(str.toString());
    }

}
