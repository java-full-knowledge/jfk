package recrusion;

public class rec11 {
   int x = 0;


    public static   int sum(int n) {
        int x = this.x;
       if (n >= 0) {
            x = sum(n-1) + n;
            return x;
        }
        else {
           return -1;
       }
    }
}



