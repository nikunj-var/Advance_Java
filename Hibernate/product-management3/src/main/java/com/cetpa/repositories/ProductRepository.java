package com.cetpa.repositories;

import java.util.List;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import com.cetpa.entities.ProductEntity;

//repository class ka jab object bane to session or transaction class ka object ban jaye
public class ProductRepository {
	
	private static Session session;
	private static Transaction transaction;
	
	static {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		session = factory.openSession();
		transaction = session.getTransaction();
	}

	public static void saveRecord(ProductEntity p) {
		transaction.begin();
		session.save(p);
		transaction.commit();
	}

	public static List<ProductEntity> showRecord() {
		List<ProductEntity> query = session.createQuery("from ProductEntity",ProductEntity.class).list();
		return query;
	}

	public static ProductEntity getProduct(int id) {
		ProductEntity query = session.get(ProductEntity.class,id);
		return query;
	}

	public static void deleteRecord(ProductEntity p) {	
		transaction.begin();
		session.delete(p);
		transaction.commit();
	}
	
}
