package com.mks.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mks.model.Customer;
import com.mks.repository.HibernateCustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private HibernateCustomerRepository customerRepository;
	
	/* (non-Javadoc)
	 * @see com.mks.service.CustomerService#findAll()
	 */
	public List<Customer> findAll (){
		
		return customerRepository.findAll();
	}

}
