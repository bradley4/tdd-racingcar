import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

public class ResultView {
    private BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
    private StringBuilder printer;

    private final String MARK = "-";

    public void printRound(int nowRound, List<Car> cars) throws IOException {
        printer = new StringBuilder();

        printer.append(nowRound);
        printer.append(" Round!\n");

        for (Car car : cars) {
            printer.append(car.getName());
            printer.append(" : ");
            repeat(car.getPosition());
            printer.append("\n");
        }
        printer.append("\n");
        writer.write(printer.toString());
        writer.flush();
    }

    public void printWinner(List<String> winners) throws IOException {
        String[] winnerArray = winners.toArray(new String[winners.size()]);
        String winner = String.join(", ", winnerArray);
        writer.write(winner);
        writer.write("가(이) 우승하였습니다!");
    }

    public void closeBuffer() throws IOException {
        writer.flush();
        writer.close();
    }

    private void repeat(int position) {
        for (int x = 0; x < position; x++) {
            printer.append(MARK);
        }
    }
}
