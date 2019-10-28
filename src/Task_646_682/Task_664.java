package Task_646_682;

public class Task_664 {
    public  static  void  main(String [] args) {

        String N_1 = "accbdxa";
        boolean t=false;
        int count=0;
        char temp,ptr='y';
        for (int i = 0; i < N_1.length(); i++)
            if(N_1.charAt(i)==ptr) {
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
