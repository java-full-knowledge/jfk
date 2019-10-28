package Task_646_682;

public class Task_681 {
    public static void main(String[] args) {
        char tmp = 'L';
        if (tmp >= 48 && tmp < 58) {
            System.out.println(1);
        } else if (tmp >= 65 && tmp < 97) {
            System.out.println(2);
        } else if (tmp >= 97 && tmp < 129) {
            System.out.println(3);
        } else {
            System.out.println(4);
        }
    }
}
