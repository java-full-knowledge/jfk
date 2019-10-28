package Task_646_682;

public class Task_668 {
    public  static  void  main(String [] args) {
    String  N_1="gasfdhgdhgsdha",N_2="";
    for (int i=0;i<N_1.length();i++)
        if(i%3==0)
            N_2+=N_1.charAt(i);
        System.out.println("N_2:"+N_2);
    }
}
