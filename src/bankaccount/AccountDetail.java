package bankaccount;

public class AccountDetail extends  AbstractBankEntity {
    private String AccountType;
    private  CardType Card;

    public AccountDetail(int id, String accountType, CardType card) {
        super(id);
        AccountType = accountType;
        Card = card;
    }

    public String getAccountType() {
        return AccountType;
    }

    public void setAccountType(String accountType) {
        AccountType = accountType;
    }

    public CardType getCard() {
        return Card;
    }

    public void setCard(CardType card) {
        Card = card;
    }
}
