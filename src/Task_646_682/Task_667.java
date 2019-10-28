package Task_646_682;

public class Task_667 {
    public  static  void  main(String [] args) {
        String N = "aizhz";
        int Sum = 0, Powr = 1;
        for (int i = 0; i < N.length();i++)
            if(N.charAt(i)=='z')
            {
                Sum+=i;
                Powr*=i;
            }
        System.out.println("Sum:"+Sum+'\n'+"Powr:"+Powr);
    }
}
