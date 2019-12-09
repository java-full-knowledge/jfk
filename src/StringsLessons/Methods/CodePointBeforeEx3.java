package StringsLessons.Methods;

public class CodePointBeforeEx3 {
    public static void main(String[] args) {
        String text="w3resource.com";
        int beforepoin1=text.codePointBefore(1);
        int beforepoint2=text.codePointBefore(9);
        System.out.println(text);
        System.out.println("Before code1= "+beforepoin1);
        System.out.println("Before code2= "+beforepoint2);
    }

}
