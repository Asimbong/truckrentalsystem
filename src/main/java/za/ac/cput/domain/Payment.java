package za.ac.cput.domain;
//Author: Malesela Modiba (222140275)
import java.util.Objects;
public class Payment {
    private static String date;
    private static int rentalAmount;
    private static int invoiceNum;
    private static String customerName;
    private static String salesRep;
    private static String carRented;
    private static int totalAmount;

    public Payment() {
    }

    private Payment(Builder builder) {
        this.date = builder.date;
        this.rentalAmount = builder.rentalAmount;
        this.invoiceNum = builder.invoiceNum;
        this.customerName = builder.customerName;
        this.salesRep = builder.salesRep;
        this.carRented = builder.carRented;
        this.totalAmount = builder.totalAmount;
    }

    public String getDate() {
        return date;
    }

    public int getRentalAmount() {
        return rentalAmount;
    }

    public int getInvoiceNum() {
        return invoiceNum;
    }

    public  String getCustomerName() {
        return customerName;
    }
    public String getSalesRep() {
        return salesRep;
    }
    public String getCarRented() {
        return carRented;
    }
    public int TotalAmount() {
        return totalAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return totalAmount == payment.totalAmount
                && Objects.equals(date, Payment.date)
                && Objects.equals(rentalAmount, Payment.rentalAmount)
                && Objects.equals(invoiceNum, Payment.invoiceNum)
                && Objects.equals(customerName, Payment.customerName)
                && Objects.equals(salesRep, Payment.salesRep)
                && Objects.equals(carRented, Payment.carRented)
                && Objects.equals(totalAmount, Payment.totalAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, rentalAmount,invoiceNum,customerName,salesRep,carRented,totalAmount);
    }

    @Override
    public String toString() {
        return "Payment{" +
                "date='" + date + '\'' +
                ", rentalAmount='" + rentalAmount + '\'' +
                ", invoiceNum='" + invoiceNum + '\'' +
                ", customerName='" + customerName + '\'' +
                ", salesRep='" + salesRep + '\'' +
                ", carRented='" + carRented + '\'' +
                ", totalAmount='" + totalAmount +
                '}';
    }

    public static class Builder {
        private String date;
        private int rentalAmount;
        private int invoiceNum;
        private String customerName;
        private String salesRep;
        private String carRented;
        private int totalAmount;

        public Builder setDate(String date) {
            this.date = date;
            return this;
        }

        public Builder setRentalAmount(int rentalAmount) {
            this.rentalAmount = rentalAmount;
            return this;
        }

        public Builder setInvoiceNum(int invoiceNum) {
            this.invoiceNum = invoiceNum;
            return this;
        }

        public Builder setCustomerName(String customerName) {
            this.customerName = customerName;
            return this;
        }
        public Builder setSalesRep(String salesRep) {
            this.salesRep = salesRep;
            return this;
        }
        public Builder setCarRented(String carRented) {
            this.carRented = carRented;
            return this;
        }
        public Builder setTotalAmount(int totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }

        public Builder copy(Payment payment) {
            this.date = payment.date;
            this.rentalAmount = payment.rentalAmount;
            this.invoiceNum = payment.invoiceNum;
            this.customerName = payment.customerName;
            this.carRented = payment.carRented;
            this.totalAmount = payment.totalAmount;
            return this;
        }

        public Payment build() {
            return new Payment(this);
        }
    }
}
