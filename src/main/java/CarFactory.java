import java.util.*;

public class CarFactory {
    private String NAMEDELIMITER = ",";
    private List<Car> cars;

    public List<Car> makeCars(String carNames) {
        String[] carNamesList = carNames.split(NAMEDELIMITER);
        validateDupleNames(carNamesList);

        cars = new ArrayList<>();
        for (String carName : carNamesList) {
            // TODO: 이름이 없으면 자동차를 만들지 못하도록 Car 생성자에서 이름을 설정하도록 변경해보기
            Car car = new Car();
            car.setName(carName);
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
