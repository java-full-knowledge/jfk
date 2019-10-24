package com.jfk;

public class APP203 {
    public static void main(String[] args) {
        int n=4563;
        int count=1;
        while(n!=0){
            count*=n%10;
            n=n/10;
        }
        System.out.println("count = " + count);
    }
}
