package com.mindtree.ferrari.controller;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import com.mindtree.ferrari.entity.Orders;
import com.mindtree.ferrari.entity.Product;
import com.mindtree.ferrari.entity.Types;
import com.mindtree.ferrari.service.ProductService;


@EnableWebMvc
@RestController
@CrossOrigin(origins="*")
public class ProductController 
{
	@Autowired
	ProductService service;
	ArrayList<Product> products=new ArrayList<Product>();
	@RequestMapping(value="/men/catageory/{id}",method=RequestMethod.GET)
	public  ArrayList<Product> retriveMenProduct(@PathVariable("id") int id)
	{
		System.out.println("into controller");
		products=service.retriveMenProducts(id);
		System.out.println(products.size());
		return products;
		
	}
    @RequestMapping(value="/product/{id}",method=RequestMethod.GET)
	public ArrayList<Product> retriveMenProductById(@PathVariable("id") int id)
	{
		products=service.retriveProductById(id);
		return products;
	}
	@RequestMapping(value="/women/catageory/{id}",method=RequestMethod.GET)
	public ArrayList<Product> retriveWomenProduct(@PathVariable("id") int id)
	{
		products=service.retriveWomenProducts(id);
		return products;
	}
	@RequestMapping(value="/type/{name}",method=RequestMethod.GET)
	public ArrayList<Product> searchByType(@PathVariable("name") String name)
	{   
		ArrayList<Types> id=new ArrayList<Types>();
		id=service.retriveTypeId(name);
		Types t=new Types();
		t=id.get(0);
		int i=t.getType_id();
		products=service.retriveMenProducts(i);
		return products;
	}
	@RequestMapping(value = "/addtocart", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	    public boolean addToCart(@RequestBody Orders order) {
		int product_id=0;
		String email="";
		product_id=order.getProduct().getProduct_id();
		email=order.getEmail();
	    return service.addToCart(email, product_id);
	   }
	@RequestMapping(value = "/retrivecartitems/{email}/", method = RequestMethod.GET)
	public List<Product> retriveCartItems(@PathVariable("email") String email)
	  {
		return service.retriveCartItems(email);
	  }
	@RequestMapping(value="/updatequantity",method= RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public float updateQuantity(@RequestBody Orders order)
	{
		int quantity=0;
		String email="";
		int product_id=0;
		quantity=order.getQuantity();
		email=order.getEmail();
		product_id=order.getProduct().getProduct_id();
		return service.updateQuantity(quantity, email, product_id);
	}
	@RequestMapping(value="/deletecartitems",method= RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public void deleteCartItems(@RequestBody Orders order1){
		System.out.println("into the controller");
		int product_id=order1.getProduct().getProduct_id();
		String email=order1.getEmail();
		System.out.println(product_id);
		System.out.println("heloooo");
		service.deleteCartItems(product_id,email);
	}
	
}
