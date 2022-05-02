package data.repository;

import data.entity.Catalog;

import java.util.ArrayList;
import java.util.List;

public class CatalogRepository implements Repository<Catalog> {
    private List<Catalog> catalogs = new ArrayList<>();

    @Override
    public Catalog getItem(long id) {
        Catalog catalog = findUserById(id);
        return catalog;
    }

    private Catalog findUserById(long id) {
        Catalog catalog = catalogs.stream().filter(c -> c.getId() == id)
                .findFirst()
                .orElseThrow();
        return catalog;
    }

    @Override
    public Catalog addItem(Catalog item) {
        catalogs.add(new Catalog(item.getId(), item.getName()));
        return item;
    }

    @Override
    public Catalog updateItem(Catalog item) {
        Catalog catalog = findUserById(item.getId());
        catalog.setId(item.getId());
        catalog.setName(item.getName());
        return catalog;
    }

    @Override
    public void deleteItem(long id) {
        catalogs.removeIf(c -> c.getId() == id);
    }
}
