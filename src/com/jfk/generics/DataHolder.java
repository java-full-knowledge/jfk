package com.jfk.generics;

public class DataHolder<T> {

    private T data;

    public DataHolder(T data) {
        this.data = data;
    }

    public T getData() {
        return this.data;
    }

    public static <M extends Number> M[] sort(M[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array.length - i - 1; k++) {
                if (array[k].intValue() > array[k + 1].intValue()) {
                    M tmp = array[k];
                    array[k] = array[i];
                    array[i] = tmp;
                }
            }
        }
        return array;
    }

    public int[] sort(int[] array) {
        System.out.println("Array sort for int ");
        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array.length - i; k++) {
                if (array[i] > array[k]) {
                    int tmp = array[k];
                    array[k] = array[i];
                    array[i] = tmp;
                }
            }
        }
        return array;
    }

    public double[] sort(double[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array.length - i; k++) {
                if (array[i] > array[k]) {
                    double tmp = array[k];
                    array[k] = array[i];
                    array[i] = tmp;
                }
            }
        }
        return array;
    }
}
