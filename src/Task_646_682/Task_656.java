package Task_646_682;

public class Task_656 {
    public  static  void  main(String [] args) {
        String N_1 = "ihghjhhmhghxwyjhhxmxj", N_2 = "";
        for (int i = 0; i < N_1.length(); i++) {
            if (N_1.charAt(i) == 'x')
                N_2 = N_2 + 'y' + 'y';
            else
                N_2 += N_1.charAt(i);

        }
        System.out.println("N_2=" + N_2);
    }

}
