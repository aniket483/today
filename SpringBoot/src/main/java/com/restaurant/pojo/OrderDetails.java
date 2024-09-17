package com.restaurant.pojo;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "orders")
public class OrderDetails {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long orderId;

  private String name;
  private String email;
  private String contact;
  private Double amount;
  private String address;
  private String city;
  private String state;
  private String zip;
  
  private Long userId;
  private String paymentMethod;
  private String paymentId;
  private LocalDate orderDate;
@Override
public String toString() {
	return "OrderDetails [orderId=" + orderId + ", name=" + name + ", email=" + email + ", contact=" + contact
			+ ", amount=" + amount + ", address=" + address + ", city=" + city + ", state=" + state + ", zip=" + zip
			+ ", userId=" + userId + ", paymentMethod=" + paymentMethod + ", paymentId=" + paymentId + ", orderDate="
			+ orderDate + "]";
}
public Long getOrderId() {
	return orderId;
}
public void setOrderId(Long orderId) {
	this.orderId = orderId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
}
public Double getAmount() {
	return amount;
}
public void setAmount(Double amount) {
	this.amount = amount;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getZip() {
	return zip;
}
public void setZip(String zip) {
	this.zip = zip;
}
public Long getUserId() {
	return userId;
}
public void setUserId(Long userId) {
	this.userId = userId;
}
public String getPaymentMethod() {
	return paymentMethod;
}
public void setPaymentMethod(String paymentMethod) {
	this.paymentMethod = paymentMethod;
}
public String getPaymentId() {
	return paymentId;
}
public void setPaymentId(String paymentId) {
	this.paymentId = paymentId;
}
public LocalDate getOrderDate() {
	return orderDate;
}
public void setOrderDate(LocalDate orderDate) {
	this.orderDate = orderDate;
}

}