package UserRegistration.domein;

import java.util.Date;

public abstract class Domain {

    protected int id;
    protected Date removetime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getRemovetime() {
        return removetime;
    }

    public void setRemovetime(Date removetime) {
        this.removetime = removetime;
    }
}
