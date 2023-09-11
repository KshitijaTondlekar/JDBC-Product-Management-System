package com.PMS.controller;

import com.PMS.dto.ProductDto;
import com.PMS.service.ProductService;

public class ProductDataInsert {
	public static void main(String[] args) {
		ProductDto productdto=new ProductDto();
		productdto.setId(3);
		productdto.setName("Kshitija");
		productdto.setPrice(3000L);
		
		
		ProductService productservice = new ProductService();
		ProductDto pdto= productservice.saveProduct(productdto);
		if(pdto!=null) {
			System.out.println(pdto.getId()+"saved successfully");
		}
	}

}
