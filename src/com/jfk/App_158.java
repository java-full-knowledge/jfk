package com.jfk;

public class App_158 {public static void main(String[] args) {
    int n = 100;
    int a = 121;
    for (int i = 100; i <= a; i++) {
        if (!(i % 3 == 0) && !(i % 2 ==0)) {
            n *=i;
        }
    }
    System.out.println(n);
}

}
