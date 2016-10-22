package com.mks.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mks.model.Customer;
import com.mks.repository.CustomerRepository;
import com.mks.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	/* (non-Javadoc)
	 * @see com.mks.service.CustomerService#findAll()
	 */
	public List<Customer> findAll (){
		
		return customerRepository.findAll();
	}

}
