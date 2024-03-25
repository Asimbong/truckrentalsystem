package za.ac.cput.domain;

import java.util.Objects;

/**
 * Category.java
 * This is the Domain program
 * @author Thandolwethu Khoza (221797289)
 * Date: 20 March 2024
 */

public class Category {
    private int categoryID;
    private String description;
    private int numberOfAvailable;
    private String truckSize;
    private String truckType;
    private int brandID;

    public Category(int i, String compactCar, int i1, String medium, String sedan, int i2) {
    }

    private Category(Builder builder) {
        this.categoryID = builder.categoryID;
        this.description = builder.description;
        this.numberOfAvailable = builder.numberOfAvailable;
        this.truckSize = builder.truckSize;
        this.truckType = builder.truckType;
        this.brandID = builder.brandID;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public String getDescription() {
        return description;
    }

    public int getNumberOfAvailable() {
        return numberOfAvailable;
    }

    public String getTruckSize() {
        return truckSize;
    }

    public String getTruckType() {
        return truckType;
    }

    public int getBrandID() {
        return brandID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return categoryID == category.categoryID
                && Objects.equals(description, category.description)
                && Objects.equals(numberOfAvailable, category.numberOfAvailable)
                && Objects.equals(truckSize, category.truckSize)
                && Objects.equals(truckType, category.truckType)
                && Objects.equals(brandID, category.brandID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoryID, description, numberOfAvailable, truckSize,truckType, brandID);
    }


    @Override
    public String toString() {
        return "Category{" +
                "categoryID=" + categoryID +
                ", description='" + description + '\'' +
                ", numberOfAvailable=" + numberOfAvailable +
                ", truckSize='" + truckSize + '\'' +
                ", truckType='" + truckType + '\'' +
                ", brandID=" + brandID +
                '}';
    }



    public static class Builder{
        private int categoryID;
        private String description;
        private int numberOfAvailable;
        private String truckSize;
        private String truckType;
        private int brandID;

        public Builder setCategoryID(int categoryID) {
            this.categoryID = categoryID;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setNumberOfAvailable(int numberOfAvailable) {
            this.numberOfAvailable = numberOfAvailable;
            return this;
        }

        public Builder setTruckSize(String truckSize) {
            this.truckSize = truckSize;
            return this;
        }

        public Builder setTruckType(String truckType) {
            this.truckType = truckType;
            return this;
        }

        public Builder setBrandID(int brandID) {
            this.brandID = brandID;
            return this;
        }
    public Category build() {
        return new Category(this); }
}
}
