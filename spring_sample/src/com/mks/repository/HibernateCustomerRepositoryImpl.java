package com.mks.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.mks.model.Customer;

@Repository
public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	@Value("${samplePropName}")
	private String samplePropval;

	/* (non-Javadoc)
	 * @see com.mks.repository.HibernateCustomerRepository#findAll()
	 */
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();

		Customer customer = new Customer();

		customer.setFirstName(samplePropval);
		customer.setLastName("testLastName");

		customers.add(customer);

		return customers;
	}

}
