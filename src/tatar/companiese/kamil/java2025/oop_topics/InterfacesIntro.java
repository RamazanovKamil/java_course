package tatar.companiese.kamil.java2025.oop_topics;

import tatar.companiese.kamil.model.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class InterfacesIntro {
    public static void main(String[] args) {
        Map<Long, Student> studentById = new HashMap<>();
        Map<Long, Student> studentByIdConcurrent = new ConcurrentHashMap<>();
        processStudents(studentById);
    }
    private static void processStudents(Map<Long, Student> students){
        //processing of students
    }
}
