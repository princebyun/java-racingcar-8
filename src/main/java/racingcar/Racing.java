package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class Racing {

    int racingCount = 0;

    public int getRacingCount() {
        return racingCount;
    }

    public void setRacingCount(int racingCount) {
        this.racingCount = racingCount;
    }

    public int getPositionRandomNumber() {
        return Randoms.pickNumberInRange(0, 9);
    }
}

