package com.mks.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.mks.model.Customer;

@Repository
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

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
