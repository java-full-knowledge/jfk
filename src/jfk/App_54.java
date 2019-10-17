package src.jfk;

public class App_54 {
    public static void main(String args []){
        int k = 918;
        int first = k % 10;
        int second = ( k / 10) %10;
        int third = k / 100;
        int max;
        if( first > second){
            max = first;
            if( max < third){
                max = third;
            } else { max = second;}

        }else{ max = second;}
        if( max < third)
            max = third;
        System.out.println(" first = "  + first);
        System.out.println(" second = "  + second);
        System.out.println(" third = "  + third);
        System.out.println(" max = "  + max);

    }
}

