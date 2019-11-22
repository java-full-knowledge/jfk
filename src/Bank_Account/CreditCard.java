package Bank_Account;

import java.util.Date;

public class CreditCard {
    private String cardNumber;
    private int accountNumber;

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


    private class Date{
        int date;
    }
    private enum   CardType{
        Visa,RuPay,MasterCard, AmericanExpress, Discover
    }

    public CreditCard(int accountNumber,Date expDate,CardType cardType){
        this.accountNumber=accountNumber;
        this.
    }
}
