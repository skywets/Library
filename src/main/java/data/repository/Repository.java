package data.repository;

public interface Repository<T> {

    T getItem(long id);

    T addItem(T item);

    T updateItem(T item);

    void deleteItem(long id);
}
