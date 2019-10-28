package Task_646_682;

public class Task_675 {
    public  static  void  main(String [] args) {
        String  N_1="afgabhghabjjabhb",N="";
        for(int i=0;i<=N_1.length()-1;i++)
        {
            if(N_1.charAt(i)=='a'&& i+1<N_1.length() && N_1.charAt(i+1)=='b')
                i++;
            else
                N+=N_1.charAt(i);
        }
        System.out.println("N="+N);
    }
}
