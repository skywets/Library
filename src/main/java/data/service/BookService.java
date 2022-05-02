package data.service;

import data.entity.Book;
import data.repository.BookRepository;

public class BookService {
    private BookRepository br;

    public Book getItem(long id) {
        return br.getItem(id);
    }

    public void createBook(Book book) {
        br.addItem(book);
    }

    public void editBook(long id, Book book) {
        book.setId(id);
        br.updateItem(book);
    }

    public void deleteBook(long id) {
        br.deleteItem(id);
    }
}
