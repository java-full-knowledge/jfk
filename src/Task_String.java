public class Task_String {
    public static void main(String[] args) {
        char[] array = {'@', 'H', 'i', ',', '!', '!', '!', ','};
        int count = 0;
        boolean t = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 65 && array[i] <= 129) {
                t = true;
            }
            if ((array[i] == ' ' || array[i] == ',') && t == true) {
                count++;
                t = false;
            }
        }
        if (t == true) {
            count++;
        }
        System.out.println(count);
    }
}