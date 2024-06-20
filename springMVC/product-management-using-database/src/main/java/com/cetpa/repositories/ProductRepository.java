package com.cetpa.repositories;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.cetpa.models.Product;

// it uses connection and holds data
@Repository
public class ProductRepository {

	private Session session;
	private Transaction transaction;
	 
	
	@Autowired
	public ProductRepository(SessionFactory sessionFactory) {
		session = sessionFactory.openSession();
		transaction = session.getTransaction();
	}

	 public void saveProduct(Product product) {
		 transaction.begin();
		session.save(product);
		transaction.commit();
	}

	public ArrayList<Product> getList() {
		Query<Product> query = session.createQuery("from Product",Product.class);
		return (ArrayList<Product>)query.list();
	}

	public Product getProduct(int id) {
		return session.get(Product.class, id);
	}

	public void deleteRecord(Product product) {
		 transaction.begin();
		session.delete(product);
		transaction.commit();
	}

}
