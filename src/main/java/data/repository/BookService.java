package data.repository;

import data.entity.Book;
import data.entity.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class BookService {

    User user = new User();
    Book book = new Book();
    Scanner scanner = new Scanner(System.in);
    public Book add() {
        user.setBooks(new ArrayList<>());
        book.setId(scanner.nextLong());
        book.setCatalogId(scanner.nextLong());
        book.setTitle(scanner.next());
        book.setAuthor(scanner.next());
        book.setTextBook(scanner.next());
        book.setCountOfPages(scanner.nextInt());
        book.setPublishingDate(LocalDate.parse(scanner.next()));
        user.getBooks().add(new Book(book.getId(), book.getCatalogId(),book.getTitle(), book.getAuthor(),
                book.getTextBook(), book.getCountOfPages(), book.getPublishingDate()));
        return book;
    }

    public Book getAll (long id) {
        if (book.getId() == id){
            for (Book b:user.getBooks())
                return b;
        }
        return null;
    }

    public void update(long id) {
        if (book.getId() == id){
            for (Book book: user.getBooks()) {
                book.setTitle(scanner.next());
                book.setAuthor(scanner.next());
                book.setTextBook(scanner.next());
                book.setCountOfPages(scanner.nextInt());
                book.setPublishingDate(LocalDate.parse(scanner.next()));
            }
        }
    }

    public void delete(long id) {
        if (book.getId() == id){
           user.getBooks().removeIf(b -> b.getId() == id);
            System.out.println("successfully delete");
        }else
            System.out.println("This id don't exists, try again!");
    }
}
