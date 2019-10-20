package Tasks_152_173;

public class Task_173 {

        public  static  void  main(String [] args) {
            int A= 15, B=95, N=5, H;
            H = (B-A)/N;

            System.out.println("H = " + H);
            for(int i=0;i<=N;i++) {
                System.out.print("A" + i + " = " + (A + i * H) + ", ");
            }
            System.out.println("B = " + B);
        }
}
