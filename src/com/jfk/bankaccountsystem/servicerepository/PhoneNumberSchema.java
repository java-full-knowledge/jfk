package com.jfk.bankaccountsystem.servicerepository;

public class PhoneNumberSchema implements Schema {

    private int rowSize;

    public PhoneNumberSchema(int rowSize) {
        this.rowSize = rowSize;
    }
    @Override
    public String tableName() {
        return "phone_number";
    }

    @Override
    public SchemaDependedEntity[] rows() {
        return new Entity[this.rowSize];
    }
}
