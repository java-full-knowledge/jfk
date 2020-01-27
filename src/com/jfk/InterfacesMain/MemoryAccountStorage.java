package com.jfk.InterfacesMain;

public class MemoryAccountStorage extends Storage {


    protected MemoryAccountStorage(int size) {
        super(size);
    }


    //Also need to add another variable to hold current storage size.
    @Override
    public void add(AbstractBankEntity entity) {

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
        return 0;
    }
}