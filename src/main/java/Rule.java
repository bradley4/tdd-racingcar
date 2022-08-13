import java.util.List;

public class Rule {
    private int MIN_NUM = 0;
    private int MID_NUM = 4;
    private int MAX_NUM = 9;

    public boolean judgeMovement(int randomNumber) {
        if (randomNumber >= MIN_NUM && randomNumber < MID_NUM) {
            return false;
        } else if (randomNumber >= MID_NUM && randomNumber <= MAX_NUM) {
            return true;
        }
        throw new RuntimeException("랜덤 숫자의 범위를 벗어났습니다.");
    }

    public String getWinner(List<Car> cars) {
        String winner = "";
        int winnerPosition = 0;
        for (Car car : cars) {
            if (winnerPosition < car.getPosition()) {
                winnerPosition = car.getPosition();
                winner = car.getName();
            };
        }

        return winner;
    }
}
