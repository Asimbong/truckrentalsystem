package za.ac.cput.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;
/**
 * Login.java
 * Login domain class
 * @author Siyanda Mthimkhulu (220148279)
 * Date: 19 May 2024
 */
@Entity
public class Login {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerId;
    private String email;
    private String password;

    protected Login(){

    }

    private Login(Login.Builder builder) {
        this.customerId = builder.customerId;
        this.email = builder.email;
        this.password = builder.password;
    }
    public int getCustomerId(){return customerId;}
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Login login = (Login) o;
        return Objects.equals(customerId, login.customerId) && Objects.equals(email, login.email) && Objects.equals(password, login.password) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, email, password);
    }

    @Override
    public String toString() {
        return "Login{" +
                "customerId" + customerId +
                "email=" + email +
                ", password='" + password + '\'' +
                '}';
    }
    public static class Builder {
        private int customerId;
        private String email;
        private String password;
    public Builder setCustomerId(int customerId){
        this.customerId = customerId;
        return this;
    }
        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;

        }
        public Builder copy(Login login) {
        this.customerId = login.customerId;
        this.email = login.email;
            this.password = login.password;
            return this;
        }
        public Login build() {return new Login(this);}
    }
    }
