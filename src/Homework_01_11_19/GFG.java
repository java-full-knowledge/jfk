package Homework_01_11_19;

class Student {
    String name;
    int id;
    String dept;

    Student(String name, int id, String dept) {

        this.name = name;
        this.id = id;
        this.dept = dept;

    }
}

class Department {

    String name;
    private Student[] students;

    Department(String name, Student[] students) {

        this.name = name;
        this.students = students;

    }

    public Student[] getStudents() {
        return students;
    }
}

class Institute {

    String instituteName;
    private Department[] departments;

    Institute(String instituteName, Department[] departments) {
        this.instituteName = instituteName;
        this.departments = departments;
    }

    public int getTotalStudentsInInstitute() {
        int noOfStudents = 0;
        Student[] students;
        for (Department dept : departments) {
            students = dept.getStudents();
            for (Student s : students) {
                noOfStudents++;
            }
        }
        return noOfStudents;
    }

}

public class GFG {
    public static void main(String[] args) {
        Student s1 = new Student("Mia", 1, "CSE");
        Student s2 = new Student("Priya", 2, "CSE");
        Student s3 = new Student("John", 1, "EE");
        Student s4 = new Student("Rahul", 2, "EE");

        Student[] cse_students = new Student[]{s1, s2};
        Student[] ee_students = new Student[]{s3, s4};

        Department CSE = new Department("CSE", cse_students);
        Department EE = new Department("EE", ee_students);

        Department[] departments = new Department[2];
        departments[0] = CSE;
        departments[1] = EE;

        Institute institute = new Institute("YSU", departments);

        System.out.print("Total students in institute: ");
        System.out.print(institute.getTotalStudentsInInstitute());
    }
}

