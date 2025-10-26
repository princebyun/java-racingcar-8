package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private List<Car> cars = new ArrayList<>();

    Validation validation = new Validation();

    public List<Car> getCars() {
        return cars;
    }

    public Cars(String userInputText) {
        String[] userInputArray = userInputText.split(",");
        validation.duplicationCheck(userInputArray);
        for (String car : userInputArray) {
            this.cars.add(new Car(car));
        }
    }


}
