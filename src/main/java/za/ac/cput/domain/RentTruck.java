package za.ac.cput.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.util.Objects;
@Entity
public class RentTruck {
    @Id
    int rentId;
    String branchName;
    String branchLocation;
    LocalDate rentDate;
    LocalDate returnDate;
    Double totalCost;
    int customerID;

    public RentTruck() {

    }

    public RentTruck(Builder builder) {
        this.rentId = builder.rentId;
        this.branchName = builder.branchName;
        this.branchLocation = builder.branchLocation;
        this.rentDate = builder.rentDate;
        this.returnDate = builder.returnDate;
        this.totalCost = builder.totalCost;
        this.customerID = builder.customerID;
    }

    public void setRentId(int rentId) {
        this.rentId = rentId;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public void setBranchLocation(String branchLocation) {
        this.branchLocation = branchLocation;
    }

    public void setRentDate(LocalDate rentDate) {
        this.rentDate = rentDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RentTruck rentTruck = (RentTruck) o;
        return rentId == rentTruck.rentId && customerID == rentTruck.customerID && Objects.equals(branchName, rentTruck.branchName) && Objects.equals(branchLocation, rentTruck.branchLocation) && Objects.equals(rentDate, rentTruck.rentDate) && Objects.equals(returnDate, rentTruck.returnDate) && Objects.equals(totalCost, rentTruck.totalCost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rentId, branchName, branchLocation, rentDate, returnDate, totalCost, customerID);
    }

    @Override
    public String toString() {
        return "RentTruck{" +
                "rentId=" + rentId +
                ", branchName='" + branchName + '\'' +
                ", branchLocation='" + branchLocation + '\'' +
                ", rentDate=" + rentDate +
                ", returnDate=" + returnDate +
                ", totalCost=" + totalCost +
                ", customerID=" + customerID +
                '}';
    }

    public static class Builder {
        int rentId;
        String branchName;
        String branchLocation;
        LocalDate rentDate;
        LocalDate returnDate;
        Double totalCost;
        int customerID;

        public Builder setRentId(int rentId) {
            this.rentId = rentId;
            return this;
        }

        public Builder setBranchName(String branchName) {
            this.branchName = branchName;
            return this;
        }

        public Builder setBranchLocation(String branchLocation) {
            this.branchLocation = branchLocation;
            return this;
        }

        public Builder setRentDate(LocalDate rentDate) {
            this.rentDate = rentDate;
            return this;
        }

        public Builder setReturnDate(LocalDate returnDate) {
            this.returnDate = returnDate;
            return this;
        }

        public Builder setTotalCost(Double totalCost) {
            this.totalCost = totalCost;
            return this;
        }

        public Builder setCustomerID(int customerID) {
            this.customerID = customerID;
            return this;
        }

        public RentTruck build() {
            return new RentTruck(this);
        }
    }
    }

