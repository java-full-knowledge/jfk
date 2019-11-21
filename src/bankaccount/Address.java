package bankaccount;

public class Address  extends AbstractBankEntity{
    private Country country;
    private String street;
    private  PhoneNumber[] phoneNumber;

    public Address(int id,Country country, String street, PhoneNumber[] phoneNumber) {
        super(id);
        this.country = country;
        this.street = street;
        this.phoneNumber = phoneNumber;
    }
}
