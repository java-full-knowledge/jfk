package com.jfk.userregistration.service;

import com.jfk.userregistration.domain.Domain;

public interface CrudService {

    Object create(Object createParameters);

    Object read(int id);

    Domain update(Object updateParameters);

    boolean delete(int id);
}