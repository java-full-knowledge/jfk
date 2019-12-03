package com.jfk.userregistration.service;

public interface CrudService<REQUEST, RESPONSE> {

    RESPONSE create(REQUEST request);

    RESPONSE read(int id);

    RESPONSE update(REQUEST request);

    boolean delete(int id);
}
