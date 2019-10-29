package Homework_28_10_19;

import static java.lang.System.out;

public class Employee_Test {
    public static void main(String [] args)
    {
        Employee person=new Employee(125465,"Arman","Torosyan",100000);
        out.println(person);
        person.raiseSalary(50);
        out.println(person);
        out.println("AnnulSalary:"+person.getAnnulaSalary());

    }
}
