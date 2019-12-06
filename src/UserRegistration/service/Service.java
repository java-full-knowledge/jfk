package UserRegistration.service;

import UserRegistration.validators.domainvalidator.ValidatesDomayn;

public abstract class Service<R> {

    protected ValidatesDomayn validatesDomayn;
    protected R repository;

    public Service(ValidatesDomayn validatesDomayn,R repository) {
        this.validatesDomayn = validatesDomayn;
        this.repository=repository;
    }

    public ValidatesDomayn getValidatesDomayn() {
        return validatesDomayn;
    }

    public void setValidatesDomayn(ValidatesDomayn validatesDomayn) {
        this.validatesDomayn = validatesDomayn;
    }

    public R getRepository() {
        return repository;
    }

    public void setRepository(R repository) {
        this.repository = repository;
    }
}
