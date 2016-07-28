package com.packt.webstore.domain.repository;

import com.packt.webstore.domain.Customer;

public interface CustomerRepositoy {

	public void saveCustomer(Customer customer);

	public Customer getCustomer(String customerId);

	public Boolean isCustomerExist(String customerId);

}
