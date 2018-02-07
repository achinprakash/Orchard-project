package com.mindtree.ferrari.service;

import java.util.ArrayList;
import java.util.List;

import com.mindtree.ferrari.entity.Product;
import com.mindtree.ferrari.entity.Types;

public interface ProductService 
{
 public ArrayList<Product> retriveMenProducts(int id);
 public ArrayList<Product> retriveProductById(int id);
 public ArrayList<Product> retriveWomenProducts(int id);
 public ArrayList<Types> retriveTypeId(String name);
 public ArrayList<Product> retriveBySearch(int id);
 public boolean addToCart(String email,int product_id);
 public List<Product> retriveCartItems(String email);
 public float updateQuantity(int quantity,String email, int product_id);
 public void deleteCartItems(int product_id,String email);
 }
