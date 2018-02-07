package com.mindtree.ferrari.dao.impl;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.mindtree.ferrari.dao.ProductDAO;
import com.mindtree.ferrari.entity.Orders;
import com.mindtree.ferrari.entity.Product;
import com.mindtree.ferrari.entity.Types;

@Repository
@Transactional
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	private SessionFactory sessionFactory;

	ArrayList<Product> list = new ArrayList<Product>();

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	@SuppressWarnings("unchecked")
	public ArrayList<Product> retriveMenProductById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Product where gender_id=1 and type_id=" + id);
		list = (ArrayList<Product>) query.list();
		return list;
	}

	@SuppressWarnings("unchecked")
	public ArrayList<Product> retriveWomenProductById(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Product where gender_id=2 and type_id=" + id);
		list = (ArrayList<Product>) query.list();
		return list;
	}

	@SuppressWarnings("unchecked")
	public ArrayList<Types> retriveTypeId(String name) {
		Session session = this.sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Types where type_name='" + name + "'");
		ArrayList<Types> list = new ArrayList<Types>();
		list = (ArrayList<Types>) query.list();
		return list;
	}

	@SuppressWarnings("unchecked")
	public ArrayList<Product> retriveBySearch(int id) {

		 Session session = this.sessionFactory.getCurrentSession();
		 Query query = session.createQuery("from Product where type_id=" + id);
		 list = (ArrayList<Product>) query.list();
		 return list;
	}

	@SuppressWarnings("unchecked")
	public ArrayList<Product> retriveProductById(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		System.out.println("into daoimpl");
		Query query = session.createQuery("from Product where product_id=" + id);
		

		list = (ArrayList<Product>) query.list();
		return list;
	}

	 @SuppressWarnings("unchecked")
		public boolean insertOrder(String email, int product_id) {
	    	System.out.println(email +"  "+product_id);
	    	
	    		System.out.println("Try-with resources");
	    	Session session = this.sessionFactory.openSession();
	    	Transaction t = session.beginTransaction();
			Query query = session.createQuery("from Orders where email='" + email + "' and product_id=" + product_id);
			ArrayList<Orders> list = new ArrayList<Orders>();
			list = (ArrayList<Orders>) query.list();
	        if (list.size() == 0) {
				SQLQuery insertQuery = session.createSQLQuery("insert into Orders(quantity,email,product_id) values(?,?,?)");
				insertQuery.setParameter(0, 1);
				insertQuery.setParameter(1, email);
				insertQuery.setParameter(2, product_id);
				int result = insertQuery.executeUpdate();
				t.commit();
				session.close();
				System.out.println(result);
				if (result == 1) {
					return true;
				} else {
					return false;
				}

			} else
				return false;
		}
	@SuppressWarnings("unchecked")
	public List<Product> retriveCartItems(String email) {
		Session session = this.sessionFactory.getCurrentSession();
		String hql = "from Orders where email = :email and purchased= :variable";
		Query query = session.createQuery(hql);
		query.setParameter("email", email);
		query.setParameter("variable", "no");
		List<Orders> productIds = new ArrayList<Orders>();
		List<Product> finalProducts = new ArrayList<Product>();
		productIds = (List<Orders>) query.list();
		int size = productIds.size();
		int a[] = new int[size];
		for (int i = 0; i < size; i++) {
			a[i] = productIds.get(i).getProduct().getProduct_id();
		}
		for (int i = 0; i < size; i++) {
			Product product = session.get(Product.class,a[i]);
			finalProducts.add(i,product);
		}
		return finalProducts;
	}

	@SuppressWarnings("unchecked")
	public float updateQuantity(int quantity, String email, int product_id) {
		Session session = this.sessionFactory.getCurrentSession();
		String hql = "update Orders set quantity = :quantity where email =:email and product_id = :product_id";
		Query query = session.createQuery(hql);
		query.setParameter("quantity", quantity);
		query.setParameter("email", email);
		query.setParameter("product_id", product_id);
		query.executeUpdate();
		String hql1 = "from Orders where email = :email";
		Query query1 = session.createQuery(hql1);
		query1.setParameter("email", email);
		List<Orders> order = new ArrayList<Orders>();
		order = (List<Orders>) query1.list();
		int listSize = 0;
		listSize = order.size();
		float total=0;
		int a[]  = new int[listSize]; // stores all quantities.
		int b[]  = new int[listSize]; // stores all product id's.
		float c[] = new float[listSize]; // stores all prices of list.
		for (int i = 0; i < listSize; i++) {
			a[i] = order.get(i).getQuantity();
			b[i] = order.get(i).getProduct().getProduct_id();
		}
		List<Product> finalProducts = new ArrayList<Product>();
		for (int i = 0; i < listSize; i++) {
        Product product = session.get(Product.class, b[i]);
	    finalProducts.add(i,product);
         }
		for(int i=0; i<listSize; i++){
			c[i]=finalProducts.get(i).getPrice();
			total=total+(a[i]*c[i]);
		}
		return total;
      }
	public void deleteCartItems(int product_id, String email){
		System.out.println("into dao impl of online store");
		System.out.println(product_id);
		System.out.println(email);
		Session session = this.sessionFactory.getCurrentSession();
		String hql="delete from Orders where product_id = :product_id and email = :email";
		Query query = session.createQuery(hql);
		query.setParameter("product_id", product_id);
		query.setParameter("email",email);
		query.executeUpdate();
		
	}

}
