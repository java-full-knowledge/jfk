package com.jfk.bankaccountsystem;


/**
 * @author William Arustamyan
 */


public abstract class Storage extends SizedStorage {

    protected int currentStorageSize;

    protected AbstractBankEntity[] entities;

    protected Storage(int size) {
        this.currentStorageSize = 0;
        this.entities = new AbstractBankEntity[size];
    }

    //check storage size before adding some item to it
    public abstract void add(AbstractBankEntity entity);

    public abstract void remove(int id);

    public abstract AbstractBankEntity get(int id);

}
