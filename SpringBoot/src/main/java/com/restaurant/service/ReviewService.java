package com.restaurant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurant.pojo.Review;
import com.restaurant.repo.ReviewRepo;

@Service
public class ReviewService {

	@Autowired
	ReviewRepo reviewRepo;
	public Review addReview(Review review) {
		return reviewRepo.save(review);
	}
	public List<Review> getAllReviews(){
		return reviewRepo.findAll();
	}
}
