package data.service;

import data.entity.Catalog;
import data.repository.CatalogRepository;

public class CatalogService {
    private CatalogRepository cr = new CatalogRepository();

    public Catalog getItem(long id) {
        return cr.getItem(id);
    }

    public void createUser(Catalog catalog) {
        cr.addItem(catalog);
    }

    public void editUser(long id, Catalog catalog) {
        catalog.setId(id);
        cr.updateItem(catalog);
    }

    public void deleteBook(long id) {
        cr.deleteItem(id);
    }
}
