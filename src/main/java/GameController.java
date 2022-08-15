import java.io.IOException;
import java.util.List;

public class GameController {
    InputView inputView;
    ResultView resultView;

    private List<Car> cars;
    private Dice dice;
    private Rule rule;

    private int carCount;
    private int roundCount;
    private int nowRound;

    public void startGame() throws IOException {
        init();
        playGame();
    }

    private void init() throws IOException {
        inputView = new InputView();
        resultView = new ResultView();

        carCount = inputView.getCarCount();
        String carNames = inputView.getCarNames();
        cars = new CarFactory().makeCars(carCount, carNames);

        roundCount = inputView.getRoundCount();
        nowRound = 1;

        rule = new Rule();
        dice = new Dice();
    }

    private void playGame() throws IOException {
        while(nowRound <= roundCount) {
            for (int x = 0; x < carCount; x++) {
                int randomNumber = dice.getRandomNumber();
                boolean move = rule.judgeMovement(randomNumber);
                if (move) {
                    cars.get(x).move();
                }
            }
            resultView.printRound(nowRound, cars);
            nowRound++;
        }

    }

    public void endGame() throws IOException {
        List<String> winner = rule.getWinner(cars);

        resultView.printWinner(winner);

        resultView.closeBuffer();
        inputView.closeBuffer();
    }
}

