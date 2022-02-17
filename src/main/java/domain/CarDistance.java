package domain;

public class CarDistance {

    public CarDistance() {
        this.distance = 0;
        this.currentCycle = 0;
    }

    // 현재 회전한 횟수
    private int currentCycle;
    // 이동한 거리
    private int distance;

    public void AddDistance() {
        this.distance += 1;
    }
    public void AddCycle() {
        this.currentCycle += 1;
    }

    public int getCycleCount() {
        return currentCycle;
    }

    public int getDistance() {
        return distance;
    }
}
