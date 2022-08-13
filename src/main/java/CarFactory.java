import java.util.*;

public class CarFactory {
    private String NAME_DELIMITER = ",";
    private List<Car> cars;

    public List<Car> makeCars(int carCount, String carNames) {
        String[] carNamesList = carNames.split(NAME_DELIMITER);
        validateDupleNames(carNamesList);

        if (carCount != carNamesList.length) {
            throw new RuntimeException("자동차의 개수만큼 이름을 입력해주세요.");
        }

        cars = new ArrayList<>();
        for (String carName : carNamesList) {
            Car car = new Car(carName);
            cars.add(car);
        }

        return cars;
    }

    private void validateDupleNames(String[] carNamesList) {
        Set carNamesSet = new HashSet();

        Collections.addAll(carNamesSet, carNamesList);

        if (carNamesList.length != carNamesSet.size()){
            throw new RuntimeException("자동차의 이름은 중복될 수 없습니다.");
        }
    }
}
