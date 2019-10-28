package Task_646_682;

public class Task_663 {
    public  static  void  main(String [] args) {

        String N_1 = "abdahfgfchgjcx";
        int Sum=0,count=0;
        for (int i = 0; i < N_1.length(); i++)
            if (N_1.charAt(i) =='c')
            {
                Sum+=i;
                count++;
            }
        System.out.println("Sum/count:"+Sum/count);
    }
}
