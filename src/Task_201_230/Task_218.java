package Task_201_230;

public class Task_218 {
    public  static  void  main(String [] args) {
        int[] arr = new int[]{23, 4, 5, 66, 7, -4, -55, -66, 2, -33, -5};
        int  s = 0;
        for(int i=1;i<arr.length;i+=2)
            s+=Math.abs(arr[i]);
        System.out.println(s);

    }
}
