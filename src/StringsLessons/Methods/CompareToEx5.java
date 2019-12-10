package StringsLessons.Methods;

public class CompareToEx5 {
    public static void main(String[] args) {


        String text1 = "This is Exercise 3";
        String text2 = "This is Exercise 1";
        System.out.println("Text1:"+text2);
        System.out.println("Text2:"+text2);


        int result = text1.compareTo(text2);
        if (result < 0) {
            System.out.println("'" + text1 +"'"+ "is less than" + "'"+text2 + "'");
        }
        else if(result==0){
            System.out.println("'"+text1+"'"+"is equal to"+"'"+text2+"'");
        }
        else{
            System.out.println("'"+text1+"'"+"is greater than "+"'"+text2+"'");
        }

    }
}