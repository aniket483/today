package com.restaurant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.pojo.Review;
import com.restaurant.service.ReviewService;

@RestController
@RequestMapping("/review")
@CrossOrigin(origins = "*")
public class ReviewController {
	@Autowired
	ReviewService reviewService;
	@PostMapping("")
	public Review addReview(@RequestBody Review review) {
		return reviewService.addReview(review);
	}
	
	@GetMapping("")
	public List<Review> getAllReviews(){
		return reviewService.getAllReviews();
	}
}
