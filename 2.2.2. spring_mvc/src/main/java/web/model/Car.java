package web.model;

public class Car {

    private int number;
    private int power;
    private String model;

    public Car() {
    }

    public Car(int number, int power, String model) {
        this.number = number;
        this.power = power;
        this.model = model;
    }

    public int getNumber() {
        return number;
    }

    public int getPower() {
        return power;
    }

    public String getModel() {
        return model;
    }
}
