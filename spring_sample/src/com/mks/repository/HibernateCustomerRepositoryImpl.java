package com.mks.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.mks.model.Customer;

@Repository("hibernateCustomerRepository")
public class HibernateCustomerRepositoryImpl implements HibernateCustomerRepository {

	/* (non-Javadoc)
	 * @see com.mks.repository.HibernateCustomerRepository#findAll()
	 */
	
	@Value("${sampleProp}")
	private String samplePropValue;
	
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();

		Customer customer = new Customer();

		customer.setFirstName(samplePropValue);
		customer.setLastName("testLastName");

		customers.add(customer);

		return customers;
	}

}
