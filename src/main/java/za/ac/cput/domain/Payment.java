package za.ac.cput.domain;
/**
 * PaymentRepository.java
 * This is the repository program
 * @aurthor Malesela Modiba (222140275)
 * Date: 23 March 2024
 */
import java.time.LocalDate;
import java.util.Objects;
public class Payment {
    private static LocalDate date;
    private static double rentalAmount;
    private static int invoiceNum;
    private static String customerName;
    private static String salesRep;
    private static String truckRented;
    private static double totalAmount;

    public Payment() {
    }

    private Payment(Builder builder) {
        this.date = builder.date;
        this.rentalAmount = builder.rentalAmount;
        this.invoiceNum = builder.invoiceNum;
        this.customerName = builder.customerName;
        this.salesRep = builder.salesRep;
        this.truckRented = builder.truckRented;
        this.totalAmount = builder.totalAmount;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getRentalAmount() {
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
    public String gettruckRented() {
        return truckRented;
    }
    public double TotalAmount() {
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
                && Objects.equals(truckRented, Payment.truckRented)
                && Objects.equals(totalAmount, Payment.totalAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, rentalAmount,invoiceNum,customerName,salesRep,truckRented,totalAmount);
    }

    @Override
    public String toString() {
        return "Payment{" +
                "date='" + date + '\'' +
                ", rentalAmount='R" + rentalAmount + '\'' +
                ", invoiceNum='" + invoiceNum + '\'' +
                ", customerName='" + customerName + '\'' +
                ", salesRep='" + salesRep + '\'' +
                ", truckRented='" + truckRented + '\'' +
                ", totalAmount='R" + totalAmount +
                '}';
    }

    public static class Builder {
        private LocalDate date;
        private double rentalAmount;
        private int invoiceNum;
        private String customerName;
        private String salesRep;
        private String truckRented;
        private double totalAmount;

        public Builder setDate(LocalDate date) {
            this.date = date;
            return this;
        }

        public Builder setRentalAmount(double rentalAmount) {
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
        public Builder setTruckRented(String truckRented) {
            this.truckRented = truckRented;
            return this;
        }
        public Builder setTotalAmount(double totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }

        public Builder copy(Payment payment) {
            this.date = payment.date;
            this.rentalAmount = payment.rentalAmount;
            this.invoiceNum = payment.invoiceNum;
            this.customerName = payment.customerName;
            this.truckRented = payment.truckRented;
            this.totalAmount = payment.totalAmount;
            return this;
        }

        public Payment build() {
            return new Payment(this);
        }
    }
}
