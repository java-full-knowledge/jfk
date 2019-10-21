package com.jfk;

public class App_153 {public static void main(String[] args) {
    double n = 3.3;
    double a = 112;
    for (int  i = 1; i <= a; i++) {
        if (a % i == 2) {
            n += i;
        }
    }
    System.out.println(n);
}
}

