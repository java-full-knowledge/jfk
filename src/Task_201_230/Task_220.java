package Task_201_230;

public class Task_220 {
    public  static  void  main(String [] args) {
        int[] arr = new int[]{23, 4, 5, 66, 7, -4, -55, -66, 2, -33, -5};
        int  pos = 0,neg=0;
        for(int i=0;i<arr.length;i++)
            if(arr[i]>0)
                pos++;
            else
                if(arr[i]<0)
                    neg++;
        System.out.println("Positiv="+pos+"   Negativ="+neg);

    }
}
