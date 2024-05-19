package za.ac.cput.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Payment.java
 * Payment domain class
 * @author Siyanda Mthimkhulu (220148279)
 * Date: 19 May 2024
 */
@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int invoice;
    private double paymentAmount;
    private LocalDate paymentDate;
    private int rentalID;
    private String paymentMethod;

    protected Payment(){

    }
    private Payment (Builder builder){
        this.invoice = builder.invoice;
        this.paymentAmount = builder.paymentAmount;
        this.paymentDate = builder.paymentDate;
        this.rentalID = builder.rentalID;
        this.paymentMethod = builder.paymentMethod;

    }

    public int getInvoice() {
        return invoice;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public int getRentalID() {
        return rentalID;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Payment payment)) return false;
        return getInvoice() == payment.getInvoice() && Double.compare(payment.getPaymentAmount(), getPaymentAmount()) == 0 && getRentalID() == payment.getRentalID() && getPaymentDate().equals(payment.getPaymentDate()) && getPaymentMethod().equals(payment.getPaymentMethod());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getInvoice(), getPaymentAmount(), getPaymentDate(), getRentalID(), getPaymentMethod());
    }

    @Override
    public String toString() {
        return "Payment{" +
                "invoice=" + invoice +
                ", paymentAmount=" + paymentAmount +
                ", paymentDate=" + paymentDate +
                ", rentalID=" + rentalID +
                ", paymentMethod='" + paymentMethod + '\'' +
                '}';
    }

    public static class Builder{
        private int invoice;
        private double paymentAmount;
        private LocalDate paymentDate;
        private int rentalID;
        private String paymentMethod;

        public Builder setInvoice(int invoice) {
            this.invoice = invoice;
            return this;
        }

        public Builder setPaymentAmount(double paymentAmount) {
            this.paymentAmount = paymentAmount;
            return this;
        }

        public Builder setPaymentDate(LocalDate paymentDate) {
            this.paymentDate = paymentDate;
            return this;
        }

        public Builder setRentalID(int rentalID) {
            this.rentalID = rentalID;
            return this;
        }

        public Builder setPaymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }
        public Payment.Builder copy(Payment payment) {
            this.invoice = payment.invoice;
            this.paymentAmount = payment.paymentAmount;
            this.paymentDate = payment.paymentDate;
            this.rentalID = payment.rentalID;
            this.paymentMethod = payment.paymentMethod;
            return this;
        }
        public Payment build() {
            return new Payment(this);
        }
    }

}
