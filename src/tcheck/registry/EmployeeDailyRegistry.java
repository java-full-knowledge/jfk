package tcheck.registry;

import tcheck.employee.Employee;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

public class EmployeeDailyRegistry {

    private EmployeeDailyCheck[] checkIns = new EmployeeDailyCheck[100];
    private int currentCheckInNumber = 0;
    private EmployeeDailyCheck[] checkOuts = new EmployeeDailyCheck[100];
    private int currentCheckOutNumber = 0;

    public void checkIn(Employee employee) throws IOException {
        FileOutputStream fileOutputStream=new FileOutputStream("C:\\Java\\jfk\\src\\tcheck\\file\\ChekInChekOutFile",true);
        checkIns[currentCheckInNumber++] = new EmployeeDailyCheck(Action.CHECK_IN, new Date(), employee);
        String s="\n"+"CHECK_In : "+employee.toString();
        fileOutputStream.write(s.getBytes());
    }

    public void checkOut(Employee employee) throws IOException {
        FileOutputStream fileOutputStream=new FileOutputStream("C:\\Java\\jfk\\src\\tcheck\\file\\ChekInChekOutFile",true);
        checkOuts[currentCheckOutNumber++] = new EmployeeDailyCheck(Action.CHECK_OUT, new Date(), employee);
        String s="\n"+"CHECK_Out : "+employee.toString();
        fileOutputStream.write(s.getBytes());
    }

    public EmployeeDailyCheck[] getCheckIns() {
        return checkIns;
    }

    public EmployeeDailyCheck[] getCheckOuts() {
        return checkOuts;
    }
}
