package Task_646_682;

public class Task_666 {
    public  static  void  main(String [] args) {

        String N_1 = "accbdxaui",N_2="";
        int ptr=(N_1.length()-1)/2-1;
        for(int i=0;i<ptr;i++)
            N_2+=N_1.charAt(i);
        for(int i=ptr+3;i<N_1.length();i++)
            N_2+=N_1.charAt(i);
        System.out.println("N_2= "+N_2 );
    }
}
