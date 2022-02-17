package domain;

public class Car {
    private static final int a = 0;
    // 이동 거리
    private CarDistance carDistance;

    public Car() {
        this.carDistance = new CarDistance();
    }

    public int getCycleCount() {
        return this.carDistance.getCycleCount();
    }

    public int getDistance() {
        return this.carDistance.getDistance();
    }

    public void move(int random) {
        if (random > 3 && random < 10) {
            this.carDistance.AddDistance();
        }
        this.carDistance.AddCycle();
    }

    public CarDistance getCarDistance() {
        return carDistance;
    }
}
