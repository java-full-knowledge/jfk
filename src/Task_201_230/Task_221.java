package Task_201_230;

public class Task_221 {
    public  static  void  main(String [] args) {
        int[] arr = new int[]{23, 4, 5, 66, 7, -4, -55, -66, 2, -33, -5};
        int  s = 0,a=3,b=30;
        for(int i=0;i<arr.length;i++)
            if(arr[i]>=a && arr[i]<=b)
                s+=arr[i];
        System.out.println(s);

    }
}
