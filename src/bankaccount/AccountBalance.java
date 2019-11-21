package bankaccount;

public class AccountBalance extends AbstractBankEntity {
    private int Balance;
    private  String BalanceType;

    public AccountBalance(int id, int balance, String balanceType) {
        super(id);
        Balance = balance;
        BalanceType = balanceType;
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int balance) {
        Balance = balance;
    }

    public String getBalanceType() {
        return BalanceType;
    }

    public void setBalanceType(String balanceType) {
        BalanceType = balanceType;
    }
}
