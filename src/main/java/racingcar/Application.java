package racingcar;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현

        UserInput userInput = new UserInput();
        Validation validation = new Validation();
        Cars cars = new Cars();
        Racing racing = new Racing();
        RacingOutput racingOutput = new RacingOutput();

        String carsNmae = userInput.carsNameInput();

        validation.nameCheck(carsNmae);
        String[] userInputArray = cars.userInputArray(carsNmae);
        cars.userInputSaveCollection(userInputArray);

        String racingCount = userInput.racinRoundInput();

        validation.runningNumberCheck(racingCount);
        racing.setRacingCount(Integer.parseInt(racingCount));

        List<Car> carList = racing.running(cars.getCars());

        racingOutput.racingResultOutput(racing.resultWiners(carList));

    }
}
