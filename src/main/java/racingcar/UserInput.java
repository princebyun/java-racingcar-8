package racingcar;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class UserInput {

    public String carsNameInput() {

        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        readLine();

        return readLine();
    }


}
