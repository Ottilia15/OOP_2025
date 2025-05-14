package BAC;

public class Student implements Comparable<Student> {

    private final int id;
    private final String firstName;
    private final String lastName;
    private String course;

    public Student(String course, String lastName, String firstName, int id) {
        this.course = course;
        this.lastName = lastName;
        this.firstName = firstName;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", course='" + course + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student that) {
       return (this.firstName + this.lastName).compareTo(that.firstName + that.lastName);
    }
}
