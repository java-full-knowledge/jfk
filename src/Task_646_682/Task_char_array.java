package Task_646_682;

public class Task_char_array  {

    public  static  void  main(String [] args) {
        char[] arr = {' ','H', 'e', 'l', 'l', 'o', ',', 'w', 'o', 'r','l','d',','};
        int count=0;
        boolean t=false;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>=65 && arr[i]<=129  )
                t=true;
            if((arr[i]==' ' || arr[i]==',') && t==true) {
                count++;
                t=false;
            }
        }
        if(t==true)
            count++;
        System.out.println(count);
        char [] p=new char[5];
        System.out.println((int) p[1]);
    }
}
