package racingcar;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현

        UserInput userInput = new UserInput();
        RacingOutput racingOutput = new RacingOutput();

        String carsName = userInput.carsNameInput();
        Cars cars = new Cars(carsName);

        String racingCount = userInput.racingRoundInput();
        Racing racing = new Racing(racingCount);

        List<Car> carList = racing.running(cars.getCars());

        racingOutput.racingResultOutput(racing.resultWinners(carList));

    }
}
