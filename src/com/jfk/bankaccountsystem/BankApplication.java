package com.jfk.bankaccountsystem;


/**
 * @author William Arustamyan
 */


public class BankApplication {

    private Storage memoryStorage;

    public BankApplication() {
        this.memoryStorage = new MemoryAccountStorage(10);
    }


    public AbstractBankEntity findByName(String name) {
        return null;
    }

    public AbstractBankEntity findById(int id) {
        return null;
    }

    public void add(AbstractBankEntity entity) {

    }

    public void remove(AbstractBankEntity entity) {

    }

    public void remove(int id) {
        //find and remove
    }

}
