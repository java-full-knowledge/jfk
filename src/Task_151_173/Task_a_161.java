package Task_151_173;

public class Task_a_161 {
    public  static  void  main(String [] args) {
        int min=1000;
        boolean t=false;
        double s=min*26;
        while(t==false)
        {
            if (((Math.sqrt(s)) * 10) % 10 == 0) {
                System.out.println(min);
                t=true;
            }
            if(t==false && min<9999)
                min++;

        }
    }
}
