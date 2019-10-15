package Task71_80;

public class App_78 {
    // x>12 ? y=3log3x : y=x^3 x=[10;20] ^x=2
    public static void main(String[] args) {

        double y=0;

            for(double x=10;x<=28;x+=2)
            {
                if(x>12)
                {

                    for(double i=2;i<=x;i+=1)
                        if(Math.pow(3,i)==x )
                        {

                            y=3*i;
                            break;
                        }
                    else
                        if(Math.pow(3,i)>x)
                        {
                            y=3*(i-1);
                            break;
                        }

                }
                else
                    y=x*x*x;
                System.out.println("x="+(int)x+"    y="+(int)y);
            }


    }
}
