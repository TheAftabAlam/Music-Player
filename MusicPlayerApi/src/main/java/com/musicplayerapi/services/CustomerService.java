package com.musicplayerapi.services;

import com.musicplayerapi.entity.Customer;
import com.musicplayerapi.exceptions.CustomerException;

public interface CustomerService {
	
	
	public Customer createCustomer(Customer customer)throws CustomerException;
	
	public Customer updateCustomer(Customer customer,String key)throws CustomerException;

}
