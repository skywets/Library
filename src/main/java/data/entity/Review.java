package data.entity;

import java.time.LocalDate;

public class Review {
    private long userId;
    private long bookId;
    private String text;
    private LocalDate reviewDate;

    public Review(long userId, long bookId, String text, LocalDate reviewDate) {
        this.userId = userId;
        this.bookId = bookId;
        this.text = text;
        this.reviewDate = reviewDate;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDate getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(LocalDate reviewDate) {
        this.reviewDate = reviewDate;
    }
}
