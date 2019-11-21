package com.jfk.BankAccount;

public class AccountDetail extends AbstractBankEntity {

    private CardType cardType;
    private CreditCard cardDetails;

    public AccountDetail(int id, CardType cardType, CreditCard cardDetails) {
        super(id);
        this.cardType = cardType;
        this.cardDetails = cardDetails;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public CreditCard getCardDetails() {
        return cardDetails;
    }

    public void setCardDetails(CreditCard cardDetails) {
        this.cardDetails = cardDetails;
    }


}
