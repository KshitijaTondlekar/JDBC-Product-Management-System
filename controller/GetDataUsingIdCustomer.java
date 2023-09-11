package com.PMS.controller;

import com.PMS.dto.CustomerDto;
import com.PMS.service.CustomerService;

public class GetDataUsingIdCustomer {
	public static void main(String[] args) {
		CustomerDto customerDto = new CustomerDto();
		customerDto.setId(1);
		CustomerService customerservice = new CustomerService();
		customerservice.selectCustomerById(customerDto);
		
	}
	

}
