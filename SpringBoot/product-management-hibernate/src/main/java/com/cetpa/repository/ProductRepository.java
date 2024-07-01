package com.cetpa.repository;

import java.util.*;
import java.util.stream.Collectors;

import org.hibernate.*;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cetpa.model.Product;

@Repository
public class ProductRepository 
{
	private Session ses;
	private Transaction t;
	
	@Autowired
	public ProductRepository(SessionFactory factory)
	{
		ses=factory.openSession();
		t=ses.getTransaction();
	}
	public void saveProduct(Product pp) 
	{
		t.begin();
		ses.save(pp);
		t.commit();
	}
	public List<Product> getProductList() 
	{
		Query<Product> q=ses.createQuery("from Product");
		List<Product> plist=q.list();
		return plist;
	}
	public Product getProduct(int pid) 
	{
		Product p=ses.get(Product.class,pid);
		return p;
	}
	public Product deleteProduct(int pid) 
	{
		Product p=ses.get(Product.class,pid);
		if(p!=null)
		{
			t.begin();
			ses.delete(p);
			t.commit();
		}
		return p;
	}
	public void updateRecord(Product pp) 
	{
		Product p=ses.get(Product.class,pp.getPid());
		t.begin();
		p.setName(pp.getName());
		p.setBrand(pp.getBrand());
		p.setQuantity(pp.getQuantity());
		p.setPrice(pp.getPrice());
		t.commit();
	}
	public List<Product> getByBrand(String brand) 
	{
		Query<Product> q=ses.createQuery("from Product where brand=:br");
		q.setParameter("br",brand);
		List<Product> plist=q.list();
		return plist;
	}
	public List<Product> getByName(String name)
	{
		Query<Product> q=ses.createQuery("from Product where name=:na");
		q.setParameter("na",name);
		List<Product> plist=q.list();
		return plist;
	}
}
