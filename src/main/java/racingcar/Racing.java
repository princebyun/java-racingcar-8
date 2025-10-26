package racingcar;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;
import java.util.stream.Collectors;

public class Racing {
    private static final int MOVE_STANDARD = 4;
    RacingOutput racingOutput = new RacingOutput();
    Validation validation = new Validation();
    private int racingCount = 0;

    public Racing(String count) {
        validation.runningNumberCheck(count);
        racingCount = Integer.parseInt(count);
    }

    public int getPositionRandomNumber() {
        return Randoms.pickNumberInRange(0, 9);
    }


    public List<Car> runningPositionMove(List<Car> carsList) {
        for (Car car : carsList) {
            if (getPositionRandomNumber() >= MOVE_STANDARD) {
                car.positionMove();
            }
        }
        return carsList;
    }


    public List<Car> running(List<Car> carsList) {
        for (int i = 0; i < racingCount; i++) {
            carsList = runningPositionMove(carsList);
            racingOutput.racingRuningOutput(carsList, i);
        }
        return carsList;
    }


    public String resultWiners(List<Car> carsList) {
        int maxPosition = carsList.stream()
                .mapToInt(Car::getPosition)
                .max()
                .getAsInt();

        List<Car> winnersList = carsList.stream()
                .filter(car -> car.getPosition() == maxPosition)
                .collect(Collectors.toList());

        String winners = winnersList.stream()
                .map(Car::getName)
                .collect(Collectors.joining(","));

        return winners;
    }
}

