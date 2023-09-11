package com.PMS.service;
import com.PMS.dao.*;
import com.PMS.dto.ProductDto;

public class ProductService {
	ProductDao productdao=new ProductDao();
	
	public ProductDto saveProduct (ProductDto productdto) {
		ProductDto pdto = productdao.saveProduct(productdto);
		return pdto;
	}
	
	public void retrieveProduct() {
		productdao.retrieveProduct();
	}
	
	public boolean updateProduct(int id) {
		return productdao.updateProduct(id);
		
	}
	
	public boolean  deleteProduct(int id) {
		return productdao.deleteProduct(id);
		
	}
	public boolean  deleteCustomer(int id) {
		return productdao.deleteProduct(id);
		
	}
	public ProductDto selectProductById(ProductDto productdto) {
		return productdao.selectProductById(productdto);
		
	}
}
