package Task_151_173;

public class Task_169 {
    public  static  void  main(String [] args) {
        int x=1,y=66,z,temp=2;
        while((x+y)%temp!=0)
            temp++;
        z=temp==(x+y)?5:6;
        System.out.println("z="+z);
    }
}
