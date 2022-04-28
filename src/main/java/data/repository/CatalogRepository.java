package data.repository;

import data.entity.Catalog;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CatalogRepository implements Repository<Catalog> {
    private List<Catalog> catalogs = new ArrayList<>();

    @Override
    public Optional<Catalog> getItem(long id) {
        Optional<Catalog> catalog = catalogs.stream().filter(c -> c.getId() == id).findFirst();
        return catalog;
    }

    @Override
    public Catalog addItem(Catalog item) {
        catalogs.add(new Catalog(item.getId(), item.getName()));
        return item;
    }

    @Override
    public Catalog updateItem(Catalog item) {
        Catalog catalog = catalogs.stream().filter(c -> c.getId() == item.getId()).findFirst()
                .orElseThrow();
        catalog.setId(item.getId());
        catalog.setName(item.getName());
        return catalog;
    }

    @Override
    public void deleteItem(long id) {
        catalogs.removeIf(c -> c.getId() == id);
    }
}
