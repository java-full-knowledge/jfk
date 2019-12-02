package UserRegistration.repository;

import UserRegistration.domein.Phonenumber;
import UserRegistration.dto.DomainCreationResponse;
import UserRegistration.dto.PhonenumberCreateRequestDto;
import UserRegistration.service.CrudeService;
import UserRegistration.service.PhonenumberService;
import UserRegistration.validators.domainvalidator.PhonenumberValidator;
import UserRegistration.validators.domainvalidator.ValidatesDomayn;
import UserRegistration.validators.validator.PhonebumberCorrectValidator;
import UserRegistration.validators.validator.PhonenumberLengthValidator;
import UserRegistration.validators.validator.Validator;

public class PhonenumberRepository implements Repository {

    private int phonenumber_index;
    private Phonenumber[] phonenumbers;

    public PhonenumberRepository(int size) {
        phonenumbers = new Phonenumber[size];
        phonenumber_index = 0;
    }

    public Phonenumber[] getDomains() {
        return phonenumbers;
    }

    public void setPhonenumbers(Phonenumber[] phonenumbers) {
        this.phonenumbers = phonenumbers;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void save(Object user) {
        if (phonenumber_index == phonenumbers.length) {
            System.out.println("Is Full");
            return;
        }
        Validator[] validators1 = new Validator[2];
        validators1[0] = new PhonebumberCorrectValidator();
        validators1[1] = new PhonenumberLengthValidator();

        ValidatesDomayn phonenumberValidator = new PhonenumberValidator(validators1);
        CrudeService phonenumberService = new PhonenumberService(phonenumberValidator);

        PhonenumberCreateRequestDto dto = (PhonenumberCreateRequestDto) user;
        DomainCreationResponse domainCreationResponse = (DomainCreationResponse) phonenumberService.create(dto);

        if (domainCreationResponse.getDomain() != null) {
            domainCreationResponse.getDomain().setId(phonenumber_index);
            phonenumbers[phonenumber_index] = (Phonenumber) domainCreationResponse.getDomain();
            phonenumber_index++;
        }
    }

    @Override
    public Phonenumber get() {

        return phonenumbers[phonenumber_index - 1];
    }

    @Override
    public int getUserSize() {
        return phonenumber_index;
    }
}
