package com.employee.repositories;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.employee.model.Product;


@Repository
public class ProductRepository {

	private Map<Integer,Product> map = new HashMap<Integer,Product>();

	public void save(Product product) {
		map.put(product.getPid(),product);
		
	}

	public List<Product> list() {
		Collection<Product> c = map.values();
		ArrayList<Product> plist = new ArrayList<Product>(c);
		return plist;
	}
	
}
