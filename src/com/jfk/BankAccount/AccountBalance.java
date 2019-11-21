package com.jfk.BankAccount;

public class AccountBalance extends AbstractBankEntity {
    private int balance;
    private CardType cardkind;

    public AccountBalance(int id, int balance, CardType cardkind) {
        super(id);
        this.balance = balance;
        this.cardkind = cardkind;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public CardType getCardkind() {
        return cardkind;
    }

    public void setCardkind(CardType cardkind) {
        this.cardkind = cardkind;
    }
}
