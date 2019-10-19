package Task_201_230;

public class Task_227 {
    public  static  void  main(String [] args) {
        int[] arr = new int[]{23, 4, 5, 66, 7, -4, -55, -66, 2, -33, -5};
        int  s = 0,count=0,k=8;
        for(int i=0;i<arr.length;i++)
            if(i%k==0)
            {
                count++;
                s+=arr[i];
            }
        System.out.println((double) s/count);

    }
}
