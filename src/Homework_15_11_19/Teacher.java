package Homework_15_11_19;

class Teacher extends Person {

    private String faculty;

    public Teacher(String firstName, String lastName, String faculty) {
        super(firstName, lastName);
        this.faculty = faculty;
    }

    public String getFaculty() {
        return faculty;
    }

    @Override
    public String toString() {
        return "Teacher " + super.toString() + "\n" + "Facolty:" + getFaculty() + ";";
    }
}
