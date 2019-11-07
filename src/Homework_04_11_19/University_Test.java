package Homework_04_11_19;

class Person {
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
}

class Group {
    private String groupId;
    private Student[] students;
    private int index;

    public Group(String groupId, Student[] students) {
        this.groupId = groupId;
        index = 0;
        this.students = new Student[students.length];
        for (int i = 0; i < students.length; i++) {
            this.students[i] = students[i];
            index++;
        }

    }

    public int getIndex() {
        return index;
    }

    public void addStudent(Student student) {
        if (index + 1 > this.students.length - 1) {
            Student[] temp = new Student[this.students.length * 2];
            for (int i = 0; i < students.length; i++)
                temp[i] = this.students[i];

            this.students = new Student[temp.length];
            for (int i = 0; i < temp.length; i++)
                this.students[i] = temp[i];
        }
        this.students[index] = student;
        index++;

    }

    public void removeStudent(Student student) {
        if (index == 0)
            System.out.println("IsEmpty!!!");
        else {
            for (int i = 0; i < this.students.length; i++)
                if (this.students[i] == student) {
                    for (int j = i + 1; j < this.students.length; j++)
                        this.students[j - 1] = this.students[j];
                    this.students[this.students.length - 1] = null;
                    index--;
                    break;
                }

        }
    }

    @Override
    public String toString() {
        String temp = "";
        for (Student in : students)
            if (in != null)
                temp += (in.toString() + "\n" + "\n");
        return temp;
    }
}


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


class University {
    private String uni_name;
    private Student[] students;
    private int st_index;
    private Teacher[] teachers;
    private int te_index;
    private Group[] groups;
    private int gr_index;

    public University(String uni_name, Student[] students, Teacher[] teachers, Group[] groups) {
        this.uni_name = uni_name;
        this.students = students;
        this.teachers = teachers;
        this.groups = groups;
        st_index = students.length - 1;
        te_index = teachers.length - 1;
        gr_index = groups.length - 1;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void addTeaher(Teacher teacher) {
        if (te_index + 1 > this.teachers.length - 1) {
            Teacher[] temp = new Teacher[this.teachers.length * 2];
            for (int i = 0; i < teachers.length; i++)
                temp[i] = this.teachers[i];

            this.teachers = new Teacher[temp.length];
            for (int i = 0; i < temp.length; i++)
                this.teachers[i] = temp[i];
        }
        this.teachers[te_index] = teacher;
        te_index++;
    }

    public void addGroup(Group group) {
        if (gr_index + 1 > this.groups.length - 1) {
            Group[] temp = new Group[this.groups.length * 2];
            for (int i = 0; i < groups.length; i++)
                temp[i] = this.groups[i];

            this.groups = new Group[temp.length];
            for (int i = 0; i < temp.length; i++)
                this.groups[i] = temp[i];
        }
        this.groups[gr_index] = group;
        gr_index++;
    }

    @Override
    public String toString() {
        return "University " + this.uni_name + "\n" + "Student count:" + (st_index + 1) + "\n" + "Teacher count:" + (te_index + 1) + "\n" + "Group count:" + (gr_index + 1);

    }
}


public class University_Test {


    public static void main(String[] args) {
        Student a1 = new Student("Arman", "Torosyan", 3, "IKM");
        Student a2 = new Student("Narek", "Vardanyan", 4, "IKM");
        Student a3 = new Student("Karen", "Kirakosyan", 1, "SOC");

        Student[] students = new Student[]{a1, a2};

        Teacher t1 = new Teacher("hhhh", "rrrrr", "IKM");
        Teacher t2 = new Teacher("tttt", "WWWW", "IKM");

        Teacher[] teachers = new Teacher[]{t1, t2};

        Group group2 = new Group("Ao124356", students);
        Group group1 = new Group("Ar3456", students);

        Group[] groups = new Group[]{group1, group2};

        University university = new University("YSU", students, teachers, groups);

        System.out.println(group2.getIndex());
        group2.addStudent(a1);
        group2.addStudent(a2);
        group2.addStudent(a3);
        System.out.println(group2);
        System.out.println(group1.getIndex());
        group1.removeStudent(a1);
        System.out.println(group1.getIndex());
        System.out.println(university);
        university.addTeaher(t1);
        university.addTeaher(t2);
        university.addGroup(group2);
        System.out.println("\n" + university);
    }
}
