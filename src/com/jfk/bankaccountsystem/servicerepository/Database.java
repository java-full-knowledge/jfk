package com.jfk.bankaccountsystem.servicerepository;

public interface Database {
    void add(SchemaDependedEntity entity);

    boolean remove(SchemaDependedEntity entity);

    Entity get(int id);
}
