package com.jfk.userregistration.service;

import com.jfk.userregistration.domain.Domain;
import com.jfk.userregistration.dto.DomainCreationResponse;

public interface CrudService<D extends Domain, R, C> {

    R create(C createParameters);

    D read(int id);

    Domain update(Object updateParameters);

    boolean delete(int id);
}
