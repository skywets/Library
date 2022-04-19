package data.repository;

import data.entity.Book;
import data.entity.Catalog;
import data.entity.User;

import java.util.ArrayList;
import java.util.List;

public class CatalogRepositoryImpl implements CatalogRepository{
    List<Catalog> catalogs = new ArrayList<>();
    User user;
    Catalog c;
    @Override
    public List<Catalog> getAll() {
            catalogs.add((Catalog) user.getBooks());
        return catalogs;
    }

    @Override
    public Catalog getItem(long id) {
        return null;
    }

    @Override
    public Catalog addItem(Catalog catalog) {
        return null;
    }

    @Override
    public Catalog updateItem(Catalog catalog) {
        return null;
    }

    @Override
    public void deleteItem(long id) {

    }
}
