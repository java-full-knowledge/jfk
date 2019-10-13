package com.jfk;

public class Task_40 {
    public static void main(String[] args) {
        double a = 133.4, b = 5.6, c = 23.5,d=77.5;

        if(a>b)
        {
            if(b>c)
            {
                if(c>d)
                    System.out.println(a+"\n"+b+"\n"+c+"\n"+d);
                    //d>c
                else
                {
                    if (b > d)
                        System.out.println(a + "\n" + b + "\n" + d + "\n" + c);
                        //d>b
                    else
                    {
                        if(a>d)
                            System.out.println(a+"\n"+d+"\n"+b+"\n"+c);
                            //d>a
                        else
                            System.out.println(d+"\n"+a+"\n"+b+"\n"+c);
                    }

                }
            }
            //c>b
            else
            {
                if(a>c)
                {
                    if(b>d)
                        System.out.println(a+"\n"+c+"\n"+b+"\n"+d);
                        //d>b
                    else
                    {
                        if(c>d)
                            System.out.println(a+"\n"+c+"\n"+d+"\n"+b);
                            //d>c
                        else
                        {
                            if(a>d)
                                System.out.println(a+"\n"+d+"\n"+c+"\n"+b);
                                //d>a
                            else
                                System.out.println(d+"\n"+a+"\n"+c+"\n"+b);
                        }
                    }
                }
                //c>a
                else
                {
                    if(b>d)
                        System.out.println(c+"\n"+a+"\n"+b+"\n"+d);
                        //d>b
                    else {
                        if(a>d)
                            System.out.println(c + "\n" + a + "\n" + d + "\n" + b);
                        else
                        if(c>d)
                            System.out.println(c+"\n"+d+"\n"+a+"\n"+b);
                        else
                            System.out.println(d+"\n"+c+"\n"+a+"\n"+b);
                    }
                }
            }
        }
        //b>a
        else
        {
            if(a>c)
            {
                if(c>d)
                    System.out.println(b+"\n"+a+"\n"+c+"\n"+d);
                    //d>c
                else
                {
                    if(a>d)
                        System.out.println(b+"\n"+a+"\n"+d+"\n"+c);
                        //d>a
                    else
                    if(b>d)
                        System.out.println(b+"\n"+d+"\n"+a+"\n"+c);
                        //d>b
                    else
                        System.out.println(d+"\n"+b+"\n"+a+"\n"+c);
                }
            }
            //c>a
            else
            {
                if(a>d)
                    System.out.println(c+"\n"+b+"\n"+a+"\n"+d);
                    //d>a
                else
                {
                    if(c>b)
                    {
                        if(b>d)
                            System.out.println(c+"\n"+b+"\n"+d+"\n"+a);
                        else
                        if(d<c)
                            System.out.println(c+"\n"+d+"\n"+b+"\n"+a);
                        else
                            System.out.println(d+"\n"+c+"\n"+b+"\n"+a);
                    }
                    else
                    {
                        if(b>d)
                        {
                            if(d>c)
                                System.out.println(b+"\n"+d+"\n"+c+"\n"+a);
                            else
                                System.out.println(b+"\n"+c+"\n"+d+"\n"+a);
                        }
                        else
                            System.out.println(d+"\n"+b+"\n"+c+"\n"+a);
                    }
                }
            }
        }


    }
}
