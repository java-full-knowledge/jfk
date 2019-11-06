package Homework_04_11_19;

public class University {
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
