package com.PMS.controller;

import com.PMS.service.CustomerService;

public class CustomerDataUpdate {
	public static void main(String[] args) {
		CustomerService customerservice = new CustomerService();
		customerservice.updateCustomer(2);
	}

}
