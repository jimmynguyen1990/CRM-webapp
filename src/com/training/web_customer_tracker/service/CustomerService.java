package com.training.web_customer_tracker.service;

import java.util.List;

import com.training.web_customer_tracker.entity.Customer;

public interface CustomerService {

	public List<Customer>getCustomers();
	public void saveCustomer(Customer newCustomer);
	public Customer getCustomer(int theId);
	public void deleteCustomer(int theId);
	public List<Customer> searchCustomers(String theName);
}
