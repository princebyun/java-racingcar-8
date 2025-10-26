package racingcar;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;
import java.util.stream.Collectors;

public class Racing {

    RacingOutput racingOutput = new RacingOutput();

    int racingCount = 0;

    public int getRacingCount() {
        return racingCount;
    }

    public void setRacingCount(int racingCount) {
        this.racingCount = racingCount;
    }

    public int getPositionRandomNumber() {
        return Randoms.pickNumberInRange(0, 9);
    }


    public List<Car> runningPositionMove(List<Car> carsList) {
        for (Car car : carsList) {
            if (getPositionRandomNumber() >= 4) {
                int position = car.getPosition();
                car.setPosition(position + 1);
            }
        }
        return carsList;
    }


    public List<Car> running(List<Car> carsList) {
        System.out.println();
        System.out.println("실행 결과");
        for (int i = 0; i < racingCount; i++) {
            carsList = runningPositionMove(carsList);
            racingOutput.racingRuningOutput(carsList);
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

