package data.repository;

import data.entity.Catalog;

import java.util.List;

public interface CatalogRepository {
    List<Catalog> getAll();

    Catalog getItem(long id);

    Catalog addItem(Catalog catalog);

    Catalog updateItem(Catalog catalog);

    void deleteItem(long id);
}
