package tatar.companiese.kamil.model;

//Immutable class:
public class Student {
    private final long id;
    private final String firstName;
    private final String lastName;
    private final int course;
    private StudentStatus status;
    public Student(Long id, String firstName, String lastName, int course){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getCourse(){
        return course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", course=" + course +
                '}';
    }
}
