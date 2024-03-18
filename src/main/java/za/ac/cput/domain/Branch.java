package za.ac.cput.domain;

import java.util.Objects;

public class Branch {

    private String branchName;
    private String location;
    private String managerName;
    private int contactNumber;

    public Branch() {
    }

    private Branch(Builder builder) {
        this.branchName = builder.branchName;
        this.location = builder.location;
        this.managerName = builder.managerName;
        this.contactNumber = builder.contactNumber;
    }

    public String getBranchName() {
        return branchName;
    }

    public String getLocation() {
        return location;
    }

    public String getManagerName() {
        return managerName;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Branch branch = (Branch) o;
        return contactNumber == branch.contactNumber && Objects.equals(branchName, branch.branchName) && Objects.equals(location, branch.location) && Objects.equals(managerName, branch.managerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(branchName, location, managerName, contactNumber);
    }

    @Override
    public String toString() {
        return "Branch{" +
                "branchName='" + branchName + '\'' +
                ", location='" + location + '\'' +
                ", managerName='" + managerName + '\'' +
                ", contactNumber=" + contactNumber +
                '}';
    }

    public static class Builder {
        private String branchName;
        private String location;
        private String managerName;
        private int contactNumber;

        public Builder setBranchName(String branchName) {
            this.branchName = branchName;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = location;
            return this;
        }

        public Builder setManagerName(String managerName) {
            this.managerName = managerName;
            return this;
        }

        public Builder setContactNumber(int contactNumber) {
            this.contactNumber = contactNumber;
            return this;
        }

        public Builder copy(Branch branch) {
            this.branchName = branch.branchName;
            this.location = branch.location;
            this.managerName = branch.managerName;
            this.contactNumber = branch.contactNumber;
            return this;
        }

        public Branch build() {
            return new Branch(this);
        }
    }
}

