package za.ac.cput.domain;

import java.util.Objects;

/**
 * LoginDetails.java
 * This is the Domain program
 * @aurthor Zukhanye Anele Mene (219404275)
 * Date: 20 March 2024
 */
public class LoginDetails {
    private String username;
    private String password;

    public LoginDetails() {
    }

    private LoginDetails(Builder builder) {

        this.username = builder.username;
        this.password = builder.password;
    }


    public String getUsername() {

        return username;
    }

    public String getPassword() {

        return password;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LoginDetails login = (LoginDetails) o;
        return Objects.equals(username, login.username) && Objects.equals(password, login.password) ;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(username, password);
    }

    @Override
    public String toString() {
        return "LoginDetails{" +
                ", Username='" + username + '\'' +
                ", Password='" + password + '\'' +

                '}';
    }

    public static class Builder {
        private String username;
        private String password;


        public Builder setUsername(String username) {
            this.username = username;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }



        public Builder copy(LoginDetails login) {
            this.username = login.username;
            this.password = login.password;

            return this;
        }

        public LoginDetails build() {
            return new LoginDetails(this);
        }
    }
}


