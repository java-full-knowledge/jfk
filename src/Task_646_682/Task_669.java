package Task_646_682;

public class Task_669 {
    public  static  void  main(String [] args) {
        String N="saatbs";
        char temp;
        boolean t=false;
        int i=0,j=N.length()-1,count=0;
        while(i<=j)
        {
            if(N.charAt(i)!=N.charAt(j))
            {
                t=true;
                break;
            }
            i++;
            j--;
        }
        temp=t?'b':'a';
        for (i=0;i<N.length();i++)
            if(N.charAt(i)==temp)
                count++;
            System.out.println("count "+temp+":"+count);
    }
}
