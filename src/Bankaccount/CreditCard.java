package Bankaccount;

import java.util.Date;
import java.util.Random;

class CreditCard extends AbstractBankEntity {

    private String cardNumber;
    private int accountNumber;
    private Date expirationDate;
    private CardType cardType;


    public CreditCard(int id, int accountNumber, Date expData, CardType cardType) {
        super(id);
        this.cardNumber = cardNumbergenerator();
        this.accountNumber = accountNumber;
        this.expirationDate = expData;
        this.cardType = cardType;
        setUpdatedDate(new Date());
    }

    private String cardNumbergenerator() {
        String temp = "";
        Random random = new Random();
        for (int i = 0; i < 16; i++) {
            temp += random.nextInt(9);
            if ((i + 1) % 4 == 0)
                temp += " ";
        }
        return temp;
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


}
