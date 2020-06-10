package src.com.jfk;

public class App_649 {
    public static void main(String[] args) {
        char[] array = {'a', 'z', 'x', 'a', 'x', 'b', 'b', 'z', '0', 'a'};

        boolean firstZ = false;
        boolean secondZ = false;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 'z' && firstZ == false) {
                firstZ = true;
            } else if (array[i] == 'z' && firstZ == true) {
                secondZ = true;
            }

            if (array[i] != 'z' && firstZ == true && secondZ == false) {
                count++;
            }

        }
        System.out.println(count);
    }

}
