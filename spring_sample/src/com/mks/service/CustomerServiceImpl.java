package com.mks.service;

import java.util.List;

import com.mks.model.Customer;
import com.mks.repository.HibernateCustomerRepository;
import com.mks.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {
	
	private HibernateCustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();
	
	/* (non-Javadoc)
	 * @see com.mks.service.CustomerService#findAll()
	 */
	public List<Customer> findAll (){
		
		return customerRepository.findAll();
	}

}
