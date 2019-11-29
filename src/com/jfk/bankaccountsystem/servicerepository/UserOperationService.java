package com.jfk.bankaccountsystem.servicerepository;

public class UserOperationService implements BasicOperationService {
    private Database database;

    public UserOperationService(Database database) {
        this.database = database;
    }


    @Override
    public Entity create(Entity entity) {

        User user = (User) entity;

        this.database.add(entity);
        return null;
    }

    @Override
    public void update(Entity entity) {
        Entity found = this.database.get(entity.id);
        if (found != null) {

        }
        this.create(found);
    }

    @Override
    public boolean delete(Entity entity) {
        return this.database.remove(entity);
    }

    @Override
    public Entity read(int id) {
        return this.database.get(id);
    }
}
