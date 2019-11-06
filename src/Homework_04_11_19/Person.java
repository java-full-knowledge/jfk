package Homework_04_11_19;

public class Person {
    private String firstName;
    private String lastName;

    public Person(String  firstName,String lastName)
    {
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Name:"+getFirstName()+" "+getLastName();
    }
}
