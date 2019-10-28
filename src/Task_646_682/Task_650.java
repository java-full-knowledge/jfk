package Task_646_682;

public class Task_650 {
        public  static  void  main(String [] args)
        {
            String N_1="feg",N_2="segf";
            int count=0;
           for(int i=0;i<N_1.length();i++)
           {
             //N_1.charAt(i);
               if(N_2.indexOf(N_1.charAt(i))!=-1)
                   count++;
           }
           System.out.println("count:"+count);
        }
}
