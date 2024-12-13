package com.kamilrr.java.git;

import javax.swing.JOptionPane;

public class JavaSwingExample {
    public static void main(String[] args) {
        int yearNow, yearBorn, userAge;
        String userData;
        userData = JOptionPane.showInputDialog("What is year today?");
        yearNow = Integer.parseInt(userData);
        userData = JOptionPane.showInputDialog("What year was you born?");
        yearBorn = Integer.parseInt(userData);
        userAge = yearNow - yearBorn;
        JOptionPane.showMessageDialog(null,"Your age equals: " + userAge);
    }
}

