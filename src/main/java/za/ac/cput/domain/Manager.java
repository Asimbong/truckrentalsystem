package za.ac.cput.domain;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.util.Objects;

@Entity
public class Manager {
    @Id
    private String firstName;
    private String lastName;
    private String email;

    protected Manager(Manager manager) {

    }

    private Manager(Manager.Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
    }
    public Manager() {

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Manager manager)) return false;
        return Objects.equals(firstName, manager.firstName) && Objects.equals(lastName, manager.lastName) && Objects.equals(email, manager.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email);

    }

    @Override
    public String toString() {
        return "Manager{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static class Builder {

        private String firstName;
        private String lastName;
        private String email;

        public Manager.Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Manager.Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Manager.Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Manager.Builder copy(Manager manager) {
            this.firstName = manager.firstName;
            this.lastName = manager.lastName;
            this.email = manager.email;
            return this;
        }

        public Manager build() {
            return new Manager(this);
        }
    }
}


