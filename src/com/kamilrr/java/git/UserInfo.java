package com.kamilrr.java.git;

public class UserInfo {
    String firstName;
    String lastName;
    int age;
    public UserInfo(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + age;
    }
}
