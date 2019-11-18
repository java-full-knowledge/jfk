package Task_15_11_19;

class Student extends Person {

    private Integer course;
    private String faculty;

    Student(String firstName, String lastName, Integer course, String faculty) {
        super(firstName, lastName);
        this.course = course;
        this.faculty = faculty;
    }

    public Integer getCourse() {
        return course;
    }

    public String getFaculty() {
        return faculty;
    }

    @Override
    public String toString() {
        return "Student " + super.toString() + "\n" + "Course:" + getCourse() + "\n" + "Faculty:" + getFaculty();
    }
}
