package UserRegistration.dto;

import UserRegistration.domein.Phonenumber;

public class PhonenumberCreateRequestDto {

    private Phonenumber phonenumber;
    private int userId;

    public PhonenumberCreateRequestDto(Phonenumber phonenumbers, int userId) {
        this.phonenumber = phonenumbers;
        this.userId = userId;
    }

    public PhonenumberCreateRequestDto() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Phonenumber getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(Phonenumber phonenumber) {
        this.phonenumber = phonenumber;
    }
}
