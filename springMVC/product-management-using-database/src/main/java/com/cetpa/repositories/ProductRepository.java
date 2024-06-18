package com.cetpa.repositories;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import com.cetpa.models.Product;

// it uses connection and holds data
@Repository
public class ProductRepository {

	private Session session;
	private Transaction transaction;
	 DriverManagerDataSource
	
	@Autowired
	public ProductRepository(SessionFactory sessionFactory) {
		session = sessionFactory.openSession();
		transaction = session.getTransaction();
	}

	 public void saveProduct(Product product) {
		 System.out.println("product"+product);
//		productList.add(product);	
		System.out.println("product added");
	}

	public ArrayList<Product> getList() {
//		return productList;
		
	}

	public Product getProduct(int id) {
//		for(Product p : productList) {
//			if(p.getId() == id) {
//				return p;
//			}
//		}
//		return null;
	}

	public void deleteRecord(Product product) {
//		productList.remove(product);
	}

}
