package recrusion;

public class rec11 {
    int x = 0 ;
    int n = 10;
    public void sum(){
       while (n>=0) {
           x = n + x;
           n--;
           sum();

       }
        }
    }

