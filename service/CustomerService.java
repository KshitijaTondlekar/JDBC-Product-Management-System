package com.PMS.service;

import com.PMS.dao.CustomerDao;
import com.PMS.dto.CustomerDto;

public class CustomerService {
 CustomerDao cdao = new CustomerDao();
 
 public CustomerDto saveCustomer (CustomerDto customerdto) {
	 CustomerDto cdto = cdao.saveCustomer(customerdto);
	return cdto;
 }
 
 public void retrieveCustomer() {
	 cdao.retrieveCustomer();
 }
 
 public boolean updateCustomer(int id) {
	return cdao.updateCustomer(id);
	 
 }
 public boolean  deleteCustomer(int id) {
	return cdao.deleteCustomer(id);
	 
 }
 
 public CustomerDto selectCustomerById(CustomerDto customerdto) {
	 return cdao.selectCustomerById(customerdto);
 
}
}
