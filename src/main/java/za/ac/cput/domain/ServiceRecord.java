package za.ac.cput.domain;

import java.util.Objects;

public class ServiceRecord {
    private static int VehicleID;
    private static String ServiceDate;
    private static String ServiceType;
    private static String Description;
    private static int Cost;
    private static String Mechanic;
    private static String NextServiceDate;

    public ServiceRecord(ServiceRecord serviceRecord) {
    }
    private ServiceRecord(ServiceRecord.Builder builder) {
        this.VehicleID = builder.VehicleID;
        this.ServiceDate = builder.ServiceDate;
        this.ServiceType = builder.ServiceType;
        this.Description = builder.Description;
        this.Cost = builder.Cost;
        this.Mechanic = builder.Mechanic;
        this.NextServiceDate = builder.NextServiceDate;
    }
    public int getVehicleID() {
        return VehicleID;
    }
    public String getServiceType() {
        return ServiceType;
    }
    public String getServiceDate() {
        return ServiceDate;
    }
    public String getDescription() {
        return Description;
    }
    public int getCost() {
        return Cost;
    }
    public String getMechanic() {
        return Mechanic;
    }
    public String getNextServiceDate() {
        return NextServiceDate;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ServiceRecord serviceRecord = (ServiceRecord) o;
        return VehicleID == ServiceRecord.VehicleID && Objects.equals(ServiceDate, ServiceRecord.ServiceDate) && Objects.equals(ServiceType, ServiceRecord.ServiceType) && Objects.equals(Description, ServiceRecord.Description) && Objects.equals(Cost, ServiceRecord.Cost) && Objects.equals(Mechanic, ServiceRecord.Mechanic) && Objects.equals(NextServiceDate, ServiceRecord.NextServiceDate);
    }
        @Override
        public int hashCode() {
            return super.hashCode();
        }

    @Override
    public String toString() {
        return "ServiceRecord{" +
                "VehicleID=" + VehicleID +
                ", ServiceDate='" + ServiceDate + '\'' +
                ", ServiceType='" + ServiceType + '\'' +
                ", Description='" + Description + '\'' +
                ", Cost=" + Cost +
                ", Mechanic='" + Mechanic + '\'' +
                ", NextServiceDate='" + NextServiceDate + '\'' +
                '}';
    }
    public static class Builder {
        private int VehicleID;
        private String ServiceDate;
        private String ServiceType;
        private String Description;
        private int Cost;
        private String Mechanic;
        private String NextServiceDate;
}

    public void setVehicleID(int vehicleID) {
        VehicleID = vehicleID;
    }

    public void setServiceDate(String serviceDate) {
        ServiceDate = serviceDate;
    }

    public void setServiceType(String serviceType) {
        ServiceType = serviceType;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setCost(int cost) {
        Cost = cost;
    }

    public void setMechanic(String mechanic) {
        Mechanic = mechanic;
    }

    public void setNextServiceDate(String nextServiceDate) {
        NextServiceDate = nextServiceDate;
    }
    public ServiceRecord copy(ServiceRecord serviceRecord) {
        this.VehicleID = ServiceRecord.VehicleID;
        this.ServiceDate = ServiceRecord.ServiceDate;
        this.ServiceType = ServiceRecord.ServiceType;
        this.Description = ServiceRecord.Description;
        this.Cost = ServiceRecord.Cost;
        this.Mechanic = ServiceRecord.Mechanic;
        this.NextServiceDate = ServiceRecord.NextServiceDate;
        return this;
    }
    public ServiceRecord build() {
        return new ServiceRecord(this);
    }

    }

