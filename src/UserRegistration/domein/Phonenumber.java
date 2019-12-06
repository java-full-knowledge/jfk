package UserRegistration.domein;

public class Phonenumber extends Domain {

    private String phonenumber;
    private int userId;

    public Phonenumber(String phonenumber, int userId) {
        this.phonenumber = phonenumber;
        this.userId = userId;
        removetime = null;
    }

    public Phonenumber() {
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Phonenumber{" +
                "id=" + id +
                ", phonenumber='" + phonenumber + '\'' +
                ", userId=" + userId +
                ", removetime="+removetime+
                '}';
    }
}
