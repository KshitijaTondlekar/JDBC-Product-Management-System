package com.PMS.controller;

import com.PMS.service.ProductService;

public class DeleteProductData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductService productservice = new ProductService();
		productservice.deleteProduct(3);

	}

}
