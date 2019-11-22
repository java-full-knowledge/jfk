package Bank_Account;

public class Address {

    public   Country Country;
    private  street street;
    private  PhoneNumber PhoneNumber;

    private static class Country{
            private char Country;
            public Country(char Country){
                this.Country=getCountry();
            }

            public char getCountry() {
                return Country;
            }

            public void setCountry(char country) {
                Country = country;
            }
        }
        private static class street{
            private char street;
            public street(char street){
                this.street=getStreet();
            }
            public char getStreet() {
                return street;
            }

            public void setStreet(char street) {
                this.street = street;
            }
        }
        private static class PhoneNumber{
            private int[] PhoneNumber;
            public PhoneNumber(int[] PhoneNumber){
                this.PhoneNumber=getPhoneNumber();
            }
            public int[] getPhoneNumber() {
                return PhoneNumber;
            }

            public void setPhoneNumber(int[] phoneNumber) {
                PhoneNumber = phoneNumber;
            }
    }




    public Address(Country Country, street street, PhoneNumber PhoneNumber) {
       this.Country= Country;
                this.street =street;
        this.PhoneNumber=PhoneNumber;
    }





}
