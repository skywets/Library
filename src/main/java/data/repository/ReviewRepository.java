package data.repository;

import data.entity.Review;

import java.util.ArrayList;
import java.util.List;

public class ReviewRepository implements Repository<Review> {
    private final List<Review> reviews = new ArrayList<>();

    @Override
    public Review getItem(long id) {
        return findUserById(id);
    }

    private Review findUserById(long id) {
        return reviews.stream().filter(r -> r.getUserId() == id).findFirst().orElseThrow();
    }

    @Override
    public Review addItem(Review item) {
        reviews.add(new Review(item.getUserId(), item.getBookId(), item.getText(), item.getReviewDate()));
        return item;
    }

    @Override
    public Review updateItem(Review item) {
        Review review = findUserById(item.getUserId());
        review.setUserId(item.getUserId());
        review.setBookId(item.getBookId());
        review.setText(item.getText());
        review.setReviewDate(item.getReviewDate());
        return review;
    }

    @Override
    public void deleteItem(long id) {
        reviews.removeIf(r -> r.getUserId() == id);
    }
}
