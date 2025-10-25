package racingcar;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RacingTest {

    Racing racing = new Racing();

    @BeforeEach
    void setUp() {
        System.out.println("자동차 경주 테스트 시작");
    }

    @Test
    @DisplayName("랜덤수 출력 테스트 케이스")
    public void random_number_create_test() {
        int number = racing.getPositionRandomNumber();
        assertThat(number).isBetween(0, 9);
    }

    @Test
    @DisplayName("자동차 경주 게임 테스트")
    public void racing_test() {
        racing.setRacingCount(5);

        List<Car> list = new ArrayList<>();
        Car car1 = new Car("일번");
        Car car2 = new Car("이번");
        Car car3 = new Car("삼번");
        list.add(car1);
        list.add(car2);
        list.add(car3);

        racing.running(list);

        assertThat(list).isNotEmpty();
        assertThat(racing.getRacingCount()).isEqualTo(5);
        assertThat(list.getFirst().getPosition()).isNotEqualTo(0);
    }

    @Test
    @DisplayName("자동차 경주 위너 테스트")
    public void racing_winner_test() {
        racing.setRacingCount(5);

        List<Car> list = new ArrayList<>();
        Car car1 = new Car("일번");
        Car car2 = new Car("이번");
        Car car3 = new Car("삼번");
        list.add(car1);
        list.add(car2);
        list.add(car3);

        racing.running(list);

        String winner = racing.resultWiners(list);
        System.out.println(winner);
        assertThat(winner).isNotEmpty();
    }

    @AfterEach
    void tearDown() {
        System.out.println("자동차 경주 테스트 완료");
    }


}