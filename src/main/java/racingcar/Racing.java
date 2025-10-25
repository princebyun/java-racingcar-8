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


    public List<Car> running(List<Car> carsList) {
        for (int i = 0; i < racingCount; i++) {
            for (Car car : carsList) {
                if (getPositionRandomNumber() > 4) {
                    int position = car.getPosition();
                    car.setPosition(position + 1);
                }
            }
            racingOutput.racingRuningOutput(carsList);
        }
        return carsList;
    }


    public StringBuilder resultWiners(List<Car> carsList) {
        carsList.sort(Comparator.comparingInt(Car::getPosition));
        int maxPosition = carsList.getFirst().getPosition();
        StringBuilder winners = new StringBuilder();
        for (Car car : carsList) {
            if (car.getPosition() == maxPosition) {
                winners.append(",");
            }
        }
        return winners;
    }
}

