package com.PMS.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.PMS.dto.CustomerDto;

import com.productmangementsystem.configuration.HelperClass;



public class CustomerDao {
	HelperClass helperClass=new HelperClass();
	Connection connection=null;
	int i=0;
	
	//to get data using Id
	public CustomerDto selectCustomerById(CustomerDto customerdto) {
		connection = helperClass.getConnection();
		String sql = "SELECT * FROM customer WHERE id=?";
		
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, customerdto.getId());
			ResultSet resultSet= preparedStatement.executeQuery();
			while(resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
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
		return customerdto;
		
	}
	
	//to retrieve customer data
public void retrieveCustomer() {
		connection=helperClass.getConnection();
		
		String sql="SELECT * FROM customer";
		try {
		//create statement
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		//execute statement
		ResultSet resultSet= preparedStatement.executeQuery();
		while(resultSet.next()) {
			System.out.println(resultSet.getInt(1));
			System.out.println(resultSet.getString(2));
			System.out.println(resultSet.getString(3));
			System.out.println("==========================");
		}
		
			
			
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
	
	//to update a customer data
	public boolean updateCustomer(int id) {
		connection=helperClass.getConnection();
		String sql="UPDATE customer SET name ='Kshitu' WHERE id=?";
		
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
	
	// to delete a customer data
	public boolean  deleteCustomer(int id) {
		connection =helperClass.getConnection();
		String sql ="DELETE FROM customer WHERE id=?";
		
		
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
	
	//to save a customer data
	public CustomerDto saveCustomer (CustomerDto customerdto) {
    connection=helperClass.getConnection();
		String sql="INSERT INTO customer VALUES (?,?,?)";
		
		try {
		//create statement
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		//passed the values to delimiters/placeholder--->?
		
		preparedStatement.setInt(1,customerdto.getId());
		preparedStatement.setString(2,customerdto.getName());
		preparedStatement.setString(3,customerdto.getEmail());
		
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
		return customerdto;

	}

}
