package com.mks.repository;

import java.util.List;

import com.mks.model.Customer;

public interface HibernateCustomerRepository {

	List<Customer> findAll();

}