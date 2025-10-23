package racingcar;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class CarTest {

    @BeforeEach
    void setUp() {
        System.out.println("자동차 클래스 테스트 준비");
    }

    @Test
    @DisplayName("자동차클래스 객체 생성 테스트")
    void car_create_test() {
        String name = "princebyun";

        Car car1 = new Car(name);

        assertThat(car1).isNotNull();
        assertThat(car1.getName()).isEqualTo(name);
    }

    @Test
    @DisplayName("자동차 클래스 객체 생성 실패 테스트")
    void car_create_test_false() {
        String name = "princebyun";

        Car car1 = new Car(name);

        assertThat(car1).isNotNull();
        assertThat(car1.getName()).isNotEqualTo("princebyunFalse");
    }

    @AfterEach
    void tearDown() {
        System.out.println("자동차 클래스 테스트 완료");
    }


}