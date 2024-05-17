package za.ac.cput.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Objects;
/*  Completed By Malesela Modiba
    17 May 2024
 */

@Entity
public class SalesPerson extends Employee {
    private double wages;
    private int hours;
    private String customersAssisted;

    protected  SalesPerson(){

    }
    private SalesPerson(Builder builder){
        this.employeeNumber = builder.employeeNumber;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.wages = builder.wages;
        this.hours = builder.hours;
        this.customersAssisted = builder.customersAssisted;
    }

    public double getWages() {
        return wages;
    }

    public int getHours() {
        return hours;
    }

    public String getCustomersAssisted() {
        return customersAssisted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SalesPerson that = (SalesPerson) o;
        return Double.compare(wages, that.wages) == 0 && Objects.equals(hours, that.hours) && Objects.equals(customersAssisted, that.customersAssisted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), wages, hours, customersAssisted);
    }

    @Override
    public String toString() {
        return "SalesPerson{" +
                "wages=" + wages +
                ", Hours='" + hours + '\'' +
                ", CustomersAssisted='" + customersAssisted + '\'' +
                ", employeeNumber='" + employeeNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", employeeType='" + employeeType + '\'' +
                '}';
    }
    public static class Builder{
        private String employeeNumber;
        private String firstName;
        private String lastName;
        private String email;
        private double wages;
        private int hours;
        private String customersAssisted;

        public Builder setEmployeeNumber(String employeeNumber) {
            this.employeeNumber = employeeNumber;
            return this;

        }

        public  Builder setFirstName(String firstName) {
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

        public Builder setWages(double wages) {
            this.wages = wages;
            return this;
        }

        public Builder setHours(int hours) {
            this.hours = hours;
            return this;
        }

        public Builder setCustomersAssisted(String customersAssisted) {
            this.customersAssisted = customersAssisted;
            return this;
        }
        public Builder copy(SalesPerson salesperson){
            this.employeeNumber = salesperson.employeeNumber;
            this.firstName = salesperson.firstName;
            this.lastName = salesperson.lastName;
            this.email = salesperson.email;
            this.wages = salesperson.wages;
            this.hours = salesperson.hours;
            this.customersAssisted = salesperson.customersAssisted;
            return this;
        }
        public SalesPerson build(){
            return new SalesPerson(this);
        }
    }
}
