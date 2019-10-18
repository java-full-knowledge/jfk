package src.com.jfk;

public class App_55 {
    public static void main(String args []){
        int k = 918;
        int first = k % 10;
        int second = ( k / 10) %10;
        int third = k / 100;
        int min;
        if(first < second){
            min = first;
            if( min > third){
                min = third;
            } else { min = second;}
        }else{ min = second;}
        if( min > third)
            min = third;
        System.out.println(" first = "  + first);
        System.out.println(" second = "  + second);
        System.out.println(" third = "  + third);
        System.out.println("  min = "  + min);

    }
}

