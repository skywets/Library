package data.repository;

import data.entity.Catalog;

import java.util.ArrayList;
import java.util.List;

public class CatalogRepository implements Repository<Catalog> {
    private List<Catalog> catalogs;
    @Override
    public Catalog getItem(long id) {
        for (Catalog catalog:catalogs) {
            if (catalog.getId() == id){
                return catalog;
            }
        }
        return null;
    }

    @Override
    public Catalog addItem(Catalog item) {
        catalogs = new ArrayList<>();
        catalogs.add(new Catalog(item.getId(), item.getProgramming(),
                item.getDetective(), item.getFantastic()));
        return item;
    }

    @Override
    public Catalog updateItem(Catalog item) {
        item.getId();
        item.getProgramming();
        item.getDetective();
        item.getFantastic();
        return item;
    }

    @Override
    public void deleteItem(long id) {
        catalogs.removeIf(c -> c.getId() == id);
    }
}
