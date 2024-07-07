package com.cetpa.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import com.cetpa.entities.Customer;

public interface CustomerService extends JpaRepository<Customer,Integer>{

	void saveRecord(Customer customer);

	Page<Customer> getList(int pn);

	void deleteRecord(int cid);

	Customer getCustomer(int cid);

	List<Customer> getList2();

	List<Customer> findByName(String name);

}
