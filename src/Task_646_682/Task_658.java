package Task_646_682;

public class Task_658 {
    public  static  void  main(String [] args) {

        String N_1 = "abde", N_2 = "";
        for (int i = 0; i < N_1.length()-1; i+=2)
            N_2 = N_2+N_1.charAt(i+1)+N_1.charAt(i);

        System.out.println("N_2=" + N_2);
    }
}
