package com.cetpa.product.repositories;

import java.util.List;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import com.cetpa.product.entities.Product;

//hibernate se kam karwana
public class ProductRepository {
	private Session session;
	private Transaction transaction;
	public ProductRepository(){
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		session = factory.openSession();
		transaction = session.getTransaction();
	}
	public void saveRecord(Product product) {
		transaction.begin();
		session.save(product);
		transaction.commit();
	}
	public Product getRecord(int pid) {
		// TODO Auto-generated method stub
		Product product = session.get(Product.class, pid);
		return product;
	}
	public void deleteRecord(Product product) {
		transaction.begin();
		session.delete(product);
		transaction.commit();
	}
	public List<Product> getRecordList() {
//		this is known as HQL
		 List<Product> products = session.createQuery("from Product", Product.class).list();
		return products;
	}

}
