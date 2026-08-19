package com.arthur.edu.DesignPatterns.Builder;

import java.time.LocalDate;

public class User {

    private String name;
    private String lastName;
    private String middleName;
    private LocalDate date;
    private String email;
    private String password;
    private Boolean isAdmin;
    private String verificationCode;

    private User(UserBuilder userBuilder) {
        this.name = userBuilder.name;
        this.lastName = userBuilder.lastName;
        this.email = userBuilder.email;
        this.password = userBuilder.password;
        this.middleName = userBuilder.middleName;
        this.date = userBuilder.date;
        this.isAdmin = userBuilder.isAdmin;
        this.verificationCode = userBuilder.verificationCode;
    }

    public String getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(Boolean admin) {
        isAdmin = admin;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", date=" + date +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", isAdmin=" + isAdmin +
                ", verificationCode='" + verificationCode + '\'' +
                '}';
    }

    public static UserBuilder builder(String name, String lastName, String email, String password) {
        return new UserBuilder(name, lastName, email, password);
    }

    public static class UserBuilder {
        private String name;
        private String lastName;
        private String middleName;
        private LocalDate date;
        private String email;
        private String password;
        private Boolean isAdmin;
        private String verificationCode;

        public UserBuilder(String name, String lastName, String email, String password) {
            this.name = name;
            this.lastName = lastName;
            this.email = email;
            this.password = password;
        }

        public UserBuilder middleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public UserBuilder date(LocalDate date) {
            this.date = date;
            return this;
        }

        public UserBuilder isAdmin(Boolean admin) {
            this.isAdmin = admin;
            return this;
        }

        public UserBuilder verificationCode(String verificationCode) {
            this.verificationCode = verificationCode;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
