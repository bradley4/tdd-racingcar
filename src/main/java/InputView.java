import java.io.*;

public class InputView {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    public int getCarCount() throws IOException {
        writer.write("자동차 대수는 몇 대인가요?\n");
        writer.flush();
        String carCount = reader.readLine();
        validateNumber(carCount);
        return Integer.parseInt(carCount);
    }

    public String getCarNames() throws IOException {
        writer.write("자동차의 이름을 입력해주세요. 구분자는 ',' 입니다.\n");
        writer.flush();
        return reader.readLine();
    }


    public int getRoundCount() throws IOException {
        writer.write("시도할 횟수는 몇 회인가요?\n");
        writer.flush();
        String roundCount = reader.readLine();
        validateNumber(roundCount);
        return Integer.parseInt(roundCount);
    }

    private void validateNumber(String number) {
        char[] numberArray = number.toCharArray();

        for (char num : numberArray) {
            if (!Character.isDigit(num)) {
                throw new RuntimeException("숫자만 입력 가능합니다.");
            }
        }
    }

    public void closeBuffer() throws IOException{
        reader.close();
        writer.close();
    }
}
