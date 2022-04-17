package data.entity;

import java.time.LocalDate;
import java.util.Date;

public class Book {
    private long id;
    private long catalogId;
    private String title;
    private String author;
    private String textBook;
    private int countOfPages;
    private LocalDate publishingDate;


    public Book(long id, long catalogId, String title, String author, String textBook, int countOfPages, LocalDate publishingDate) {
        this.id = id;
        this.catalogId = catalogId;
        this.title = title;
        this.author = author;
        this.textBook = textBook;
        this.countOfPages = countOfPages;
        this.publishingDate = publishingDate;
    }



    public Book() {
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(long catalogId) {
        this.catalogId = catalogId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTextBook() {
        return textBook;
    }

    public void setTextBook(String textBook) {
        this.textBook = textBook;
    }

    public int getCountOfPages() {
        return countOfPages;
    }

    public void setCountOfPages(int countOfPages) {
        this.countOfPages = countOfPages;
    }

    public LocalDate getPublishingDate() {
        return publishingDate;
    }

    public void setPublishingDate(LocalDate publishingDate) {
        this.publishingDate = publishingDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", textBook='" + textBook + '\'' +
                ", countOfPages=" + countOfPages +
                ", publishingDate=" + publishingDate +
                '}';
    }
}
