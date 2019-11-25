package com.jfk.bankaccountsystem.servicerepository;

public abstract class Entity implements SchemaDependedEntity {
    protected int id;

    protected Entity(int id) {
        this.id = id;
    }

}
