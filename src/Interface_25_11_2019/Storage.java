package Interface_25_11_2019;

abstract class Storage implements SizedStorage {

    protected AbstractBankEntity [] entities;

    protected Storage(int size) {
        this.entities = new AbstractBankEntity[size];
    }

    //check storage size before adding some item to it
    public abstract void add(AbstractBankEntity entity);

    public abstract void remove(int id);

    public abstract AbstractBankEntity get(int id);
}
