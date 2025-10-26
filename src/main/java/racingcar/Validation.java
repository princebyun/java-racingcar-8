package racingcar;

import java.util.HashSet;
import java.util.Set;

public class Validation {
    private static final int MAXIMUM_NAME_LENGTH = 5;

    public void duplicationCheck(String[] userInputArray) {
        Set<String> duplicateNames = new HashSet<>();
        for (String name : userInputArray) {
            if (!duplicateNames.add(name)) {
                throw new IllegalArgumentException();
            }
        }
    }


    public void nameBooleenCheck(String carName) {
        carName = carName.trim();
        if (carName.isEmpty() || carName.length() > MAXIMUM_NAME_LENGTH) {
            throw new IllegalArgumentException();
        }
    }


    public void runningNumberCheck(String userInputText) {
        try {
            int userInputNumber = Integer.parseInt(userInputText);
            negativeNumberCheck(userInputNumber);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException();
        }
    }


    public void negativeNumberCheck(int userInputNumber) {
        if (userInputNumber < 0) {
            throw new IllegalArgumentException();
        }
    }

}
