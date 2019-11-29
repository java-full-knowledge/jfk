package com.jfk.bankaccountsystem;


/**
 * @author William Arustamyan
 */


public class MemoryAccountStorage extends Storage {


    protected MemoryAccountStorage(int size) {
        super(size);
    }


    //Also need to add another variable to hold current storage size.
    @Override
    public void add(AbstractBankEntity entity) {
        entity.tableName();
        if (currentStorageSize != entities.length) {
            super.entities[currentStorageSize] = entity;
            this.currentStorageSize ++;
        }
        System.out.println("Storage is full...");
    }

    @Override
    public void remove(int id) {

    }

    @Override
    public AbstractBankEntity get(int id) {
        return null;
    }

    @Override
    protected int currentStorageSize() {
        return currentStorageSize;
    }
}































