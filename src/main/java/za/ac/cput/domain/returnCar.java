package za.ac.cput.domain;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * returnCar.java
 * This is the Domain program
 * @aurthor Thandolwethu Khoza (221797289)
 * Date: 18 March 2024
 */
public class returnCar {
    private String returnID;
    private int rentalID;
    private double overdueAmount;
    private LocalDate dateReturn;
    private LocalTime timeReturn;

    public returnCar() {

    }

    public returnCar(Builder builder) {
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
    public String toString() {
        return "returnCar{" +
                "returnID='" + returnID + '\'' +
                ", rentalID=" + rentalID +
                ", overdueAmount=" + overdueAmount +
                ", dateReturn=" + dateReturn +
                ", timeReturn=" + timeReturn +
                '}';
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

    public returnCar build() {
        return new returnCar(this);
        }
    }
}
