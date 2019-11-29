package com.jfk.generics;

import com.jfk.userregistration.domain.Domain;

public class PhoneNumberDataHolder<T extends Domain> extends DataHolder<T> {

    private DataHolder<? super Domain> domainDataHolder;

    public PhoneNumberDataHolder(T data) {
        super(data);
    }
}
