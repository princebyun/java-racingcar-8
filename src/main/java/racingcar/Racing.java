package racingcar;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.Comparator;
import java.util.List;

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
        carsList.sort(Comparator.comparingInt(Car::getPosition).reversed());
        int maxPosition = carsList.getFirst().getPosition();
        String winners = "";
        for (Car car : carsList) {
            if (car.getPosition() == maxPosition) {
                if (winners.isEmpty()) {
                    winners = car.getName();
                    continue;
                }
                if (!winners.isEmpty()) {
                    winners += "," + car.getName();
                }
            }
        }
        return winners;
    }
}

