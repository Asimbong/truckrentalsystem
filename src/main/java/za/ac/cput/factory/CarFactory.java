package za.ac.cput.factory;
import za.ac.cput.domain.Car;
import za.ac.cput.util.Helper;

/*Author:Ayanda Phumzile Khoza
  Student number:

 Date:18 March 2024*/

public class CarFactory {

    public static Car createCar (String carId, String carName, String model, String color) {
        if (Helper.isNullOrEmpty(carName) || Helper.isNullOrEmpty(model) || Helper.isNullOrEmpty(color)) {
            return null;
        }

        return new Car.Builder()
                .setCarId(carId)
                .setCarName(carName)
                .setModel(model)
                .setColor(color)
                .build();
    }
}

