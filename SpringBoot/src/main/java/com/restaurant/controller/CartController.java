package com.restaurant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.exceptions.CartOperationException;
import com.restaurant.exceptions.ItemNotFoundException;
import com.restaurant.exceptions.UserNotFoundException;
import com.restaurant.pojo.CartItem;
import com.restaurant.pojo.FoodItem;
import com.restaurant.service.CartService;
import com.restaurant.service.FoodItemService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/cart")
public class CartController {
	@Autowired
	CartService cartService;
	@Autowired 
	FoodItemService foodItemService;
	@PostMapping("/add")
	public ResponseEntity<String> addItemToCart(@RequestParam("userId") Long userId,
			@RequestParam("foodItemId") Long foodItemId, @RequestParam("quantity") int quantity) {
		CartItem cartItem = new CartItem();
		cartItem.setQuantity(quantity);
		try {
			cartService.addItemToCart(userId, foodItemId, cartItem);
			return ResponseEntity.ok("Item added to cart successfully");
		} catch (ItemNotFoundException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Food item Not Found!");
		} catch (UserNotFoundException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND)
					.body("Oops, something went wrong! Please sign in again!");

		} catch (CartOperationException e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST)
					.body("Oops, something went wrong! Please add to cart again");
		}
	}

	@PutMapping("/update/{cartId}/{newQuantity}")
	public String updateCartItem(@PathVariable Long cartId,@PathVariable int newQuantity) {
		CartItem oldCartItem=cartService.getCartItemById(cartId);
		int differenceInQuantity = newQuantity-oldCartItem.getQuantity();
		System.out.println(differenceInQuantity);
		FoodItem food=oldCartItem.getFoodItem();
		food.setAvailableQuantity(food.getAvailableQuantity()-differenceInQuantity);
		foodItemService.editFoodItem(food);
		System.out.println(food.getAvailableQuantity());
		if(cartService.updateCartItem(cartId,newQuantity)!=null)
		return "done";
		return "0";
	}

	@GetMapping("/{userId}")
	public List<CartItem> getWholeCart(@PathVariable Long userId) {
		return cartService.getWholeCartByUserId(userId);
	}

	@DeleteMapping("/deleteFromCartOnly/{cartId}")
	public String deleteFromCart(@PathVariable Long cartId) {
		CartItem oldCartItem=cartService.getCartItemById(cartId);
		int quantityToBeRestored = oldCartItem.getQuantity();
		FoodItem food=oldCartItem.getFoodItem();
		food.setAvailableQuantity(food.getAvailableQuantity()+quantityToBeRestored);
		foodItemService.editFoodItem(food);
		cartService.deleteFromCart(cartId);
		return "done";
		
	}
	
	@DeleteMapping("/deleteCart/{userId}")
	public String deleteCartAfterPayment(@PathVariable Long userId) {
		cartService.deleteFromCartByUserId(userId);
		return "done";
		
	}
}
