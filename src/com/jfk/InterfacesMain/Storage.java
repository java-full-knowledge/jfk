package com.jfk.InterfacesMain;

public abstract class Storage extends SizedStorage {

    protected AbstractBankEntity[] entities;

    protected Storage(int size) {
        this.entities = new AbstractBankEntity[size];
    }

    //check storage size before adding some item to it
    public abstract void add(AbstractBankEntity entity);




    public abstract void remove(int id);

    public abstract AbstractBankEntity get(int id);

}
