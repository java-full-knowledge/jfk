package com.jfk.bankaccountsystem.servicerepository;

public class PhoneNumberOperationService implements BasicOperationService {
    private Database database;

    public PhoneNumberOperationService(Database database) {
        this.database = database;
    }

    @Override
    public Entity create(Entity entity) {
        return null;
    }

    @Override
    public void update(Entity entity) {

    }

    @Override
    public boolean delete(Entity entity) {
        return false;
    }

    @Override
    public Entity read(int id) {
        return null;
    }
}
