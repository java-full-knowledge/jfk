package Bankaccount;

class AccountBalance extends AbstractBankEntity {

    private double balance;

    public AccountBalance(double balance, int id) {
        super(id);
        if (balance > 0.0) {
            this.balance = balance;
        }
    }
    public double getBalance() {
        return balance;
    }


}
