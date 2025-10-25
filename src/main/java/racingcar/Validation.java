package racingcar;

import java.util.HashSet;
import java.util.Set;

public class Validation {


    public boolean nameCheck(String userInputText) {
        String[] userInputArray = userInputText.split(",");
        nameBooleenCheck(userInputArray);
        duplicationCheck(userInputArray);
        return true;
    }


    public void duplicationCheck(String[] userInputArray) {
        Set<String> duplicateNames = new HashSet<>();
        for (String name : userInputArray) {
            if (!duplicateNames.add(name)) {
                throw new IllegalArgumentException();
            }
        }
    }


    public void nameBooleenCheck(String[] userInputArray) {
        for (int i = 0; i < userInputArray.length; i++) {
            userInputArray[i] = userInputArray[i].trim();
            if (userInputArray[i].isEmpty() || userInputArray[i].length() > 5) {
                throw new IllegalArgumentException();
            }
        }
    }


    public boolean runningNumberCheck(String userInputText) {
        try {
            int userInputNumber = Integer.parseInt(userInputText);
            negativeNumberCheck(userInputNumber);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException();
        }
        return true;
    }


    public void negativeNumberCheck(int userInputNumber) {
        if (userInputNumber < 0) {
            throw new IllegalArgumentException();
        }
    }

}
