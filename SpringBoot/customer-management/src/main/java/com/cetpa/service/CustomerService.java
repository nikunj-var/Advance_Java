package com.cetpa.service;

import java.util.List;

import com.cetpa.entities.Customer;

public interface CustomerService {

	void saveRecord(Customer customer);

	List<Customer> getList();

	void deleteRecord(int cid);

	Customer getCustomer(int cid);

}
