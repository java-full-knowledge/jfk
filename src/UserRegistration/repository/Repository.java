package UserRegistration.repository;

import UserRegistration.dto.DomainCreationResponse;

public interface Repository<Domain> {


    public Domain delete(int id);

    public Domain save(DomainCreationResponse domain);

    public Domain get();

    public int getUserSize();

}
