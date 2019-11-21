//a
package Bankaccount;

import java.util.Date;

abstract class AbstractBankEntity {

    protected int id;
    protected Date createdDate;
    protected Date updatedDate;

    public AbstractBankEntity(int id) {
        this.id = id;
        createdDate = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

}
