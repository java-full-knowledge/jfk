package com.jfk.bankaccountsystem.servicerepository;

public interface BasicOperationService {

    Entity create(Entity entity);

    void update(Entity entity);

    boolean delete(Entity entity);

    Entity read(int id);
}
