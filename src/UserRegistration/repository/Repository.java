package UserRegistration.repository;

public interface Repository<T> {
    public void delete(int id);

    public void save(Object user);

    public T get();

    public int getUserSize();
}
