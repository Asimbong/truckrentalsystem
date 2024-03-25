package za.ac.cput.domain;

import java.time.LocalDate;
import java.util.Objects;
/**
 * PaymentRepository.java
 * This is the repository program
 * @aurthor Malesela Modiba (222140275)
 * Date: 23 March 2024
 */
public class ServiceRecord {
    private static int vehicleID;
    private static LocalDate serviceDate;
    private static String serviceType;
    private static String description;
    private static double cost;
    private static String mechanic;
    private static LocalDate nextServiceDate;

    public ServiceRecord() {
    }

    private ServiceRecord(ServiceRecord.Builder builder) {
        this.vehicleID = builder.vehicleID;
        this.serviceDate = builder.serviceDate;
        this.serviceType = builder.serviceType;
        this.description = builder.description;
        this.cost = builder.cost;
        this.mechanic = builder.mechanic;
        this.nextServiceDate = builder.nextServiceDate;
    }

    public int getVehicleID() {
        return vehicleID;
    }

    public String getServiceType() {
        return serviceType;
    }

    public LocalDate getServiceDate() {
        return serviceDate;
    }

    public String getDescription() {
        return description;
    }

    public double getCost() {
        return cost;
    }

    public String getMechanic() {
        return mechanic;
    }

    public LocalDate getNextServiceDate() {
        return nextServiceDate;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ServiceRecord serviceRecord = (ServiceRecord) o;
        return vehicleID == ServiceRecord.vehicleID
                && Objects.equals(serviceDate, ServiceRecord.serviceDate)
                && Objects.equals(serviceType, ServiceRecord.serviceType)
                && Objects.equals(description, ServiceRecord.description)
                && Objects.equals(cost, ServiceRecord.cost)
                && Objects.equals(mechanic, ServiceRecord.mechanic)
                && Objects.equals(nextServiceDate, ServiceRecord.nextServiceDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vehicleID, serviceDate, serviceType, description, cost, mechanic, nextServiceDate);
    }

    @Override
    public String toString() {
        return "ServiceRecord{" +
                "vehicleID=" + vehicleID +
                ", serviceDate='" + serviceDate + '\'' +
                ", serviceType='" + serviceType + '\'' +
                ", description='" + description + '\'' +
                ", cost=" + cost +
                ", mechanic='" + mechanic + '\'' +
                ", nextServiceDate='" + nextServiceDate + '\'' +
                '}';
    }

    public static class Builder {
        private int vehicleID;
        private LocalDate serviceDate;
        private String serviceType;
        private String description;
        private double cost;
        private String mechanic;
        private LocalDate nextServiceDate;


        public Builder setVehicleID(int vehicleID) {
            this.vehicleID = vehicleID;
            return this;
        }

        public Builder setServiceDate(LocalDate serviceDate) {
            this.serviceDate = serviceDate;
            return this;
        }

        public Builder setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setCost(double cost) {
            this.cost = cost;
            return this;
        }

        public Builder setMechanic(String mechanic) {
            this.mechanic = mechanic;
            return this;
        }

        public Builder setNextServiceDate(LocalDate nextServiceDate) {
            this.nextServiceDate = nextServiceDate;
            return this;
        }
        public Builder copy(ServiceRecord serviceRecord) {
            this.vehicleID = serviceRecord.vehicleID;
            this.serviceDate = serviceRecord.serviceDate;
            this.serviceType = serviceRecord.serviceType;
            this.description = serviceRecord.description;
            this.cost = serviceRecord.cost;
            this.mechanic = serviceRecord.mechanic;
            this.nextServiceDate = serviceRecord.nextServiceDate;
            return this;
        }

        public ServiceRecord build() {
            return new ServiceRecord(this);
        }

    }
}

