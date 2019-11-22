package Bank_Account;

public class Account extends Address {
    private AccountDetail AccountDetail;
    private AccountBalance AccountBalance;
    private Address Address;

    private class AccountDetail {
        private char Accountdetail;

        public AccountDetail(char Accountdetail) {
            this.Accountdetail = Accountdetail;
        }

        public void setAccountdetail(char Accountdetail) {
            this.Accountdetail = Accountdetail;
        }

        public char getAccountdetail() {
            return Accountdetail;
        }
    }

    private class AccountBalance {
        private double Accountbalance;

        public AccountBalance(double Accountbalance) {
            this.Accountbalance = Accountbalance;
        }

        public double getAccountbalance() {
            return Accountbalance;
        }

        public void setAccountbalance(double Accountbalance) {
            this.Accountbalance = Accountbalance;
        }
    }

    public Account(Address.Country.getCountry Country, Address.street street, Address.PhoneNumber PhoneNumber) {
        super(getCountry, street, PhoneNumber);
    }
}






}


