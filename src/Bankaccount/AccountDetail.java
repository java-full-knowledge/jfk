package Bankaccount;

class AccountDetail extends AbstractBankEntity {

    private String email;
    private int accountNumber;

    AccountDetail(int id, String email, int accountNumber) {
        super(id);
        this.email = email;
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getAccountId() {
        return getId();
    }

    public String getEmail() {
        return email;
    }

}
