package com.mindtree.ferrari.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.ferrari.dao.ProductDAO;
import com.mindtree.ferrari.entity.Product;
import com.mindtree.ferrari.entity.Types;
import com.mindtree.ferrari.service.ProductService;


@Service
public class ProductServiceImpl implements ProductService
{
	@Autowired
	ProductDAO productdao;
	
	ArrayList<Product> products=new ArrayList<Product>();
	
	public ArrayList<Product> retriveMenProducts(int id)
	{
		products=productdao.retriveMenProductById(id);
		return products;
	}
	public ArrayList<Product> retriveWomenProducts(int id)
	{
		products=productdao.retriveWomenProductById(id);
		return products;
	}
	 public ArrayList<Types> retriveTypeId(String name)
	 {
	     ArrayList<Types> products=new ArrayList<Types>();
	     products=productdao.retriveTypeId(name);
		 return products;
	 }
	public ArrayList<Product> retriveBySearch(int id)
	{
		products=productdao.retriveBySearch(id);
		return products;
	}
	public ArrayList<Product> retriveProductById(int id) {
		products=productdao.retriveProductById(id);
		return products;
	}
	public boolean addToCart(String email,int product_id)
	{
	   return productdao.insertOrder(email, product_id);
	}
	public List<Product> retriveCartItems(String email)
	{
		return productdao.retriveCartItems(email);
	}
	public float updateQuantity(int quantity,String email, int product_id){
		return productdao.updateQuantity(quantity, email, product_id);
	}
	public void deleteCartItems(int product_id, String email){
		productdao.deleteCartItems(product_id,email);
	}

}
