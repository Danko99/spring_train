package ch2.models;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
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
        return "ch2.models.Car{" +
                "model='" + model + '\'' +
                '}';
    }
}
