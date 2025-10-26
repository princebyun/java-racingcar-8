package racingcar;

import java.util.List;

public class Cars {
    private List<Car> cars;

    Validation validation = new Validation();

    public List<Car> getCars() {
        return cars;
    }

    public Cars(String userInputText) {
        String[] userInputArray = userInputText.split(",");
        validation.duplicationCheck(userInputArray);
        for (String car : userInputArray) {
            cars.add(new Car(car));
        }
    }


}
