package Task51_70;

public class App_60 {

    public static void main(String [] args)
    {
        int t=697;
        int a=t/100,b=(t/10)%10,r=t%10;
        if(a-b>0)
        {
            if(a-b<a-r)
                System.out.println(a+" "+b+" "+r);
            else
            if(a-b>a-r && a-r>0)
                System.out.println(a+" "+r+" "+b);
            else
            if(a-b>a-r && a-r<0)
                System.out.println(r+" "+a+" "+b);
        }
        else {
            if (a - r < a - b)
                System.out.println(r + " " + b + " " + a);
            if (a - r > a - b && a - r < 0)
                System.out.println(b + " " + r + " " + a);
            else if (a - r > a - b && a - r > 0)
                System.out.println(b + " " + a + " " + r);
        }
    }
//Array
        /*
        int min;
       int [] arr=new int[]{t/100,(t/10)%10,t%10};
       for(int i=0;i<arr.length-1;i++)
       {
           for(int j=1;j<arr.length;j++)
                  if(arr[i]<arr[j]) {
                      min = arr[i];
                       arr[i] = arr[j];
                      arr[j] = min;
                  }

       }
       for(int b:arr)
           System.out.println(b);

       */

}

