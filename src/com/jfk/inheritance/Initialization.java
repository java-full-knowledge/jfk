package com.jfk.inheritance;

public class Initialization {

    private final String name;
    {
        System.out.println("Init block");
    }
    static {
        System.out.println("Static block");
    }
    public Initialization() {
        name = "test";
        System.out.println("Constructor");
    }
    public static void main(String[] args) {
        new Initialization();
    }
}
