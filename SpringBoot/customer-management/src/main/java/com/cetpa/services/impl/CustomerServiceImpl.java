package com.cetpa.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cetpa.entities.Customer;
import com.cetpa.repositories.CustomerRepository;
import com.cetpa.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired private CustomerRepository customerRepository;

	@Override
	public void saveRecord(Customer customer) {
		customerRepository.save(customer);
		
	}

	@Override
	public List<Customer> getList() {
		
		return customerRepository.findAll();
	}

	@Override
	public void deleteRecord(int cid) {
		
		 customerRepository.deleteById(cid);
	}

	@Override
	public Customer getCustomer(int cid) {
		return customerRepository.findById(cid).orElse(null);
	}
	

}
