package za.ac.cput.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.util.Objects;

/**
 * RentTruck.java
 * This is the domain class
 * @author Thandolwethu Zamasiba Khoza (221797289)
 * Date: 03 May 2024
 */

@Entity
public class RentTruck {
    @Id
    int rentId;
    String branchName;
    String branchLocation;
    LocalDate rentDate;
    LocalDate returnDate;
    double totalCost;
    int customerID;

    protected RentTruck() {

    }

    private RentTruck(Builder builder) {
        this.rentId = builder.rentId;
        this.branchName = builder.branchName;
        this.branchLocation = builder.branchLocation;
        this.rentDate = builder.rentDate;
        this.returnDate = builder.returnDate;
        this.totalCost = builder.totalCost;
        this.customerID = builder.customerID;
    }

    public int getRentId() {
        return rentId;
    }

    public String getBranchName() {
        return branchName;
    }

    public String getBranchLocation() {
        return branchLocation;
    }

    public LocalDate getRentDate() {
        return rentDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public int getCustomerID() {
        return customerID;
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
        double totalCost;
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

        public Builder setTotalCost(double totalCost) {
            this.totalCost = totalCost;
            return this;
        }

        public Builder setCustomerID(int customerID) {
            this.customerID = customerID;
            return this;
        }

        public Builder copy(RentTruck rentTruck) {
            this.rentId = rentTruck.rentId;
            this.branchName = rentTruck.branchName;
            this.branchLocation = rentTruck.branchLocation;
            this.rentDate = rentTruck.rentDate;
            this.returnDate = rentTruck.returnDate;
            this.totalCost = rentTruck.totalCost;
            this.customerID = rentTruck.customerID;
            return this;
        }

        public RentTruck build() {
            return new RentTruck(this);
        }
    }
}


