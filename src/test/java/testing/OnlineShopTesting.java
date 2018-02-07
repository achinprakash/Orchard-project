package testing;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import static org.junit.Assert.assertEquals;
import com.mindtree.ferrari.entity.Category;
import com.mindtree.ferrari.entity.Gender;
import com.mindtree.ferrari.entity.Product;
import com.mindtree.ferrari.entity.Types;
import com.mindtree.ferrari.service.ProductService;
import com.mindtree.ferrari.service.impl.ProductServiceImpl;

public class OnlineShopTesting 
{
	
	@Autowired
	ProductService service;
	Object[] expectedProducts = new Object[1];
	@Before
	    public void initInputs()
	       {
		     Types t=new Types();
		     t.setType_id(5);
		     t.setType_name("watches");
		     Category c=new Category();
		     c.setCategory_id(2);
		     c.setCategory_name("Accessories");
		     t.setC(c);
		     Gender g=new Gender();
		     g.setGender_id(1);
		     g.setGender_name("men");
	         expectedProducts[0] = new Product(1,"Ferrari FXX Watch","Inspired by the color and design of the high-performance prototype Ferrari FXX race car – known for its iconic nose and two large air intakes – the bold new FXX is a modern collection of sleekly sculpted timepieces with aerodynamic lines and bright team color accents.","black",123,"http://static.store.ferrari.com/media/catalog/product/cache/0/image/524x524/0dc2d03fe217f8c83829496872af24a0/0/8/0830222_1_.jpg",t,g,c);
	         System.out.println(expectedProducts[0]);
	        }
    
			 @Test
			  public void compareProducts(){
				     Object[] testOutput = service.retriveMenProducts(5).toArray(); 
				      assertEquals(expectedProducts, testOutput);
				    }
			 
}
