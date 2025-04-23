package lab04_01;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;
    public Person(String firstName,String lastName,int birthDate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthDate;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int birthYear(){
        return birthYear;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName +  "\nDate year: " + birthYear + "\nAge: " + (2025 - birthYear) + "\n";
    }
}
