package Task_01_11_19;

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

    String studentInstituteName;
    private Department[] departments;

    Institute(String studentInstituteName, Department[] departments) {
        this.studentInstituteName = studentInstituteName;
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
        Student s1 = new Student("ANNA", 1, "National Polytechnic University of Armenia");
        Student s2 = new Student("ANI", 2, "YSU");

        Student[] npua_students = new Student[]{s1};
        Student[] ysu_students = new Student[]{s2};

        Department NPUA = new Department("National Polytechnic University of Armenia", npua_students);
        Department YSU = new Department("YSU", ysu_students);

        Department[] departments = new Department[2];
        departments[0] = NPUA;
        departments[1] = YSU;

        Institute institute = new Institute("YSU", departments);

        System.out.print("Total students in institute: ");
        System.out.print(institute.getTotalStudentsInInstitute());
    }
}

