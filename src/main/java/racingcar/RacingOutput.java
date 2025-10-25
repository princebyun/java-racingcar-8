package racingcar;

import java.util.List;

public class RacingOutput {

    public void racingRuningOutput(List<Car> cars) {
        for (Car car : cars) {
            String name = car.getName();
            int position = car.getPosition();
            StringBuilder carPosition = new StringBuilder();
            for (int i = 1; i <= position; i++) {
                carPosition.append("-");
            }
            System.out.println(name + " : " + carPosition);
        }
        System.out.println();
    }


    public void racingResultOutput(String result) {
        System.out.println("최종 우승자 : " + result);
    }


}
