package racingcar;

import java.util.List;

public class RacingOutput {

    public void racingRunningOutput(List<Car> cars, int num) {
        if (num == 0) {
            System.out.println();
            System.out.println("실행 결과");
        }
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
