package racingcar;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarsTest {


    @BeforeEach
    void setUp() {
    }

    @Test
    @DisplayName("자동차 리스트 저장 테스트")
    public void car_list_save_test() {
        String userText = "가,나,다,라";

        Cars cars = new Cars();

        cars.userInputSaveCollection(cars.userInputArray(userText));

        assertThat(cars.getCars().size()).isEqualTo(4);
    }


    @AfterEach
    void tearDown() {
    }
}