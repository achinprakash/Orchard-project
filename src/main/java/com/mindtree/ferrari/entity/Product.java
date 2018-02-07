package com.mindtree.ferrari.entity;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY) 
@Entity
@Table(name="product")
public class Product 
{
	@Id
	@Column(name="product_id")	
	private int product_id;
	@Column(name="product_name",nullable=false,length=25)
	private String product_name;
	@Column(name="product_description",nullable=false,length=50)
	private String product_description;
	@Column(name="color",nullable=false,length=15)
	private String color;
	@Column(name="price",nullable=false,length=10)
	private float price;
	@Column(name="product_image")
	private String product_image;
	
	public String getProduct_image() {
		return product_image;
	}
	public void setProduct_image(String product_image) {
		this.product_image = product_image;
	}
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="type_id",nullable=false)
	private Types type;
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="gender_id",nullable=false)
	private Gender gender;
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="category_id",nullable=false)
	private Category category;
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getProduct_description() {
		return product_description;
	}
	public void setProduct_description(String product_description) {
		this.product_description = product_description;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Types getType() {
		return type;
	}
	public void setType(Types type) {
		this.type = type;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Product [product_id=" + product_id + ", product_name=" + product_name + ", product_description="
				+ product_description + ", color=" + color + ", price=" + price + ", product_image=" + product_image
				+ ", type=" + type + ", gender=" + gender + ", category=" + category + "]";
	}
	public Product(int product_id, String product_name, String product_description, String color, float price,
			String product_image, Types type, Gender gender, Category category) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_description = product_description;
		this.color = color;
		this.price = price;
		this.product_image = product_image;
		this.type = type;
		this.gender = gender;
		this.category = category;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
}
