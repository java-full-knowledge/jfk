package Task_201_230;

public class Task_219 {
    public  static  void  main(String [] args) {
        int[] arr = new int[]{23, 4, 5, 66, 7, -4, -55, -66, 2, -33, -5};
        int  s = 0,k=3;
        for(int i=0;i<arr.length;i++)
            if(i%k==0)
                s++;
        System.out.println(s);

    }
}
