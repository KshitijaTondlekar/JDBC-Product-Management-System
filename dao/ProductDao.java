package com.PMS.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.PMS.dto.CustomerDto;
import com.PMS.dto.ProductDto;
import com.productmangementsystem.configuration.HelperClass;


public class ProductDao {
	HelperClass helperClass=new HelperClass();
	Connection connection=null;
	int i=0;
	
	//to get data using Id
		public ProductDto selectProductById(ProductDto productdto) {
			connection = helperClass.getConnection();
			String sql = "SELECT * FROM product WHERE id=?";
			
			try {
				PreparedStatement preparedStatement=connection.prepareStatement(sql);
				preparedStatement.setInt(1, productdto.getId());
				ResultSet resultSet= preparedStatement.executeQuery();
				while(resultSet.next()) {
					System.out.println(resultSet.getInt(1));
					System.out.println(resultSet.getString(2));
					System.out.println(resultSet.getLong(3));
					System.out.println("==========================");
				}
				
			}
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					connection.close();
				}catch (SQLException e) {
					e.printStackTrace();
					
				}
			}
			return productdto;
			
		}
		
	//to retrieve data
public void retrieveProduct() {
		connection=helperClass.getConnection();
		
		String sql="SELECT * FROM product";
		try {
		//create statement
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		//execute statement
		ResultSet resultSet= preparedStatement.executeQuery();
		while(resultSet.next()) {
			System.out.println(resultSet.getInt(1));
			System.out.println(resultSet.getString(2));
			System.out.println(resultSet.getLong(3));
			System.out.println("==========================");
		}
		
			
			// execute statement
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			}catch (SQLException e) {
				e.printStackTrace();
				
			}
		}
	}
	
	//to update a product data
	public boolean updateProduct(int id) {
		connection=helperClass.getConnection();
		String sql="UPDATE product SET name ='XYZ' WHERE id=?";
		
		//create statement
		
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			
			//execute statement
			i=preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}if(i>0) {
			return true;
		}else {
			return false;
		}
		
	}
	
	// to delete a product data
	public boolean  deleteProduct(int id) {
		connection =helperClass.getConnection();
		String sql ="DELETE FROM product WHERE id=?";
		
		
		//create statement
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			
			preparedStatement.setInt(1, id);
			
			//execute statement
			i=preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
			connection.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		}if(i>0) {
			return true;
		}else {
			return false;
		}
	}
	
	//to save a student data
	public ProductDto saveProduct (ProductDto productdto) {
    connection=helperClass.getConnection();
		String sql="INSERT INTO product VALUES (?,?,?)";
		
		try {
		//create statement
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		//passed the values to delimiters/placeholder--->?
		
		preparedStatement.setInt(1,productdto.getId());
		preparedStatement.setString(2,productdto.getName());
		preparedStatement.setLong(3,productdto.getPrice());
		
		//execute statement
		preparedStatement.execute();
		
		
	}catch(SQLException e) {
		e.printStackTrace();
	}
		finally {
			try {
				//close connection
				connection.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return productdto;

	}
}


