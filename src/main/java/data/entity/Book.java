package data.entity;

import java.util.Date;
import java.util.List;

public class Book {
    private long id;
    private String title;
    private String author;
    private String textBook;
    private int countOfPages;
    private Date publishingDate;

    private List<User> users;
}
