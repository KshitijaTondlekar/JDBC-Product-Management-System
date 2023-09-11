package com.PMS.controller;

import com.PMS.dto.ProductDto;
import com.PMS.service.ProductService;

public class GetProductDataUsingId {
	public static void main(String[] args) {
		ProductDto productdto = new ProductDto();
		productdto.setId(1);
		ProductService productservice = new ProductService();
		productservice.selectProductById(productdto);
	}

}
