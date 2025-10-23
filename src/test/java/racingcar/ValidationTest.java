package racingcar;

import static org.assertj.core.api.Assertions.assertThat;
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
        assertThatThrownBy(() -> validation.nameCheck("가머머머머머멈머머머,나,다,라"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("사용자 자동차 이름 빈값 입력 테스트")
    public void user_input_car_name_empty_test() {
        assertThatThrownBy(() -> validation.nameCheck(""))
                .isInstanceOf(IllegalArgumentException.class);

    }

    @Test
    @DisplayName("사용자 자동자 이름 통과 테스트")
    public void user_input_car_name_ok_test() {
        assertThat(validation.nameCheck("가,나,다,라")).isTrue();
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
        assertThat(validation.runningNumberCheck("5")).isTrue();
    }

    @AfterEach
    public void tearDown() {

    }
}