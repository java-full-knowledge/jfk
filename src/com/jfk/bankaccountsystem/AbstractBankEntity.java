package com.jfk.bankaccountsystem;


/**
 * @author William Arustamyan
 */


public abstract class AbstractBankEntity {

    protected String name;

    public int id;

    protected int age;


    public abstract String tableName();
    public String toString() {
        return "Abstract bank entity";
    }
}
