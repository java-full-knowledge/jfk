package Task_646_682;

public class Task_654 {
    public  static  void  main(String [] args) {
        String N_1 = "asjgjajsd", N_2 = "";
        for(int i=0;i<N_1.length();i++)
        {
            if(N_1.charAt(i)!='a')
                N_2+=N_1.charAt(i);
        }
        System.out.println("N_2="+N_2);
    }
}
