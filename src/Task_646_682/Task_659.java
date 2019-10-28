package Task_646_682;

public class Task_659 {
    public  static  void  main(String [] args) {

        String N_1 = "accbdxa";
        boolean t=false;
        int count=0;
        char temp;
        for (int i = 0; i < N_1.length(); i++)
           if(N_1.charAt(i)=='x') {
               t = true;
               break;
           }
        temp=t?'c':'d';
           for (int i=0;i<N_1.length();i++)
               if (N_1.charAt(i)==temp)
                   count++;
        System.out.println("count "+temp+"="+count );
    }
}
