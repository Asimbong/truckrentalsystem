package za.ac.cput.domain;
/**
 * Customer.java
 * This is the Domain program
 * @aurthor Asimbonge Mbende (221090754)
 * Date: 16 March 2024
 */
import java.util.Objects;

public class Customer {

    private String firstName;
    private String lastName;
    private String email;
    private String idNumber;
    private String licenceNo;
    private String telephoneNo;
    private int rentalID;

    public Customer() {
    }

    private Customer(Builder builder) {

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getLicenceNo() {
        return licenceNo;
    }

    public String getTelephoneNo() {
        return telephoneNo;
    }

    public int getRentalID() {
        return rentalID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return rentalID == customer.rentalID && Objects.equals(firstName, customer.firstName) && Objects.equals(lastName, customer.lastName) && Objects.equals(email, customer.email) && Objects.equals(idNumber, customer.idNumber) && Objects.equals(licenceNo, customer.licenceNo) && Objects.equals(telephoneNo, customer.telephoneNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email, idNumber, licenceNo, telephoneNo, rentalID);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", licenceNo='" + licenceNo + '\'' +
                ", telephoneNo='" + telephoneNo + '\'' +
                ", rentalID=" + rentalID +
                '}';
    }

    public static class Builder {
        private String firstName;
        private String lastName;
        private String email;
        private String idNumber;
        private String licenceNo;
        private String telephoneNo;
        private int rentalID;

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setIdNumber(String idNumber) {
            this.idNumber = idNumber;
            return this;
        }

        public Builder setLicenceNo(String licenceNo) {
            this.licenceNo = licenceNo;
            return this;
        }

        public Builder setTelephoneNo(String telephoneNo) {
            this.telephoneNo = telephoneNo;
            return this;
        }

        public Builder setRentalID(int rentalID) {
            this.rentalID = rentalID;
            return this;
        }

        public Builder copy(Customer customer) {
            this.firstName = customer.firstName;
            this.lastName = customer.lastName;
            this.email = customer.email;
            this.idNumber = customer.idNumber;
            this.licenceNo = customer.licenceNo;
            this.telephoneNo = customer.telephoneNo;
            this.rentalID = customer.rentalID;
            return this;
        }

        public Customer build() {
            return new Customer(this);
        }
    }
}
