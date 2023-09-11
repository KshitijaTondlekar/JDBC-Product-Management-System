package com.PMS.controller;

import com.PMS.service.CustomerService;

public class CustomerDataRetrieve {
	public static void main(String[] args) {
		CustomerService customerservice = new CustomerService();
		customerservice.retrieveCustomer();
	}

}
