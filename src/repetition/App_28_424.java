package repetition;

import java.util.Arrays;

public class App_28_424 {
    public static boolean App_28(int a, int b, int c) {
        return b / a == c / b;
    }

    public static void App_39(int a, int b, int c, int d) {
        int min_a_b = a < b ? a : b;
        int max_a_b = a > b ? a : b;
        int min_c_d = c < d ? c : d;
        int max_c_d = c > d ? c : d;
        int tempmin = min_a_b < min_c_d ? min_a_b : min_c_d;
        int tempmax = max_a_b > max_c_d ? max_a_b : max_c_d;
        int tempmin1 = min_a_b > min_c_d ? min_a_b : min_c_d;
        int tempmax1 = max_a_b < max_c_d ? max_a_b : max_c_d;
        System.out.println(tempmin);
        System.out.println(tempmin1 < tempmax1 ? (tempmin1 + "\n" + tempmax1) : (tempmax1 + "\n" + tempmin1));
        System.out.println(tempmax);
    }

    public static void App_57(int n) {
        if (n > 300)
            System.out.println(((n / 10) % 10) / (n % 10));
        else
            System.out.println(((n / 100)) / (n % 10));

    }

    public static void App_65(int n) {
        if (((n / 10) % 10) * (n % 10) == 12)
            System.out.println("y = 12");
        else
            System.out.println("y = 0");

    }

    public static void App_158() {
        long sum = 1;
        for (int i = 100; i < 1000; i++)
            if (i % 2 != 0 && i % 3 != 0)
                sum *= i;
        System.out.println(sum);
    }

    public static void App_201(int n) {
        int s = 0;
        while (n != 0) {
            n = n / 10;
            s++;
        }
        System.out.println(s);
    }

    public static void App_216(int[] arr) {
        int s = 1;
        for (int i = 0; i < arr.length; i += 2)
            s *= arr[i];
        System.out.println("s=" + s);
    }

    public static void App_227(int[] arr, int k) {
        int sum = 0, del = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % k == 0) {
                del += arr[i];
                sum++;
            }
        }
        System.out.println(del / sum);
    }

    public static void App_239(int[] arr) {
        int sum = 0, m = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 5 == 0) {
                sum += arr[i] * arr[i];
                m++;
            }
        }
        System.out.println(sum / m);
    }

    public static void App_254(int[] arr) {
        int min = arr[0], max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
            else if (max < arr[i])
                max = arr[i];
        }
        System.out.println(max * min);
    }

    public static int[] App_284(int[] arr, int a, int b) {
        int count = 0, i = 0;
        for (int temp : arr)
            if (temp >= a && temp <= b)
                count++;
        int[] newarr = new int[count];
        for (int temp : arr)
            if (temp >= a && temp <= b) {
                newarr[i] = temp;
                i++;
            }
        return newarr;
    }

    public static void App_392(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void App399(int[] arr) {
        int s = 0, prev = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (prev == arr[i])
                s++;
            else
                prev = arr[i];
        }
        prev = arr[0];
        int j = 1;
        int[] y = new int[arr.length - s];
        y[0] = prev;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != prev) {
                y[j] = arr[i];
                prev = arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(y));
    }

    public static void App_424(int[][] arr) {
        int sum = 0, count = 0;
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j <= i; j++) {
                if (arr[i][j] % 2 != 0){
                    sum+=arr[i][j];
                    count++;
                }
            }
        System.out.println(sum/count);
    }

    public static void main(String[] args) {
        //App_39(8, 12, 6, 1);
        //App_57(261);
        //App_65(238);
        //App_158();
        //App_201(123);
        //App_216(new int[]{1,2,3,4,5,6,7,8});
        //App_227(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, 2);
        //App_254(new int[]{ 2, 3, 4, 5, 5, 6, 7, 8});
        //System.out.println(Arrays.toString(App_284(new int[]{1, 2, 4, 6, 8, 9}, 2, 8)));
        //App_392(new int[]{1, 2, 3, 4, 5, 6, 7});
        //App399(new int[]{1, 2, 2, 4, 5, 6, 6, 7, 8, 9, 9});
        /*App_424(new int[][]{ new int[]{3,2,3},
                             new int[]{5,2,3},
                             new int[]{1,2,3} });*/
    }
}
