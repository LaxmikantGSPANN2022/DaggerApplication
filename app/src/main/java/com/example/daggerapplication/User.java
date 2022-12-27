package com.example.daggerapplication;

import androidx.annotation.NonNull;

public class User {

    public String firstName = "Laxmikant";
    public String lastName = "Mahamuni";
    public User(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName= lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    @NonNull
    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
