package za.ac.cput.domain;

import java.util.Objects;
/**
 *Brand.java
 * @author Siyanda Mthimkhulu (220148279)
 * Date: 21 March 2024
 */
public class Brand {

    private int brandId;
    private String brandName;
    private String color;

    public Brand() {
    }

    private Brand(Builder builder) {
        this.brandId = builder.brandId;
        this.brandName = builder.brandName;
        this.color = builder.color;
    }

    public int getBrandId() {
        return brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Brand brand = (Brand) o;
        return brandId == brand.brandId && Objects.equals(brandName, brand.brandName)  && Objects.equals(color, brand.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandId, brandName, color);
    }

    @Override
    public String toString() {
        return "Brand{" +
                "brandId=" + brandId +
                ", brandName='" + brandName + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public static class Builder {
        private int brandId;
        private String brandName;
        private String color;

        public Builder setBrandId(int brandId) {
            this.brandId = brandId;
            return this;
        }

        public Builder setBrandName(String brandName) {
            this.brandName = brandName;
            return this;
        }

      

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Brand build() {
            return new Brand(this);
        }
    }
}
