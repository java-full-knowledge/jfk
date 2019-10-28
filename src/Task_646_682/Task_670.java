package Task_646_682;

public class Task_670 {
    public  static  void  main(String [] args) {
        String N="adbea";
        int count=0;
        for(int i=1;i<N.length()-1;i++)
            if(N.charAt(i-1)<N.charAt(i) && N.charAt(i)>N.charAt(i+1))
                count++;
            System.out.println("count:"+count);
    }
}
