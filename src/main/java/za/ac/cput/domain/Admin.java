package za.ac.cput.domain;

import java.util.Objects;

/**
 * Admin.java
 * This is the Domain program
 * @aurthor Asimbonge Mbende (221090754)
 * Date: 20 March 2024
 */
public class Admin {
    private String adminID;
    private String adminName;
    private String adminSurname;
    private String email;

    public Admin() {
    }

    private Admin(Builder builder) {
    }

    public String getAdminID() {
        return adminID;
    }

    public String getAdminName() {
        return adminName;
    }

    public String getAdminSurname() {
        return adminSurname;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Admin admin = (Admin) o;
        return adminID == admin.adminID && Objects.equals(adminName, admin.adminName) && Objects.equals(adminSurname, admin.adminSurname) && Objects.equals(email, admin.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adminID, adminName, adminSurname, email);
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminID=" + adminID +
                ", adminName='" + adminName + '\'' +
                ", adminSurname='" + adminSurname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static class Builder {
        private String adminID;
        private String adminName;
        private String adminSurname;
        private String email;

        public Builder setAdminID(String adminID) {
            this.adminID = adminID;
            return this;
        }

        public Builder setAdminName(String adminName) {
            this.adminName = adminName;
            return this;
        }

        public Builder setAdminSurname(String adminSurname) {
            this.adminSurname = adminSurname;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder copy(Admin admin) {
            this.adminID = admin.adminID;
            this.adminName = admin.adminName;
            this.adminSurname = admin.adminSurname;
            this.email = admin.email;
            return this;
        }

        public Admin build() {
            return new Admin(this);
        }
    }
}
