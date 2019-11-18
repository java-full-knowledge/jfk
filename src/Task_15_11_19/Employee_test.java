package Task_15_11_19;

public class Employee_test {
    public static void main(String[] args) {
        Programer programer=new Programer("xx","xxxxxxxx",888,500000,"C++");
        Manager manager=new Manager(1456,"yyy","yyyyyyyy",400000,"aaaaaa");
        Object [] emp=new Object[]{programer,manager};
        Office office=new Office(emp);
        office.infoOffice();
    }
}
