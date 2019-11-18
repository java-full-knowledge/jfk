package Homework_15_11_19;

abstract class Person {

    private String fisrtName;
    private String lastName;

    public Person(String fisrtName, String lastName) {
        this.fisrtName = fisrtName;
        this.lastName = lastName;
    }

    public String getFisrtName() {
        return fisrtName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return  "fisrtName='" + fisrtName + '\'' +
                ", lastName='" + lastName + '\'' ;
    }
}
