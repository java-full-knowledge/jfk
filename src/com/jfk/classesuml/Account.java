package com.jfk.classesuml;

public class Account {
     private String id="AG0404274";
     private  String name="Tigran";
     private int balance=50;

     public Account(String id,String name){
         this.id=id;
         this.name=name;
     }
      public Account(String id,String name, int balance){
         this(id,name);
         this.balance=balance;

      }
      public String  getId(){
         return id;

    }
    public String getName(){
         return name;
    }
     public int getBalance() {
         return balance;
     }
         public int credit(int amount)
         {
             return balance+=amount;
         }
          public int debit(int amount){
         if (amount<=balance)
        balance-=amount;
         else {
                  System.out.println("Amount exceeded balance");
              }
         return balance;

          }
  public int transferTo(Account another, int amount){
      if (amount<=balance)
          another.balance=balance+amount;
      else
          System.out.println("Amount exceeded balance");
      return balance;

      }

    @Override
    public String toString() {
        return  "Account[id="+id+" name="+name+" balance="+balance+"]";
    }
}







