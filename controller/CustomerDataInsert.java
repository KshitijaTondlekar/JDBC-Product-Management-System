package com.PMS.controller;

import com.PMS.dto.CustomerDto;
import com.PMS.service.CustomerService;

public class CustomerDataInsert {
	public static void main(String[] args) {
		CustomerDto customerdto=new CustomerDto();
		customerdto.setId(2);
		customerdto.setName("Kshitija");
		customerdto.setEmail("kshitija@gmail.com");
		
		
		CustomerService customerservice = new CustomerService();
		CustomerDto cdto= customerservice.saveCustomer(customerdto);
		if(cdto!=null) {
			System.out.println(cdto.getId()+"saved successfully");
		}
	}

}
