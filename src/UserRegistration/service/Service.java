package UserRegistration.service;

import UserRegistration.validators.domainvalidator.ValidatesDomayn;

public abstract class Service {

    protected ValidatesDomayn validatesDomayn;

    public Service(ValidatesDomayn validatesDomayn) {
        this.validatesDomayn = validatesDomayn;
    }
}
