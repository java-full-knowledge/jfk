package com.jfk.bankaccountsystem.servicerepository;

public interface Schema {

    String tableName();

    SchemaDependedEntity[] rows();

}
