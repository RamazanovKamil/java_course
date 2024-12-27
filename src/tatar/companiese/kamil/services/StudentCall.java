package tatar.companiese.kamil.services;

import tatar.companiese.kamil.model.StudentRecord;

public class StudentCall {
    public static void main(String[] args) {
        StudentRecord stud1 = new StudentRecord("Kolya","Nikanorov",3);
        StudentRecord stud2 = new StudentRecord("Lena","Molodcova",4);
        System.out.println(stud1.toString());
    }
}
