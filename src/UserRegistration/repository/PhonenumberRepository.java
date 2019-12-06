package UserRegistration.repository;

import UserRegistration.domein.Phonenumber;
import UserRegistration.dto.DomainCreationResponse;

public class PhonenumberRepository implements Repository<Phonenumber> {

    private int phonenumber_index;
    private Phonenumber[] phonenumbers;

    public PhonenumberRepository(int size) {
        phonenumbers = new Phonenumber[size];
        phonenumber_index = 0;
    }

    public Phonenumber[] getPhonenumbers() {
        return phonenumbers;
    }

    public void setPhonenumbers(Phonenumber[] phonenumbers) {
        this.phonenumbers = phonenumbers;
    }

    @Override
    public Phonenumber delete(int id) {
        Phonenumber phone=null;
        for (int i = 0; i <this.getUserSize() ; i++)
            if(phonenumbers[i].getUserId()==id) {
                phone=phonenumbers[i];
                for (int j = i; j < getUserSize() - 1; j++)
                    phonenumbers[j] = phonenumbers[j + 1];
                phonenumbers[--phonenumber_index]=null;
            break;
        }
        return phone;
    }

    @Override
    public Phonenumber save(DomainCreationResponse domain) {
        if (phonenumber_index == phonenumbers.length) {
            System.out.println("Repository is full...");
            return null;
        }
        if (domain.getDomain() != null ) {
            domain.getDomain().setId(phonenumber_index);
            phonenumbers[phonenumber_index] = (Phonenumber) domain.getDomain();
            phonenumber_index++;
        }
        return  (Phonenumber) domain.getDomain();
    }


    @Override
    public Phonenumber get() {
        return phonenumbers[phonenumber_index-1];
    }

    @Override
    public int getUserSize() {
        return phonenumber_index;
    }
/*
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
    }*/
}
