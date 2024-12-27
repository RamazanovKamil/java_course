package tatar.companiese.kamil.model;

public record StudentRecord(String firstName, String lastName, int course) {
    @Override
    public String toString() {
        return "StudentRecord{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", course=" + course +
                '}';
    }
}
