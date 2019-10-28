package Task_646_682;

public class Task_651 {
    public  static  void  main(String [] args)
    {
       String  N_1="asdhjgjjsd",N_2="";
       int count;
       for(int i=0;i<N_1.length();i++)
       {
           count=0;
           for(int j=0;j<N_1.length();j++)
               if(N_1.charAt(i)==N_1.charAt(j))
                   count++;
               if(count==1)
                   N_2+=N_1.charAt(i);

       }
       System.out.println("N_2="+N_2);
    }
}
