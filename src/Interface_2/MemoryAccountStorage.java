package Interface_2;

public class MemoryAccountStorage extends Storage {

    private static int count = 0;

    protected MemoryAccountStorage(int size) {
        super(size);
    }

    @Override
    public void add(AbstractBankEntity entity) {
        if (count == entities.length - 1) {
            AbstractBankEntity[] arr = new AbstractBankEntity[entities.length * 2];
            for (int i = 0; i < entities.length; i++)
                arr[i] = entities[i];
            entities = arr;
        }
        entities[count++] = entity;
    }

    @Override
    public void remove(int id) {
        if (entities.length == 0) {
            System.out.println("Empty!");
            return;
        }
        for (int i = 0; i <= count; i++)
            if (entities[i].id == id) {
                for (int j = i; j < count; j++)
                    entities[j] = entities[j + 1];
                count--;
                break;
            }

    }

    @Override
    public AbstractBankEntity get(int id) {
        for (int i = 0; i <= count; i++)
            if (entities[i].id == id)
                return entities[i];
            return null;
    }

    @Override
    public int currentStorageSize() {
        return count;
    }
}
