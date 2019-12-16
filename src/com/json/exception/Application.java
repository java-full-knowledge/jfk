package com.json.exception;

public class Application {


    public static void main(String[] args) {
        try {
            System.out.println(1/0);
            Gender gender = getGender("fvfgfgfgfgfg");
            System.out.println(gender);
        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("IS RUNNING");
    }

    private static Gender getGender(String name) {
        try {
            return Gender.of(name);
        } catch (InvalidGenderException e) {
            System.out.println(e.getGenderName());
            throw new RuntimeException("Gender name is invalid : " + e.getGenderName());
        }
    }
}





















