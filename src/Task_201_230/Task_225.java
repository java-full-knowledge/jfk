package Task_201_230;

public class Task_225 {
    public  static  void  main(String [] args) {
        int[] arr = new int[]{23, 4, 5, 66, 7, -4, -55, -66, 2, -33, -5};
        int  s = 1,t=8;
        for(int i=0;i<arr.length;i++)
            if(Math.abs(arr[i])<t)
                s*=arr[i];
        System.out.println(s);

    }
}
