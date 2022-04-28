package data.repository;

import data.entity.Book;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookRepository implements Repository<Book> {
    private List<Book> books = new ArrayList<>();

    public BookRepository(List<Book> books) {
        this.books = books;
    }

    public BookRepository() {
    }

    @Override
    public Optional<Book> getItem(long id) {
        books.add(new Book(1, 1, "t", "a", "tt", 11,
                LocalDate.now(), true, true, "gg"));
        Optional<Book> book = books.stream().filter(b -> b.getId() == id).findFirst();
        return book;
    }

    @Override
    public Book addItem(Book item) {
        books.add(new Book(item.getId(), item.getCatalogId(), item.getTitle(),
                item.getAuthor(), item.getTextBook(), item.getCountOfPages(),
                item.getPublishingDate(), item.isPopular(),
                item.isNewRelease(), item.getGenre()));
        return item;
    }

    @Override
    public Book updateItem(Book item) {
        Book book = books.stream().filter(b -> b.getId() == item.getId()).findFirst().orElseThrow();
        book.setId(item.getId());
        book.setCatalogId(item.getCatalogId());
        book.setTitle(item.getTitle());
        book.setAuthor(item.getAuthor());
        book.setTextBook(item.getTextBook());
        book.setCountOfPages(item.getCountOfPages());
        book.setPublishingDate(item.getPublishingDate());
        book.setPopular(item.isPopular());
        book.setNewRelease(item.isNewRelease());
        book.setGenre(item.getGenre());
        return book;
    }

    @Override
    public void deleteItem(long id) {
        books.removeIf(b -> b.getId() == id);
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

}




















