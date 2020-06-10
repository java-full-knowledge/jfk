package src.com.jfk.inheritance;

import java.util.Date;
import java.util.Random;

class CreditCard extends AbstractBankEntity {

    private String cardNumber;
    private int accountNumber;
    private Date expirationDate;


    public CreditCard(int id, int accountNumber, Date expData) {
        super(id);
        this.cardNumber = cardNumerators();
        this.accountNumber = accountNumber;
        this.expirationDate = expData;
        setUpdatedDate(new Date());
    }

    private String cardNumerators() {
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
}
