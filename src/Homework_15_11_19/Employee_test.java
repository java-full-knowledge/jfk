package Homework_15_11_19;

public class Employee_test {
    public static void main(String[] args) {
        Programer programer=new Programer("aaa","aaaa",1234,100000,"java");
        Manager manager=new Manager(1456,"ffff","rrrr",50000,"sss");
        Object [] emp=new Object[]{programer,manager};
        Office office=new Office(emp);
        office.infoOffice();
    }
}
