package za.ac.cput.domain;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.util.Objects;


@Entity
public class Truck {
    @Id
    private String vin;
    private String model;
    private String year;
    private String truckType;
    private String availability;
    private double truckLength;
    private double truckWeight;
    private double truckMaxHeight;
    private double currentMileage;

    protected Truck(Truck truck) {

    }

    private Truck(Builder builder) {
        this.vin = builder.vin;
        this.model = builder.model;
        this.year = builder.year;
        this.truckType = builder.truckType;
        this.availability = builder.availability;
        this.truckLength = builder.truckLength;
        this.truckWeight = builder.truckMaxHeight;
        this.currentMileage = builder.currentMileage;
    }

    public Truck() {

    }

    public String getVin() {
        return vin;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public String getTruckType() {
        return truckType;
    }

    public String isAvailability() {
        return availability;
    }

    public double getTruckLength() {
        return truckLength;
    }

    public double getTruckWeight() {
        return truckWeight;
    }

    public double getTruckMaxHeight() {
        return truckMaxHeight;
    }

    public double getCurrentMileage() {
        return currentMileage;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Truck truck = (Truck) o;
        return availability == truck.availability && Double.compare(truckLength, truck.truckLength) == 0
                && Double.compare(truckWeight, truck.truckWeight) == 0
                && Double.compare(truckMaxHeight, truck.truckMaxHeight) == 0
                && Double.compare(currentMileage, truck.currentMileage) == 0
                && Objects.equals(vin, truck.vin)
                && Objects.equals(model, truck.model)
                && Objects.equals(year, truck.year)
                && Objects.equals(truckType, truck.truckType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vin, model, year, truckType, availability, truckLength, truckWeight, truckMaxHeight, currentMileage);
    }

    @Override
    public String toString() {
        return "Truck{" +
                "vin='" + vin + '\'' +
                ", model='" + model + '\'' +
                ", year='" + year + '\'' +
                ", truckType='" + truckType + '\'' +
                ", availability=" + availability +
                ", truckLength=" + truckLength +
                ", truckWeight=" + truckWeight +
                ", truckMaxHeight=" + truckMaxHeight +
                ", currentMileage=" + currentMileage +
                '}';
    }

    public static class Builder {
        private String vin;
        private String model;
        private String year;
        private String truckType;
        private String availability;
        private double truckLength;
        private double truckWeight;
        private double truckMaxHeight;
        private double currentMileage;


        public Builder setVin(String vin) {
            this.vin = vin;
            return this;
        }

        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public Builder setYear(String year) {
            this.year = year;
            return this;
        }

        public Builder setTruckType(String truckType) {
            this.truckType = truckType;
            return this;
        }

        public Builder setAvailability(String availability) {
            this.availability = availability;
            return this;
        }

        public Builder setTruckLength(double truckLength) {
            this.truckLength = truckLength;
            return this;
        }

        public Builder setTruckWeight(double truckWeight) {
            this.truckWeight = truckWeight;
            return this;
        }

        public Builder setTruckMaxHeight(double truckMaxHeight) {
            this.truckMaxHeight = truckMaxHeight;
            return this;
        }

        public Builder setCurrentMileage(double currentMileage) {
            this.currentMileage = currentMileage;
            return this;
        }


        public Builder copy(Truck truck) {
            this.vin = truck.vin;
            this.model = truck.model;
            this.year = truck.year;
            this.truckType = truck.truckType;
            this.availability = truck.availability;
            this.truckLength = truck.truckLength;
            this.truckWeight = truck.truckWeight;
            this.truckMaxHeight = truck.truckMaxHeight;
            this.currentMileage = truck.currentMileage;
            return this;
        }
        public Truck build() {return new Truck(this);}
    }
       }







