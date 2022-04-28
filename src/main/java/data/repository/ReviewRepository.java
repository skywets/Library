package data.repository;

import data.entity.Review;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ReviewRepository implements Repository<Review> {
    private List<Review> reviews = new ArrayList<>();

    @Override
    public Optional<Review> getItem(long id) {
        Optional<Review> review = reviews.stream().filter(r -> r.getUserId() == id)
                .findFirst();
        return review;
    }

    @Override
    public Review addItem(Review item) {
        reviews.add(new Review(item.getUserId(), item.getBookId(), item.getText(), item.getReviewDate()));
        return item;
    }

    @Override
    public Review updateItem(Review item) {
        Review review = reviews.stream().filter(r -> r.getUserId() == item.getUserId())
                .findFirst().orElseThrow();
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
