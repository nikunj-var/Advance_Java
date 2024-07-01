package com.cetpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cetpa.model.Product;
import com.cetpa.repository.ProductRepository;

@Service
public class ProductService 
{
	@Autowired
	private ProductRepository repo;

	public void saveRecord(Product pp) 
	{
		repo.saveProduct(pp);
	}
	public List<Product> getList() 
	{
		List<Product> list=repo.getProductList();
		return list;
	}
	public Product getRecord(int pid) 
	{
		return repo.getProduct(pid);
	}
	public Product deleteRecord(int pid)
	{
		return repo.deleteProduct(pid);
	}
	public void updateRecord(Product pp) 
	{
		repo.updateRecord(pp);
	}
	public List<Product> getListByBrand(String brand) 
	{
		return repo.getByBrand(brand);
	}
	public List<Product> getListByName(String name) 
	{
		return repo.getByName(name);
	}
}
