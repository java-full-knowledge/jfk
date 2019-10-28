package Task_646_682;

public class Task_649 {
    public static void main(String[] args) {
        String n = "asdzjdskjkdjkjdhbdbvz,ertzsd";
        int i = 0, count = 0;
        while (n.charAt(i) != 'z') {
            i++;
        }
        while (n.charAt(++i) != 'z') {
            count++;
        }
        System.out.println("COUNT : " + count);
    }
}