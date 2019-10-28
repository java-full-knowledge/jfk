package Task_646_682;

public class Task_661 {
    public  static  void  main(String [] args) {

        String N_1 = "abdahfgfhgj", N_2 = "";
       int i=0;
       while ( i<=N_1.length()-1 && N_1.charAt(i)!='v'){
           N_2+=N_1.charAt(i);
           i++;
       }
       if(i<N_1.length()-1)
       N_2+='v';

        System.out.println("N_2=" + N_2);
    }
}
