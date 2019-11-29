package com.jfk.bankaccountsystem.servicerepository;

public class UserSchema implements Schema {
    private int rowSize;

    public UserSchema(int rowSize) {
        this.rowSize = rowSize;
    }

    @Override
    public String tableName() {
        return "users";
    }

    @Override
    public SchemaDependedEntity[] rows() {
        return new Entity[this.rowSize];
    }
}
