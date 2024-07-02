package com.cetpa.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.cetpa.entities.Customer;

public interface CustomerService {

	void saveRecord(Customer customer);

	Page<Customer> getList(int pn);

	void deleteRecord(int cid);

	Customer getCustomer(int cid);

}
