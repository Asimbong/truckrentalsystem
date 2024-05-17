package za.ac.cput.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

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
    private int rentId;
    private LocalDate rentDate;
    private LocalDate returnDate;
    private  double totalCost;
    private int customerID;

    @ManyToOne
    @JoinColumn(name = "branch_Id")
    private Branch branch;

    protected RentTruck() {
    }
    private   RentTruck(Builder builder){
        this.rentId=builder.rentId;
        this.rentDate=builder.rentDate;
        this.returnDate=builder.returnDate;
        this.totalCost=builder.totalCost;
        this.customerID=builder.customerID;
        this.branch = builder.branch;
    }

    public int getRentId() {
        return rentId;
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

    public Branch getBranch() {
        return branch;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RentTruck rentTruck = (RentTruck) o;
        return rentId == rentTruck.rentId && Double.compare(totalCost, rentTruck.totalCost) == 0 && customerID == rentTruck.customerID && Objects.equals(rentDate, rentTruck.rentDate) && Objects.equals(returnDate, rentTruck.returnDate) && Objects.equals(branch, rentTruck.branch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rentId, rentDate, returnDate, totalCost, customerID, branch);
    }

    @Override
    public String toString() {
        return "RentTruck{" +
                "rentId=" + rentId +
                ", rentDate=" + rentDate +
                ", returnDate=" + returnDate +
                ", totalCost=" + totalCost +
                ", customerID=" + customerID +
                ", branch=" + branch +
                '}';
    }

    public static class Builder{
        private int rentId;
        private LocalDate rentDate;
        private LocalDate returnDate;
        private  double totalCost;
        private int customerID;

        private Branch branch;

        public Builder setRentId(int rentId) {
            this.rentId = rentId;
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

        public Builder setBranch(Branch branch) {
            this.branch = branch;
            return this;
        }

        public Builder copy(RentTruck rentTruck){
            this.rentId=rentTruck.rentId;
            this.rentDate=rentTruck.rentDate;
            this.returnDate=rentTruck.returnDate;
            this.totalCost=rentTruck.totalCost;
            this.customerID=rentTruck.customerID;
            this.branch = rentTruck.branch;
            return this;
        }

        public RentTruck build(){return new RentTruck(this);}
    }
}
