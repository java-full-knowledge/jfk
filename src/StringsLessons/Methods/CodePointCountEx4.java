package StringsLessons.Methods;

public class CodePointCountEx4 {
    public static void main(String[] args) {
        String text="w3resource.com";
        int count=text.codePointCount(1,10);
        System.out.println(text);

        System.out.println("The count is: "+count);
    }
}
