package com.jfk.bankaccountsystem.servicerepository;

public class OracleDatabase implements Database {

    private Schema[] schemas;

    public OracleDatabase(Schema[] schemas) {
        this.schemas = schemas;
    }

    @Override
    public void add(SchemaDependedEntity entity) {
        Schema found = null;
        for (Schema schema : this.schemas) {
            if (schema.equals(entity.tableName())) {
                found = schema;
            }
        }

        if (found != null) {
            SchemaDependedEntity[] rows = found.rows();
            rows[entity.id()] = entity;
        }
    }

    @Override
    public boolean remove(SchemaDependedEntity entity) {
        return false;
    }

    @Override
    public Entity get(int id) {
        return null;
    }


}
