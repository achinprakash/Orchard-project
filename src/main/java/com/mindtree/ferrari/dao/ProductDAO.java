package com.mindtree.ferrari.dao;

import java.util.ArrayList;
import java.util.List;

import com.mindtree.ferrari.entity.Product;
import com.mindtree.ferrari.entity.Types;

public interface ProductDAO 
{
	public ArrayList<Product> retriveMenProductById(int id);
	public ArrayList<Product> retriveWomenProductById(int id);
	public ArrayList<Types> retriveTypeId(String name);
	public ArrayList<Product> retriveBySearch(int id);
	public ArrayList<Product> retriveProductById(int id);
	public boolean insertOrder(String email,int product_id);
	public List<Product> retriveCartItems(String email);
	public float updateQuantity(int quantity,String email, int product_id);
	public void deleteCartItems(int product_id ,String email);
}
