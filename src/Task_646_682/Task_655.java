package Task_646_682;

public class Task_655 {
    public  static  void  main(String [] args) {
        String N_1 = "armykhjkjhan", N_2 = "";
        for(int i=N_1.length()-1;i>N_1.length()/2;i--)
            N_2+=N_1.charAt(i);
        for(int i=N_1.length()/2;i>=0;i--)
            N_2+=N_1.charAt(i);
        System.out.println("N_2="+N_2);
    }
}
