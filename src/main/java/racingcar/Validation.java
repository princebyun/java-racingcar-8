package racingcar;

public class Validation {


    public boolean nameCheck(String userInputText) {
        String[] userInputArray = userInputText.split(",");
        for (int i = 0; i < userInputArray.length; i++) {
            userInputArray[i] = userInputArray[i].trim();
            if (userInputArray[i].isEmpty() || userInputArray[i].length() > 5) {
                throw new IllegalArgumentException();
            }

        }
        return true;
    }

    public boolean runningNumberCheck(String userInputText) {
        try {
            int userInputNumber = Integer.parseInt(userInputText);
            if (userInputNumber < 0) {
                throw new IllegalArgumentException();
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException();
        }
        return true;
    }
}
