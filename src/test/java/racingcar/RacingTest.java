package racingcar;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RacingTest {

    Racing racing = new Racing();

    @BeforeEach
    void setUp() {

    }

    @Test
    @DisplayName("랜덤수 출력 테스트 케이스")
    public void random_number_create_test() {
        int number = racing.getPositionRandomNumber();
        assertThat(number).isBetween(0, 9);
    }

    @AfterEach
    void tearDown() {

    }


}