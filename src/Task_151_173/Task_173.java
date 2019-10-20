package Task_151_173;

public class Task_173 {
    public  static  void  main(String [] args) {
       int N=5,A=10,B=70,H;
       H=(B-A)/N;
       System.out.println("H="+H);
       for(int i=0;i<=N;i++)
        System.out.print("A_"+i+"="+(A+i*H)+", ");
    }
}
