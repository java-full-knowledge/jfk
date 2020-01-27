package homework012020;

public class EX39 {
    public static void main(String[] args) {
        int a, b, c, d;
        a=2;
        b=6;
        c=5;
        d=8;
        if(a<b && a<c && a<d ){
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);}
    else if(a<b && a<c && a>d){
            System.out.println(d);
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }
    else if (a<b && a>c && a<d){
            System.out.println(c);
            System.out.println(a);
            System.out.println(b);
            System.out.println(d);
        }
    else if (a<b && a>c && a>d){
            System.out.println(c);
            System.out.println(d);
            System.out.println(a);
            System.out.println(b);
        }
    else if(a>b && a<c && a<d){
            System.out.println(b);
            System.out.println(a);
            System.out.println(c);
            System.out.println(d);}

    }
}
