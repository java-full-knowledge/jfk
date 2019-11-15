package Task_11_11_19;

class Person{
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person[name="+name+",address="+address+"]";
    }
}
class Student extends  Person{
    private String program;
    private int year;
    private double fee;

    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student[Person[name" +getName()+",address="+getAddress()+']'+
                "program='" + program + '\'' +
                ", year=" + year +
                ", fee=" + fee +
                ']';
    }
}
class Staff extends Person{
    private String  shool;
    private double pay;

    public Staff(String name, String address, String shool, double pay) {
        super(name, address);
        this.shool = shool;
        this.pay = pay;

    }

    public String getShool() {
        return shool;
    }

    public void setShool(String shool) {
        this.shool = shool;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Staff[" +"Person[name="+getName()+",address="+getAddress()+
                "shool='" + shool + '\'' +
                ", pay=" + pay +
                '}';
    }
}
public class Main_Person {
    public static void main(String[] args) {

        Person person=new Person("Arman","22222");
        System.out.println(person);
        person=new Student("gggg","ggggg","gggg",199,12.5);
        System.out.println(person);
        person=new Staff("fffff","ffffff","fffff",13.5);
        System.out.println(person);
    }
}
