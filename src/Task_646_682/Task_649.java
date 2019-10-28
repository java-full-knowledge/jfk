package Task_646_682;

public class Task_649 {
    public  static  void  main(String [] args)
    {
        String N="asdzertzsd";
        int i=0,count=0;
        while (N.charAt(i)!='z')
            i++;
       while (N.charAt(++i)!='z')
                count++;
        System.out.println("count:"+count);
    }
}
