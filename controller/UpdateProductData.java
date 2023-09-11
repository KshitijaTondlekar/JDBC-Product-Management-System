package com.PMS.controller;

import com.PMS.service.ProductService;

public class UpdateProductData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductService productservice = new ProductService();
		productservice.updateProduct(1);

	}

}
