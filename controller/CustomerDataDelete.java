package com.PMS.controller;

import com.PMS.service.CustomerService;

public class CustomerDataDelete {
	public static void main(String[] args) {
		CustomerService customerservice = new CustomerService();
		customerservice.deleteCustomer(3);	
		}

}
