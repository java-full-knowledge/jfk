package com.jfk.BankAccount;

import java.util.Date;

public class CreditCard extends AbstractBankEntity {
    private String cardNumber="random";
    private int accountNumber;
    private Date expirationDate;
    private CardType  cardType;

    public CreditCard( int accountNumber, Date expirationDate, CardType cardType) {
        super(2);
        this.accountNumber = accountNumber;
        this.expirationDate = expirationDate;
        this.cardType = cardType;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public CreditCard(int id) {
        super(id);
    }
}
