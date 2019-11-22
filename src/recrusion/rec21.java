package recrusion;

public class rec21 {
int x;
    public int fib (int n) {
        while (n>=1){
            n = fib(n-1) + fib(n-2);
            System.out.println(n);

        }
       { System.err.print("Fibonaci Serias is :");}
return -1;
    }
    public static void main(String[]args) {
      rec21 fibonachi = new rec21();
      fibonachi.fib(10);

    }
}
