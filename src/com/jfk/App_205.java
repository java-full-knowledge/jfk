package com.jfk;

public class App_205 {
        public static void main(String[] args) {
            int n = 234231;
            int [] numArr = {};
            int num = 0;
            int i = 0;
            while ( n !=0){
                num = n%10;
                n = n/10;
                numArr[i] = num;
                i++;}
            for ( i =numArr.length-1;i != 0; i--);
            System.out.println(numArr[i]);
        }
}







