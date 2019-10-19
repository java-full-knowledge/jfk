package Task_201_230;

public class Task_211 {
    public  static  void  main(String [] args) {
        int[] arr = new int[]{23, 4, 5, 66, 7, -4, -55, -66, 2, -33, -5};
        int count=0,s=0;
        for (int i : arr)
            if(i>0)
            {
                s+=i;
                count++;
            }
        System.out.println((double) s/count);

    }
}
