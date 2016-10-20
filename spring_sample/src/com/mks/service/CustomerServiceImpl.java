package com.mks.service;

import java.util.List;

import com.mks.model.Customer;
import com.mks.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository;

	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	public List<Customer> findAll() {

		return customerRepository.findAll();
	}

}
