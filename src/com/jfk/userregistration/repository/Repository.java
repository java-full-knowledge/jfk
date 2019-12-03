package com.jfk.userregistration.repository;


/**
 * @author William Arustamyan
 */


public interface Repository<DOMAIN> {

    DOMAIN save(DOMAIN domain);

    DOMAIN get(int id);

    DOMAIN delete(int id);
}
