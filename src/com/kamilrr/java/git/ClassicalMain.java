package com.kamilrr.java.git;

public class ClassicalMain {
    public static void main(String[] args) {
        UserInfo user1 = new UserInfo("Kamil","Ramazanov",28);
        UserInfo user2 = new UserInfo("Michael", "Nickolas", 40);
        System.out.println(user1.toString());
        System.out.println(user2.toString());
    }
}
