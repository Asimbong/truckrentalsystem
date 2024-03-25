package za.ac.cput.domain;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

/**
 * ReturnTruck.java
 * This is the Domain program
 * @author Thandolwethu Khoza (221797289)
 * Date: 18 March 2024
 */

public class ReturnTruck {
    private String returnID;
    private int rentalID;
    private double overdueAmount;
    private LocalDate dateReturn;
    private LocalTime timeReturn;

    public ReturnTruck(String number, int i, double v, LocalDate now, LocalTime nowed) {

    }

    private ReturnTruck(Builder builder) {
        this.returnID = builder.returnID;
        this.rentalID = builder.rentalID;
        this.overdueAmount = builder.overdueAmount;
        this.dateReturn = builder.dateReturn;
        this.timeReturn = builder.timeReturn;
    }

    public String getReturnID() {
        return returnID;
    }

    public int getRentalID() {
        return rentalID;
    }

    public double getOverdueAmount() {
        return overdueAmount;
    }

    public LocalDate getDateReturn() {
        return dateReturn;
    }

    public LocalTime getTimeReturn() {
        return timeReturn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReturnTruck returnTruck = (ReturnTruck) o;
        return returnID == returnTruck.returnID
                && Objects.equals(rentalID, returnTruck.rentalID)
                && Objects.equals(overdueAmount, returnTruck.overdueAmount)
                && Objects.equals(dateReturn, returnTruck.dateReturn)
                && Objects.equals(timeReturn, returnTruck.timeReturn);
    }


    @Override
    public int hashCode() {
        return Objects.hash(returnID, rentalID,overdueAmount,dateReturn, timeReturn);
    }


    @Override
    public String toString() {
        return "returnTruck{" +
                "returnID='" + returnID + '\'' +
                ", rentalID=" + rentalID +
                ", overdueAmount=" + overdueAmount +
                ", dateReturn=" + dateReturn +
                ", timeReturn=" + timeReturn +
                '}';
    }

    public double calculateTotalAmount() {
        return overdueAmount * 1.1;
    }

    public static class Builder{

        private String returnID;
        private int rentalID;
        private double overdueAmount;
        private LocalDate dateReturn;
        private LocalTime timeReturn;

        public Builder setReturnID(String returnID) {
            this.returnID = returnID;
            return this;
        }

        public Builder setRentalID(int rentalID) {
            this.rentalID = rentalID;
            return this;
        }

        public Builder setOverdueAmount(double overdueAmount) {
            this.overdueAmount = overdueAmount;
            return this;
        }

        public Builder setDateReturn(LocalDate dateReturn) {
            this.dateReturn = dateReturn;
            return this;
        }

        public Builder setTimeReturn(LocalTime timeReturn) {
            this.timeReturn = timeReturn;
            return this;
        }
        public Builder copy(ReturnTruck returnTruck){
            this.returnID = returnTruck.returnID;
            this.rentalID = returnTruck.rentalID;
            this.overdueAmount = returnTruck.overdueAmount;
            this.dateReturn = returnTruck.dateReturn;
            this.timeReturn = returnTruck.timeReturn;
            return this;
        }

        public ReturnTruck build() {
            return new ReturnTruck(this);
        }
    }
}
