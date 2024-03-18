package za.ac.cput;
import java.util.Objects;
public class Payment {
    private static String Date;
    private static int RentalAmount;
    private static int InvoiceNum;
    private static String CustomerName;
    private static String SalesRep;
    private static String CarRented;
    private static int TotalAmount;

    public Payment() {
    }

    private Payment(Builder builder) {
        this.Date = builder.Date;
        this.RentalAmount = builder.RentalAmount;
        this.InvoiceNum = builder.InvoiceNum;
        this.CustomerName = builder.CustomerName;
        this.SalesRep = builder.SalesRep;
        this.CarRented = builder.CarRented;
        this.TotalAmount = builder.TotalAmount;
    }

    public String getDate() {
        return Date;
    }

    public int getRentalAmount() {
        return RentalAmount;
    }

    public int getInvoiceNum() {
        return InvoiceNum;
    }

    public  String getCustomerName() {
        return CustomerName;
    }
    public String getSalesRep() {
        return SalesRep;
    }
    public String getCarRented() {
        return CarRented;
    }
    public int TotalAmount() {
        return TotalAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return TotalAmount == payment.TotalAmount && Objects.equals(Date, Payment.Date) && Objects.equals(RentalAmount, Payment.RentalAmount) && Objects.equals(InvoiceNum, Payment.InvoiceNum) && Objects.equals(CustomerName, Payment.CustomerName) && Objects.equals(SalesRep, Payment.SalesRep) && Objects.equals(CarRented, Payment.CarRented) && Objects.equals(TotalAmount, Payment.TotalAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Date, RentalAmount,InvoiceNum,CustomerName,SalesRep,CarRented,TotalAmount);
    }

    @Override
    public String toString() {
        return "Payment{" +
                "Date='" + Date + '\'' +
                ", RentalAmount='" + RentalAmount + '\'' +
                ", InvoiceNum='" + InvoiceNum + '\'' +
                ", CustomerName='" + CustomerName + '\'' +
                ", SalesRep='" + SalesRep + '\'' +
                ", CarRented='" + CarRented + '\'' +
                ", TotalAmount='" + TotalAmount +
                '}';
    }

    public static class Builder {
        private String Date;
        private int RentalAmount;
        private int InvoiceNum;
        private String CustomerName;
        private String SalesRep;
        private String CarRented;
        private int TotalAmount;

        public Builder setDate(String Date) {
            this.Date = Date;
            return this;
        }

        public Builder setRentalAmount(int RentalAmount) {
            this.RentalAmount = RentalAmount;
            return this;
        }

        public Builder setInvoiceNum(int InvoiceNum) {
            this.InvoiceNum = InvoiceNum;
            return this;
        }

        public Builder setCustomerName(String CustomerName) {
            this.CustomerName = CustomerName;
            return this;
        }
        public Builder setSalesRep(String SalesRep) {
            this.SalesRep = SalesRep;
            return this;
        }
        public Builder setCarRented(String CarRented) {
            this.CarRented = CarRented;
            return this;
        }
        public Builder setTotalAmount(int TotalAmount) {
            this.TotalAmount = TotalAmount;
            return this;
        }

        public Builder copy(Payment payment) {
            this.Date = payment.Date;
            this.RentalAmount = payment.RentalAmount;
            this.InvoiceNum = payment.InvoiceNum;
            this.CustomerName = payment.CustomerName;
            this.CarRented = payment.CarRented;
            this.TotalAmount = payment.TotalAmount;
            return this;
        }

        public Payment build() {
            return new Payment(this);
        }
    }
}
