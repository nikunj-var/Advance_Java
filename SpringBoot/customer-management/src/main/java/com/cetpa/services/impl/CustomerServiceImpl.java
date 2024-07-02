package com.cetpa.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;
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
	public Page<Customer> getList(int pn) {
		Pageable page = PageRequest.of(pn-1,3);
		Page<Customer> list = customerRepository.findAll(page);
		return list;
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
