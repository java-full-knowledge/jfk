package com.jfk.BankAccount;

public class Customer extends AbstractBankEntity {
    private String customerName;
    private String customerSurname;
    private Address address;

    public Customer(int id, String cusomerName, String customerSurname, Address address) {
        super(id);
        this.customerName = cusomerName;
        this.customerSurname = customerSurname;
        this.address = address;
    }

    public String getCusomerName() {
        return customerName;
    }

    public void setCusomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerSurname() {
        return customerSurname;
    }

    public void setCustomerSurname(String customerSurname) {
        this.customerSurname = customerSurname;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
