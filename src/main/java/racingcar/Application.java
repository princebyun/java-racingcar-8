package racingcar;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현

        //입력 및 출력
        UserInput userInput = new UserInput();
        RacingOutput racingOutput = new RacingOutput();

        //자동차 컬렉션 생성
        String carsName = userInput.carsNameInput();
        Cars cars = new Cars(carsName);

        //자동차 경주 생성
        String racingCount = userInput.racingRoundInput();
        Racing racing = new Racing(racingCount);

        //경주 진행
        List<Car> carList = racing.running(cars.getCars());

        //경주 우승자
        racingOutput.racingResultOutput(racing.resultWinners(carList));

    }
}
