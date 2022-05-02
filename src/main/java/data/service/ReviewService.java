package data.service;

import data.entity.Review;
import data.repository.ReviewRepository;

public class ReviewService {
    private ReviewRepository reviewRepository = new ReviewRepository();

    public Review getItem(long id) {
        return reviewRepository.getItem(id);
    }

    public void createUser(Review review) {
        reviewRepository.addItem(review);
    }

    public void editUser(long id, Review review) {
        review.setUserId(id);
        reviewRepository.updateItem(review);
    }

    public void deleteBook(long id) {
        reviewRepository.deleteItem(id);
    }
}
