package Bankaccount;

import java.util.Date;

public class Bank_Test {
    public static void main(String[] args) {

        Customer customer = new Customer(888, "xxxx", "yyyy", "MINSK ST");
        AccountDetail accountDetail = new AccountDetail(customer.getId(), "test@test.de", 55);
        AccountBalance accountBalance = new AccountBalance(8.65, customer.getId());
        Account account = new Account(customer, accountDetail, accountBalance);
        CreditCard creditCard = new CreditCard(customer.getId(), account.getAccountDetail().getAccountNumber(), new Date(), CardType.VISA);
        PhoneNumber phoneNumber = new PhoneNumber(customer.getId(), CountryCode.ARM, "77-xx-xx-xx", PhoneType.Mobile);

        System.out.println(creditCard.getCardNumber());
        System.out.println(customer.getCreatedDate());
        System.out.println(creditCard.getUpdatedDate());


    }
}

