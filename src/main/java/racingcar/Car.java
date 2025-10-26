package racingcar;

public class Car {
    private String name;
    private int position;

    Validation validation = new Validation();


    public Car(String name) {
        validation.nameBooleenCheck(name);
        this.name = name.trim();
        this.position = 0;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void positionMove() {
        this.position++;
    }
}
