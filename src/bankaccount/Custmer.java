package bankaccount;

public class Custmer extends AbstractBankEntity {
    String custmerName;
    String custmerSurname;
    Address custmerAddress;

    public Custmer(int id, String custmerName, String custmerSurname, Address custmerAddress) {
        super(id);
        this.custmerName = custmerName;
        this.custmerSurname = custmerSurname;
        this.custmerAddress = custmerAddress;
    }
}
