package Task_646_682;

public class Task_646 {
    public  static  void  main(String [] args)
    {
        String N="agsdgghdashdadadadafsggdgdaafsf";
        int count=0;
        for(int i=0;i<N.length();i++)
            if(N.charAt(i)=='a')
                count++;
            System.out.println("count:"+count);
    }
}
