package racingcar;

import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ValidationTest {

    Validation validation = new Validation();

    @BeforeEach
    public void setup() {

    }

    @Test
    @DisplayName("사용자 자동차 이름 글자수 초과 테스트")
    public void user_input_car_name_count_test() {
        String testName = "가머머머머머멈머머머";
        assertThatThrownBy(() -> validation.nameBooleenCheck(testName))
                .isInstanceOf(IllegalArgumentException.class);

    }

    @Test
    @DisplayName("사용자 자동차 이름 중복 테스트")
    public void user_input_car_name_duplication_test() {
        String testName = "가,가,다,라";
        String[] textNameArray = testName.split(",");
        assertThatThrownBy(() -> validation.duplicationCheck(textNameArray))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("사용자 자동차 이름 빈값 입력 테스트")
    public void user_input_car_name_empty_test() {
        assertThatThrownBy(() -> validation.nameBooleenCheck(""))
                .isInstanceOf(IllegalArgumentException.class);

    }

    @Test
    @DisplayName("사용자 자동자 이름 통과 테스트")
    public void user_input_car_name_ok_test() {
        String testName = "가,나,다,라";
        String[] textNameArray = testName.split(",");
        for (String textName : textNameArray) {
            assertThatCode(() -> validation.nameBooleenCheck(textName))
                    .doesNotThrowAnyException();
        }
    }

    @Test
    @DisplayName("경주 횟수 음수 테스트")
    public void user_input_racing_count_test() {
        assertThatThrownBy(() -> validation.runningNumberCheck("-1"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("경주 횟수 문자 테스트")
    public void user_input_racing_string_test() {
        assertThatThrownBy(() -> validation.runningNumberCheck("변형균"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("경주 횟수 빈값 테스트")
    public void user_input_racing_empty_test() {
        assertThatThrownBy(() -> validation.runningNumberCheck(""))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("경주 횟수 통과 테스트")
    public void user_input_racing_ok_test() {
        assertThatCode(() -> validation.runningNumberCheck("5")).doesNotThrowAnyException();
    }

    @AfterEach
    public void tearDown() {

    }
}