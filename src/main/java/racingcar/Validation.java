package racingcar;

public class Validation {


    public boolean nameCheck(String userInputText) {
        String[] userInputArray = userInputText.split(",");
        for (int i = 0; i < userInputArray.length; i++) {
            userInputArray[i] = userInputArray[i].trim();
            nameBooleenCheck(userInputArray[i]);
        }
        return true;
    }


    public void nameBooleenCheck(String userInputArray) {
        if (userInputArray.isEmpty() || userInputArray.length() > 5) {
            throw new IllegalArgumentException();
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
