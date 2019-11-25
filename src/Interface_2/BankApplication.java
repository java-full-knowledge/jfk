package Interface_2;

public class BankApplication {

    private Storage memoryStorage;

    public BankApplication() {
        this.memoryStorage = new MemoryAccountStorage(10);
    }


    public AbstractBankEntity findByName(String name) {
        for (int i = 0; i <= memoryStorage.currentStorageSize(); i++)
            if (memoryStorage.entities[i].name == name)
                return memoryStorage.entities[i];
        return null;
    }

    public AbstractBankEntity findById(int id) {
        for (int i = 0; i <= memoryStorage.currentStorageSize(); i++)
            if (memoryStorage.entities[i].id == id)
                return memoryStorage.entities[i];

        return null;
    }

    public void add(AbstractBankEntity entity) {
        memoryStorage.add(entity);
    }

    public void remove(AbstractBankEntity entity) {
        for (int i = 0; i <= memoryStorage.currentStorageSize(); i++)
            if (memoryStorage.entities[i].id == entity.id)
                memoryStorage.remove(entity.id);
    }

    public void remove(int id) {
        memoryStorage.remove(id);
    }
}
