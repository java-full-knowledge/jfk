package Bank_Account;

public class Customer extends Address {
   private char customerName;
   private char customerSurname;


    public Customer(Address.Country Country, Address.street street, Address.PhoneNumber Phonenumber) {
        super(Country, street, Phonenumber);
    }

    public char getCustomerName() {
        return customerName;
    }

    public char getCustomerSurname() {
        return customerSurname;
    }

    public void setCustomerName(char customerName) {
        this.customerName = customerName;
    }

    public void setCustomerSurname(char customerSurname) {
        this.customerSurname = customerSurname;
    }

}
