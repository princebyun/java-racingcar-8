package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private List<Car> cars;

    public List<Car> getCars() {
        return cars;
    }

    public String[] userInputArray(String userInputText) {
        return userInputText.split(",");
    }

    public void userInputSaveCollection(String[] userInputArray) {
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < userInputArray.length; i++) {
            cars.add(new Car(userInputArray[i]));
        }
        this.cars = cars;
    }


}
