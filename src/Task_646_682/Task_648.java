package Task_646_682;

public class Task_648 {
    public  static  void  main(String [] args)
    {
        String N="ffgd0000gftxhj0h0uu070";
                int i=0,count=0;
        while (N.charAt(i)!='x')
            i++;
        for(;i<N.length();i++)
            if(N.charAt(i)=='0')
                count++;
            System.out.println("count:"+count);
    }
}
