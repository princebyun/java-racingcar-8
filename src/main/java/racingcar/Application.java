package racingcar;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현

        UserInput userInput = new UserInput();

        RacingOutput racingOutput = new RacingOutput();

        String carsNmae = userInput.carsNameInput();

        Cars cars = new Cars(carsNmae);

        String racingCount = userInput.racinRoundInput();

        Racing racing = new Racing(racingCount);

        List<Car> carList = racing.running(cars.getCars());

        racingOutput.racingResultOutput(racing.resultWiners(carList));

    }
}
