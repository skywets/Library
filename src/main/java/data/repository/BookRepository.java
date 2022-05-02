package data.repository;

import data.entity.Book;

import java.util.ArrayList;
import java.util.List;

public class BookRepository implements Repository<Book> {
    private List<Book> books = new ArrayList<>();

    public BookRepository(List<Book> books) {
        this.books = books;
    }

    public BookRepository() {
    }

    @Override
    public Book getItem(long id) {
        Book book = findUserById(id);
        return book;
    }

    private Book findUserById(long id) {
        Book book = books.stream().filter(b -> b.getId() == id).findFirst().orElseThrow();
        return book;
    }

    @Override
    public Book addItem(Book item) {
        books.add(new Book(item.getId(), item.getCatalogId(), item.getTitle(), item.getAuthor(), item.getTextBook(), item.getCountOfPages(), item.getPublishingDate(), item.isPopular(), item.isNewRelease(), item.getGenre()));
        return item;
    }

    @Override
    public Book updateItem(Book item) {
        Book book = findUserById(item.getId());
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




















