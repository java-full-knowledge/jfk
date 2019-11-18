package Homework_15_11_19;

public class Mein_Test {


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
