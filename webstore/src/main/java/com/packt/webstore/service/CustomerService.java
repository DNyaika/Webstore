package com.packt.webstore.service;

import com.packt.webstore.domain.Customer;

public interface CustomerService {
	public void saveCustomer(Customer customer);

	public Customer getCustomer(String customerId);

	public Boolean isCustomerExist(String customerId);

}
