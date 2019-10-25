package Task_201_230;

public class Task_205 {
    public static void main(String[] args) {
        int n = 123450;
        String str = " ";
        while (n != 0) {
            str = n % 10 + "\n" + str;
            n = n / 10;
        }
        System.out.println(str);

        int number = 3454630;
        int count = 0;
        int sum = 0;
        if (number == 0) {
            count = 1;
            System.out.println(0);
            return;
        }
        int originalNumber = number;
        while (number != 0) {
            number = number / 10;
            count++;
        }
        System.out.println("number digit count : " + count);
        int divNumber = (int) Math.pow(10, count - 1);
        while (count != 0) {
            int num = originalNumber / divNumber;
            System.out.println(num);
            originalNumber = originalNumber % divNumber;
            divNumber = divNumber / 10;
            count--;
        }

    }
}
