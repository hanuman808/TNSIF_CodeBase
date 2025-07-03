package com.tnsf.daythree.constructor;

public class Customer {
	private String customerName;
	private int customerId;
	private String customeCity;
	
	
	
	public Customer() {
		System.out.println("Default constructor");
	}



	public Customer(String customerName, int customerId, String customeCity) {
		super();
		this.customerName = customerName;
		this.customerId = customerId;
		this.customeCity = customeCity;
	}

	public Customer(String customerName, int customerId) {
		super();
		this.customerName = customerName;
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}



	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}



	public int getCustomerId() {
		return customerId;
	}



	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}



	public String getCustomeCity() {
		return customeCity;
	}



	public void setCustomeCity(String customeCity) {
		this.customeCity = customeCity;
	}



	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerId=" + customerId + ", customeCity=" + customeCity
				+ "]";
	}



	
	
	

}
