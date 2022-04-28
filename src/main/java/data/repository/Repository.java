package data.repository;

import java.util.Optional;

public interface Repository<T> {

    Optional<T> getItem(long id);

    T addItem(T item);

    T updateItem(T item);

    void deleteItem(long id);
}
