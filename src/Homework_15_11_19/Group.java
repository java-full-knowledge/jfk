package Homework_15_11_19;

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
