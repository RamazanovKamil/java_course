package com.kamilrr.java.git;

//import static java.lang.StringTemplate.STR;

class RunClass {
    public static void main(String[] args) {
        StringTemplatesExample user1 = new StringTemplatesExample();
        user1.firstName = "Leonid";
        user1.lastName = "Popov";
        user1.age = 40;
//        String user1Info = user1.returnUserInfo(user1.firstName, user1.lastName, user1.age);
//        System.out.println(user1Info);
    }
}
public class StringTemplatesExample {
    String firstName, lastName;
    short age;
//    String returnUserInfo(String firstName, String lastName, short age){
//        return STR."""
//                User information:
//                    First name: \{firstName}
//                    Last name: \{lastName}
//                    Age: \{age}
//                """;
//    }
}
