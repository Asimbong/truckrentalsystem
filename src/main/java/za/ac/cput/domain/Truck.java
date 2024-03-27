package za.ac.cput.domain;
import java.util.Objects;
/*Author:Ayanda Phumzile Khoza
  Student number:218057172
  Domain Class
 Date:18 March 2024*/

public class Truck {
    private String truckId;
    private String model;
    private String year;
    private String availability;
    private String licensePlate;
    private double mileage;


    public Truck() {
    }

    private Truck(Builder builder) {

        this.truckId = builder.truckId;
        this.model = builder.model;
        this.year = builder.year;
        this.availability = builder.availability;
        this.licensePlate = builder.licensePlate;
        this.mileage = builder.mileage;

    }

    public String getTruckId() {
        return truckId;
    }

    public void setTruckId(String truckId) {
        this.truckId = truckId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Truck truck = (Truck) o;
        return truckId == truck.truckId && Objects.equals(truckId, truck.truckId)
                && Objects.equals(model, truck.model)
                && Objects.equals(year, truck.year)
                && Objects.equals(availability, truck.availability)
                && Objects.equals(licensePlate, truck.licensePlate)
                && Objects.equals(mileage, truck.mileage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(truckId, model, year, availability, licensePlate, mileage);
    }

    @Override
    public String toString() {
        return "Truck{" +
                "truckId='" + truckId + '\'' +
                ", model='" + model + '\'' +
                ", year='" + year + '\'' +
                ", availability='" + availability + '\'' +
                ", licensePlate='" + licensePlate + '\'' +
                ", mileage='" + mileage + '\'' +
                '}';
    }
    public static class Builder {

        private String truckId;
        private String model;
        private String year;
        private String availability;
        private String licensePlate;

        private double mileage;

        public Truck.Builder setTruckId(String truckId) {
            this.truckId = truckId;
            return this;
        }

        public Truck.Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public Truck.Builder setYear(String year) {
            this.year = year;
            return this;
        }

        public Truck.Builder setAvailability(String availability) {
            this.availability = availability;
            return this;
        }

        public Truck.Builder setLicensePlate(String licensePlate) {
            this.licensePlate = licensePlate;
            return this;
        }

        public Truck.Builder setMileage(double mileage) {
            this.mileage = mileage;
            return this;
        }

        public Truck.Builder copy(Truck truck) {
            this.truckId = truck.truckId;
            this.model = truck.model;
            this.year = truck.year;
            this.availability = truck.availability;
            this.licensePlate = truck.licensePlate;
            this.mileage = truck.mileage;
            return this;
        }

        public Truck build() {
            return new Truck(this);
        }
    }
}

