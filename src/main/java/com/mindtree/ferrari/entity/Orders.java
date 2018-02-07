package com.mindtree.ferrari.entity;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY) 
@Entity
@Table(name="Orders")
public class Orders 
{
     @Id
	 @Column(name="order_id")
     @GeneratedValue(strategy=GenerationType.AUTO)
	 private int order_id;
	 @ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	 @JoinColumn(name="product_id")
	 private Product product;
	 @Column(name="quantity")
	 private int quantity;
	 @Column(name="email")
	 private String email;
	 @Column(name="purchased")
	 private String purchased;
	 public String getPurchased() {
		return purchased;
	}
	public void setPurchased(String purchased) {
		this.purchased = purchased;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getOrder_id() {
		return order_id;
	 }
	 public void setOrder_id(int order_id) 
	 {
		this.order_id = order_id;
	 }
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Orders [order_id=" + order_id + ", product=" + product + ", quantity=" + quantity + ", email=" + email
				+ "]";
	}
	 
	 
	

}
