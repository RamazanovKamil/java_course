package tatar.companiese.kamil.services;

import tatar.companiese.kamil.model.StudentRecord;
import tatar.companiese.kamil.model.StudentStatus;

public class StudentCall {
    public static void main(String[] args) {
        StudentRecord stud1 = new StudentRecord("Kolya","Nikanorov",3);
        StudentRecord stud2 = new StudentRecord("Lena","Molodcova",4);
        //System.out.println(stud1.toString());

        StudentStatus studStatus1 = StudentStatus.ACTIVE;
        String name = studStatus1.name();
        System.out.println(name);
        System.out.println(studStatus1.getStatusId());
        studStatus1.setStatusId(5);
        System.out.println(studStatus1.getStatusId());
    }
}
