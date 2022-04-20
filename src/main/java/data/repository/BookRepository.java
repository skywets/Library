package data.repository;

import data.entity.Book;

import java.util.ArrayList;
import java.util.List;

public class BookRepository implements Repository<Book> {
    private List<Book> books;

    public BookRepository(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public Book getItem(long id) {
        for (Book b : books) {
            if (b.getId() == id) {
                return b;
            }
        }
        return null;
    }

    @Override
    public Book addItem(Book item) {
        books = new ArrayList<>();
        books.add(new Book(item.getId(), item.getCatalogId(), item.getTitle(),
                item.getAuthor(), item.getTextBook(), item.getCountOfPages(), item.getPublishingDate(), item.isPopular(),
                item.isNewRelease(), item.getGenre()));
        return item;
    }

    @Override
    public Book updateItem(Book item) {
        item.getId();
        item.getCatalogId();
        item.getTitle();
        item.getAuthor();
        item.getTextBook();
        item.getCountOfPages();
        item.getPublishingDate();
        item.isPopular();
        item.isNewRelease();
        item.getGenre();
        return item;
    }

    @Override
    public void deleteItem(long id) {
        books.removeIf(b -> b.getId() == id);
    }
}




















