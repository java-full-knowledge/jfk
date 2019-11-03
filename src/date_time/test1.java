package date_time;

public class test1 {
    public static void main(String [] args){
       time time1= new time(5,16,26);
        System.out.println(time1);
                time1.sethour(15);
                System.out.println(time1);
                time1.settime(23,59,59);
                System.out.println(time1);
                time1=time1.nextSecond();
                System.out.println(time1);
    }
}
