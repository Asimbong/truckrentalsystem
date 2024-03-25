package za.ac.cput.domain;
import java.util.Objects;
/*Author:Ayanda Phumzile Khoza
  Student number:218057172
  Domain Class
 Date:18 March 2024*/

public class Car {
    private String carId;
    private String carName;
    private String model;
    private String color;

    public Car() {
    }
    private Car(Builder builder) {
        this.carId = builder.carId;
        this.carName = builder.carName;
        this.model = builder.model;
        this.color = builder.color;

    }

    public String getCarId() {
        return carId;
    }
    public void setCarId(String carId) {
        this.carId = carId;
    }
    public String getCarName() {
        return carName;
    }
    public void setCarName(String carName) {
        this.carName = carName;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return carId == car.carId && Objects.equals(carId, car.carId) && Objects.equals(carName, car.carName) && Objects.equals(model, car.model) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carId, carName, model, color);
    }
    @Override
    public String toString() {
        return "Car{" +
                "carId=" + carId +
                ", carName='" + carName + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
    public static class Builder {
        private String carId;
        private String carName;
        private String model;
        private String color;

        public Builder setCarId(String carId) {
            this.carId = carId;
            return this;
        }
        public Builder setCarName(String carName) {
            this.carName = carName;
            return this;
        }
        public Builder setModel(String model) {
            this.model = model;
            return this;
        }
        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Car.Builder copy(Car car) {
            this.carId = car.carId;
            this.carName = car.carName;
            this.model = car.model;
            this.color = car.color;
            return this;
        }
        public Car build() {
            return new Car(this);
        }
    }
}
