package com.mks.repository;

import java.util.ArrayList;
import java.util.List;

import com.mks.model.Customer;

public class HibernateCustomerRepositoryImpl implements HibernateCustomerRepository {

	/* (non-Javadoc)
	 * @see com.mks.repository.HibernateCustomerRepository#findAll()
	 */
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();

		Customer customer = new Customer();

		customer.setFirstName("testFirstName");
		customer.setLastName("testLastName");

		customers.add(customer);

		return customers;
	}

}
