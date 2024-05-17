package za.ac.cput.domain;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.util.Objects;
/**
 * @aurthor Malesela Modiba (222140275)
 * Date: 04 May 2024
 */
@Entity
public class ServiceRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private  static int serviceID;
    private  static LocalDate serviceDate;
    private  static String serviceType;
    private   static String description;
    private  static double cost;
    private  static String mechanic;
    private  static LocalDate nextServiceDate;
    private  static String vin;

    protected ServiceRecord() {
    }

    private ServiceRecord(ServiceRecord.Builder builder) {
        this.serviceID = builder.serviceID;
        this.serviceDate = builder.serviceDate;
        this.serviceType = builder.serviceType;
        this.description = builder.description;
        this.cost = builder.cost;
        this.mechanic = builder.mechanic;
        this.nextServiceDate = builder.nextServiceDate;
        this.vin = builder.vin;
    }

    public int getserviceID() {
        return serviceID;
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
    public String getVin(){
        return vin;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ServiceRecord serviceRecord = (ServiceRecord) o;
        return serviceID == ServiceRecord.serviceID
                && Objects.equals(serviceDate, ServiceRecord.serviceDate)
                && Objects.equals(serviceType, ServiceRecord.serviceType)
                && Objects.equals(description, ServiceRecord.description)
                && Objects.equals(cost, ServiceRecord.cost)
                && Objects.equals(mechanic, ServiceRecord.mechanic)
                && Objects.equals(nextServiceDate, ServiceRecord.nextServiceDate)
                && Objects.equals(vin, ServiceRecord.vin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceID, serviceDate, serviceType, description, cost, mechanic, nextServiceDate,vin);
    }

    @Override
    public String toString() {
        return "ServiceRecord{" +
                "serviceID=" + serviceID +
                ", serviceDate='" + serviceDate + '\'' +
                ", serviceType='" + serviceType + '\'' +
                ", description='" + description + '\'' +
                ", cost=" + cost +
                ", mechanic='" + mechanic + '\'' +
                ", nextServiceDate='" + nextServiceDate + '\'' +
                ", vin='" + vin + '\'' +
                '}';
    }

    public static class Builder {
        private int serviceID;
        private LocalDate serviceDate;
        private String serviceType;
        private String description;
        private double cost;
        private String mechanic;
        private LocalDate nextServiceDate;
        private String vin;


        public Builder setServiceID(int serviceID) {
            this.serviceID = serviceID;
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
        public Builder setVin(String vin){
            this.vin = vin;
            return this;
        }
        public Builder copy(ServiceRecord serviceRecord) {
            this.serviceID = serviceRecord.serviceID;
            this.serviceDate = serviceRecord.serviceDate;
            this.serviceType = serviceRecord.serviceType;
            this.description = serviceRecord.description;
            this.cost = serviceRecord.cost;
            this.mechanic = serviceRecord.mechanic;
            this.nextServiceDate = serviceRecord.nextServiceDate;
            this.vin = serviceRecord.vin;
            return this;
        }

        public ServiceRecord build() {
            return new ServiceRecord(this);
        }

    }
}
