package za.ac.cput.domain;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

/**
 * Branch.java
 * This is the domain class
 * @author Thandolwethu Zamasiba Khoza (221797289)
 * Date: 16 May 2024
 */

@Entity
public class Branch {
    @Id
    private int branchId;
    private String address;
    private String city;
    private String province;
    private String country;

    @OneToMany(mappedBy = "branch", cascade = CascadeType.ALL,orphanRemoval =true)
    private List<RentTruck> rentTrucks;

    protected Branch() {
    }

    public Branch(Builder builder) {
        this.branchId = builder.branchId;
        this.address = builder.address;
        this.city = builder.city;
        this.province = builder.province;
        this.country = builder.country;
        this.rentTrucks = builder.rentTrucks;
    }

    public int getBranchId() {
        return branchId;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getProvince() {
        return province;
    }

    public String getCountry() {
        return country;
    }

    public List<RentTruck> getRentTrucks() {
        return rentTrucks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Branch branch = (Branch) o;
        return branchId == branch.branchId && Objects.equals(address, branch.address) && Objects.equals(city, branch.city) && Objects.equals(province, branch.province) && Objects.equals(country, branch.country) && Objects.equals(rentTrucks, branch.rentTrucks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(branchId, address, city, province, country, rentTrucks);
    }

    @Override
    public String toString() {
        return "Branch{" +
                "branchId=" + branchId +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", province='" + province + '\'' +
                ", country='" + country + '\'' +
                ", rentTrucks=" + rentTrucks +
                '}';
    }


    public static class Builder{
        private int branchId;
        private String address;
        private String city;
        private String province;
        private String country;

        private List<RentTruck> rentTrucks;

        public Builder() {
        }

        public Builder setBranchId(int branchId) {
            this.branchId = branchId;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setProvince(String province) {
            this.province = province;
            return this;
        }

        public Builder setCountry(String country) {
            this.country = country;
            return this;
        }

        public Builder setRentTrucks(List<RentTruck> rentTrucks) {
            this.rentTrucks = rentTrucks;
            return this;
        }

        public Builder copy(Branch branch){
            this.branchId = branch.branchId;
            this.address = branch.address;
            this.city = branch.city;
            this.province = branch.province;
            this.country = branch.country;
            this.rentTrucks = branch.rentTrucks;
            return this;
        }

        public Branch build() {
            return new Branch(this);
        }

    }
}
