package data.entity;

import java.util.Date;

public class Review {
    private long userId;
    private long bookId;
    private String text;
    private Date reviewDate;

    public Review(long userId, long bookId, String text, Date reviewDate) {
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

    public Date getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(Date reviewDate) {
        this.reviewDate = reviewDate;
    }
}
