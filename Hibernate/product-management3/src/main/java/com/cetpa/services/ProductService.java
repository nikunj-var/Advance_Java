package com.cetpa.services;

import java.util.List;

import com.cetpa.entities.ProductEntity;
import com.cetpa.repositories.ProductRepository;

public class ProductService {
	public static void saveRecord(ProductEntity p) {
		ProductRepository.saveRecord(p);
	}
	public static List<ProductEntity> showRecord() {
		return ProductRepository.showRecord();
	}
	public static ProductEntity getProduct(int id) {
		return ProductRepository.getProduct(id);
	}
	public static void deleteRecord(ProductEntity p) {
		 ProductRepository.deleteRecord(p);
	}
}
