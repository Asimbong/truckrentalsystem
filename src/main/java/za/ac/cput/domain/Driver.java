package za.ac.cput.domain;
/**
 * Driver.java
 * This is the Domain program
 * @aurthor Asimbonge Mbende (221090754)
 * Date: 16 March 2024
 */
import java.util.Objects;

public class Driver {

    private String firstName;
    private String lastName;
    private String email;
    private String idNumber;
    private String licenceNo;
    private String telephoneNo;
    private int rentalID;

    public Driver() {
    }

    private Driver(Builder builder) {

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
        Driver driver = (Driver) o;
        return rentalID == driver.rentalID && Objects.equals(firstName, driver.firstName) && Objects.equals(lastName, driver.lastName) && Objects.equals(email, driver.email) && Objects.equals(idNumber, driver.idNumber) && Objects.equals(licenceNo, driver.licenceNo) && Objects.equals(telephoneNo, driver.telephoneNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email, idNumber, licenceNo, telephoneNo, rentalID);
    }

    @Override
    public String toString() {
        return "Driver{" +
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

        public Builder copy(Driver driver) {
            this.firstName = driver.firstName;
            this.lastName = driver.lastName;
            this.email = driver.email;
            this.idNumber = driver.idNumber;
            this.licenceNo = driver.licenceNo;
            this.telephoneNo = driver.telephoneNo;
            this.rentalID = driver.rentalID;
            return this;
        }

        public Driver build() {
            return new Driver(this);
        }
    }
}
