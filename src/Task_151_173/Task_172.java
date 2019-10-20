package Task_151_173;

public class Task_172 {
    public  static  void  main(String [] args) {
        int N=8,S=1,ptr;
        ptr=N%2==0?2:1;
        while (N>=ptr) {
            S *= N;
            N-=2;
        }
        System.out.println("S="+S);
    }
}
