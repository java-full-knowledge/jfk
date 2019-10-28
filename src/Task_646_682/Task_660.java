package Task_646_682;

public class Task_660 {
    public  static  void  main(String [] args) {

        String N_1 = "abdtyuiujh", N_2 = "";
        int time=1;
        for (int i=0;i<N_1.length();i++)
        {
            if(time==3)
            {
                N_2+='a';
                time=1;
            }
            else {
                N_2+=N_1.charAt(i);
                time++;
            }
        }

        System.out.println("N_2=" + N_2);
    }
}
