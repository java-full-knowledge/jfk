package Bankaccount;

import java.util.Date;

class Account extends AbstractBankEntity {

    private Customer customer;
    private AccountDetail accountDetail;
    private AccountBalance accountBalance;

    public Account(Customer customer, AccountDetail accountDetail, AccountBalance accountBalance) {
        super(customer.getId());
        this.customer = customer;
        this.accountDetail = accountDetail;
        this.accountBalance = accountBalance;
        setUpdatedDate(new Date());
    }
    public Customer getCustomer() {
        return customer;
    }

    public AccountDetail getAccountDetail() {
        return accountDetail;
    }

    public AccountBalance getAccountBalance() {
        return accountBalance;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setAccountDetail(AccountDetail accountDetail) {
        this.accountDetail = accountDetail;
    }

    public void setAccountBalance(AccountBalance accountBalance) {
        this.accountBalance = accountBalance;
    }
}
