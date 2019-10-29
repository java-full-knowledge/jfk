package Homework_28_10_19;
import static java.lang.System.*;
public class Account_Test {
    public static void main(String [] args)
    {
        Account Person1=new Account("Ap09213456","Arman",2000);
        Account Person2=new Account("Be09213676","Karen",1000);
        Account Person3=new Account("Tp09267456","Narek");
        out.println("Person1 id="+Person1.getID());
        out.println("Person2 name="+Person2.getName());
        out.println("Person3 balance="+Person3.getBalance());
        out.println("Person1 credit="+Person1.credit(1500));
        out.println("Person2 debit="+Person2.debit(3000));
        out.println("transferiTo Person2 ? Person3"+Person3.transferTo(Person2,1300));
        out.println(Person1);
        out.println(Person2);
        out.println(Person3);

    }
}
