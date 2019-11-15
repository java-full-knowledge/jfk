package Homework_11_11_19;


public class Recursion_Exercises {

    //1:
    static void numberPrint(int n) {

        if (n <= 50) {
            System.out.print(n + " ");
            numberPrint(n + 1);
        }
    }

    //2:
    static int sum_of_numbers(int n) {
        if (n == 1)
            return 1;
        else
            return (n + sum_of_numbers(n - 1));
    }

    //3:

    private static int fib(int n) {

        if (n == 0)
            return 0;
        if (n == 1 || n == 2)
            return 1;
        return fib(n - 1) + fib(n - 2);
    }

    static void fibonachiSeries(int n, int index) {
        if (index > n)
            return;
        System.out.print(fib(index) + " ");
        fibonachiSeries(n, index + 1);

    }


    //4:
    static void array_elements(int[] arr, int index) {
        if (index >= arr.length)
            return;
        System.out.print(arr[index] + ",");
        array_elements(arr, index + 1);

    }

    //5:
    static int digits_of_number(int n) {
        if (n == 0)
            return 0;
        return 1 + digits_of_number(n / 10);
    }

    //6:
    static int sum_of_digits(int n) {
        if (n == 0)
            return 0;
        return (n % 10) + sum_of_digits(n / 10);
    }

    //7:
    static int gcd_Numbers(int a, int b) {
        if (a != b) {
            if (a > b)
                return gcd_Numbers(a - b, b);
            else
                return gcd_Numbers(a, b - a);
        } else
            return b;
    }

    //8:
    static int maxelementarray(int[] arr, int index, int max) {
        if (index < arr.length) {
            if (max < arr[index])
                max = arr[index];
            return maxelementarray(arr, index + 1, max);
        }
        return max;
    }

    //9:
    static String reverseString(String s, int index) {
        if (index == s.length())
            index--;
        if (index >= 0)
            return "" + s.charAt(index) + reverseString(s, index - 1);
        return "";
    }

    //10:
    static int factorialNumber(int n) {
        if (n == 1)
            return 1;
        else
            return n * factorialNumber(n - 1);
    }

    //11:
    static long binary_number(int n) {
        if (n == 0 || n == 1)
            return n;
        return (binary_number(n / 2) * 10 + n % 2);
    }

    //12:
    static boolean prime_number(int n, int i) {
        if (i == n)
            i--;
        if (i == 1)
            return true;
        if (n % i == 0)
            return false;
        else
            return prime_number(n, i - 1);
    }

    //13:
    static int lcm_Number(int a, int b) {
        if ((a == 0 || b == 0) || a == b)
            return (a == 0 ? a : b);
        if (a < b) {
            if (b % a == 0)
                return b;
            else return lcm_Number(a, b + b);
        } else {
            if (a % b == 0)
                return a;
            else
                return lcm_Number(a + a, b);
        }

    }

    //14:
    static void even_or_odd_numbers(int n, int index) {
        if (index <= n) {
            System.out.print(index + ",");
            even_or_odd_numbers(n, index + 2);
        }
    }

    //15:
    static int[][] multiplymatrix(int[][] a, int[][] b, int[][] c, int index_i, int index_j) {
        int sum = 0, a_i, a_j, b_i, b_j;
        if (index_i <= c.length - 1 && index_j <= c.length - 1) {
            a_i = 0;
            a_j = index_j;
            b_j = 0;
            b_i = index_i;
            while (a_i < a[index_j].length && b_j < b.length) {
                sum += (a[index_j][a_i] * b[b_j][index_i]);
                a_i++;
                a_j++;
                b_i++;
                b_j++;
            }
            c[index_j][index_i] = sum;
            if (index_i < a[index_j].length - 1)
                return multiplymatrix(a, b, c, index_i + 1, index_j);
            else {
                index_i = 0;
                return multiplymatrix(a, b, c, index_i, index_j + 1);
            }
        }
        return c;
    }

    //16:
    static boolean palindromeString(String s, int firstindex, int lastindex) {
        if (s.length() == 1)
            return true;
        if (lastindex == s.length())
            lastindex--;
        if (firstindex < lastindex) {
            if (s.charAt(firstindex) == s.charAt(lastindex))
                return palindromeString(s, firstindex + 1, lastindex - 1);
            else
                return false;
        } else
            return true;
    }

    //17:
    static int power(int n, int pow) {
        if (pow == 0)
            return 1;
        else
            return n * power(n, pow - 1);
    }

    //18:
    static void HailstoneSequence(int n) {
        System.out.print(n + ", ");
        if (n == 1)
            return;
        if (n % 2 == 0)
            HailstoneSequence(n / 2);
        else
            HailstoneSequence((n * 3) + 1);
    }

    //19:
    static String copy_string(String s, String p, int index) {
        if (index == 0)
            p = "";
        if (index < s.length())
            return copy_string(s, p + s.charAt(index), index + 1);
        else
            return p;

    }

    //20:
    static char firstcapitalletter(String s, int index) {
        if (s.length() == 0)
            return '?';
        if (index == s.length())
            return '$';
        if (s.charAt(index) >= 'A' && s.charAt(index) <= 'Z')
            return s.charAt(index);
        return firstcapitalletter(s, index + 1);
    }

    //21:
    static boolean binarysearch(int[] arr, int x, int index) {
        if (index == arr.length)
            return false;
        if (arr[index] == x)
            return true;
        return binarysearch(arr, x, index + 1);
    }

    public static void main(String[] args) {
        System.out.print("The natural numbers are :");
        numberPrint(1);
        System.out.println();
        System.out.println("Sum of numbers from 1 to n");
        System.out.println(sum_of_numbers(5));

        fibonachiSeries(7, 0);

        System.out.println(lcm_Number(4, 13));
        array_elements(new int[]{1, 2, 3, 4, 5}, 0);

        System.out.println();
        System.out.print("The number of digits in the number is :");
        System.out.println(digits_of_number(4));

        System.out.print("Sum_of_digits:");
        System.out.println(sum_of_digits(44));

        System.out.print("GCD Numbers:");
        System.out.println(gcd_Numbers(9, 21));

        System.out.print("Largest element of the array is:");
        System.out.println(maxelementarray(new int[]{1, 43, 2, 56, 5}, 0, 0));

        System.out.print("Revers String: ");
        System.out.println(reverseString("arman", "arman".length()));

        System.out.print("Factorial Numbers: ");
        System.out.println(factorialNumber(5));

        System.out.print("The Binary value: ");
        System.out.println(binary_number(66));

        System.out.println(prime_number(7, 7));

        // System.out.println(lcm_Number(8, 6));

        System.out.print("All even numbers:");
        even_or_odd_numbers(10, 2);
        System.out.println();
        System.out.print("All odd numbers:");
        even_or_odd_numbers(10, 1);
        System.out.println();

        System.out.print("Polinidrom ? ");
        System.out.println(palindromeString("aretera", 0, 7));

        System.out.print("Power:");
        System.out.println(power(3, 5));

        int[][] a = new int[][]{{1, 2, 6},
                {3, 4, 7},
                {5, 7, 8}};

        int[][] b = new int[][]{{5, 6, 6},
                {7, 8, 8},
                {1, 3, 6}};

        int[][] c = new int[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        multiplymatrix(a, b, c, 0, 0);
        for (int[] x : c) {
            for (int fin : x)
                System.out.print(fin + " ");
            System.out.println();
        }


        HailstoneSequence(13);


        System.out.println();
        String p = "fc";
        System.out.println(copy_string("arhgfd", p, 0));

        System.out.println(firstcapitalletter("afsdffhDhjdahd", 0));

        System.out.println(binarysearch(a[0], 6, 0));


    }
}
