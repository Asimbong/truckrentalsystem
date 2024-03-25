package za.ac.cput.domain;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

/**
 * ReturnCar.java
 * This is the Domain program
 * @author Thandolwethu Khoza (221797289)
 * Date: 18 March 2024
 */

public class ReturnCar {
    private String returnID;
    private int rentalID;
    private double overdueAmount;
    private LocalDate dateReturn;
    private LocalTime timeReturn;

    public ReturnCar(String number, int i, double v, LocalDate now, LocalTime nowed) {

    }

    private ReturnCar(Builder builder) {
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
        ReturnCar returnCar = (ReturnCar) o;
        return returnID == returnCar.returnID
                && Objects.equals(rentalID, returnCar.rentalID)
                && Objects.equals(overdueAmount, returnCar.overdueAmount)
                && Objects.equals(dateReturn, returnCar.dateReturn)
                && Objects.equals(timeReturn, returnCar.timeReturn);
    }


    @Override
    public int hashCode() {
        return Objects.hash(returnID, rentalID,overdueAmount,dateReturn, timeReturn);
    }


    @Override
    public String toString() {
        return "returnCar{" +
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
        public Builder copy(ReturnCar returnCar){
            this.returnID = returnCar.returnID;
            this.rentalID = returnCar.rentalID;
            this.overdueAmount = returnCar.overdueAmount;
            this.dateReturn = returnCar.dateReturn;
            this.timeReturn = returnCar.timeReturn;
            return this;
        }

        public ReturnCar build() {
            return new ReturnCar(this);
        }
    }
}
