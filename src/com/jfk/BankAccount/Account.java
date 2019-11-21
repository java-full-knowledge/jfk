package com.jfk.BankAccount;

public class Account extends AbstractBankEntity{
    private Customer caustomer;
    private AccountDetail accountDetail;
    private AccountBalance accountBalance;

    public Account(int id, Customer caustomer, AccountDetail accountDetail, AccountBalance accountBalance) {
        super(id);
        this.caustomer = caustomer;
        this.accountDetail = accountDetail;
        this.accountBalance = accountBalance;
    }

    public Customer getCaustomer() {
        return caustomer;
    }

    public void setCaustomer(Customer caustomer) {
        this.caustomer = caustomer;
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
