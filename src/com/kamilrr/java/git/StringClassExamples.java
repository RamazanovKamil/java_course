package com.kamilrr.java.git;

public class StringClassExamples {
    static void getEqualsLogin(String login){
        String compareLogin = "admin";
        System.out.println("Does 2 login equals: " + compareLogin.equals(login));
    }
    static void joinString(String firstName, int age){
        String res = String.join(" @", "First name:", firstName, "has age:", String.valueOf(age));
        System.out.println(res);
    }
    static void immutableString(String firstName, String lastName){
        String upperCaseRes = String.join(" ", firstName, lastName).toUpperCase();
        String rawRes = String.join(" ", firstName, lastName);
        System.out.println("Changed Strings: " + upperCaseRes);
        System.out.println("Immutable Strings: " + rawRes);
    }
    static void replaceCharacters(){
        String text = "Te..xt w.ith ..unex..pec..te.d.. do.t.s";
        String correctedText = text.replaceAll("\\.","");
        System.out.println(text + " -> " + correctedText);

        System.out.println("Here is some (other text( wi(th sym((bols".replaceAll("\\(", ""));
        System.out.println("Here is some \\other text\\ wi\\th sym\\bols".replaceAll("\\\\", ""));
    }
}
