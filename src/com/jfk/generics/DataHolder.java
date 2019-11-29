package com.jfk.generics;

public class DataHolder<T> {

    private T data;

    public DataHolder(T data) {
        this.data = data;
    }

    public T getData() {
        return this.data;
    }

    public <M> M calculate(M instance) {
        return null;
    }
}
