package ch2;

public class Car {
    private String model;

    public Car() {
    }

    public Car(String model) {
        this.model = model;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "ch2.Car{" +
                "model='" + model + '\'' +
                '}';
    }
}
