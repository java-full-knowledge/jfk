package recrusion;

public class rec11 {



    public static   int sum(int n) {

       if (n >= 0) {
            return sum(n-1) + n;
        }
        else {
           return  -1;
       }
    }
}



