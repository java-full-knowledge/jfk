package Task_151_173;

import com.sun.prism.shader.Solid_TextureYV12_AlphaTest_Loader;

public class Task_158 {
    public  static  void  main(String [] args) {
        int s=1;
        for(int i=100;i<=999;i++)
            if(i%3!=0 && i%2!=0)
                s*=i;
        System.out.println("s="+s);
    }
}
