package tatar.companiese.kamil.model;

import java.util.Objects;

public class UserInfo {
    private String firstName;
    private String lastName;
    private int age;
    public UserInfo(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }

    //For example to demonstrate how default access modifier works:
    void checkUserAccount(){
        Account userAccount = new Account();
        userAccount.checkAccount();
        String userAccountNumber = Account.ACCOUNT_PREFIX;
    }

    @Override
    public String toString() {
        return getFirstName() + " " + getLastName() + " " + getAge();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserInfo userInfo = (UserInfo) o;
        return age == userInfo.age && Objects.equals(firstName, userInfo.firstName) && Objects.equals(lastName, userInfo.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age);
    }
}