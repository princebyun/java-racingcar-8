package racingcar;

import java.util.List;

public class RacingOutput {

    public void racingRuningOutput(List<Car> cars) {
        for (Car car : cars) {
            String name = car.getName();
            int position = car.getPosition();
            System.out.println(name + " : " + positionAppend(position));
        }
        System.out.println();
    }


    public StringBuilder positionAppend(int position) {
        StringBuilder carPosition = new StringBuilder();
        for (int i = 0; i < position; i++) {
            carPosition.append("-");
        }
        return carPosition;
    }

    public void racingResultOutput(String result) {
        System.out.println("최종 우승자 : " + result);
    }


}
