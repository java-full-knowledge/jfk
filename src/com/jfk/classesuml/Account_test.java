package com.jfk.classesuml;

public class Account_test {
    public static void main(String[] args) {
        Account obj=new Account("as0101","Armen");
        Account obj1=new Account("ah0202","Hovo",60);
        System.out.println(obj);
        System.out.println(obj1);
        obj.getId();
        System.out.println(obj.getId());
        System.out.println(obj1.getBalance());
        System.out.println(obj1.credit(20));
        System.out.println(obj1.debit(90));
        System.out.println("obj1"+obj.transferTo(obj1,500));




    }
}
