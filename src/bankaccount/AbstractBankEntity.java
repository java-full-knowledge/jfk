package bankaccount;

import java.util.Date;

public class AbstractBankEntity {
    protected int id;
    protected Date createdDate;
    protected Date updetedDate;

    public AbstractBankEntity(int id){
        this.id = id;

    }

    public int getId() {
        return id;
    }
    public Date getCreatedDate(){
        return createdDate;
    }
    public Date getUpdetedDate(){
        return updetedDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public void setUpdetedDate(Date updetedDate) {
        this.updetedDate = updetedDate;
    }

}
