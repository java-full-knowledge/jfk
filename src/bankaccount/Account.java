package bankaccount;

public class Account extends AbstractBankEntity {
private Custmer custmer;
private AccountDetail accountDetail;
private AccountBalance accountBalance;

    public Account(int id, Custmer custmer, AccountDetail accountDetail, AccountBalance accountBalance) {
        super(id);
        this.custmer = custmer;
        this.accountDetail = accountDetail;
        this.accountBalance = accountBalance;
    }

    public Custmer getCustmer() {
        return custmer;
    }

    public void setCustmer(Custmer custmer) {
        this.custmer = custmer;
    }

    public AccountDetail getAccountDetail() {
        return accountDetail;
    }

    public void setAccountDetail(AccountDetail accountDetail) {
        this.accountDetail = accountDetail;
    }

    public AccountBalance getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(AccountBalance accountBalance) {
        this.accountBalance = accountBalance;
    }
}
