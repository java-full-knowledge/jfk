package Task_646_682;

public class Task_672 {
    public  static  void  main(String [] args) {
        String  N="saxjsd",Num="1234",Sum="";
        for(int i=0;i<N.length();i++)
        {
            if(N.charAt(i)=='x')
                Sum+=Num;
            else
                Sum+=N.charAt(i);
        }
        System.out.println("Sum:"+Sum);
    }
}
