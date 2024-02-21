package com.javaOOPS;

public class Product 
{
	
	//fields: part of class
	
	//non-static fields/variables: these variables are not declared with 'static' keyword.
	private int productId;
	private String productName;
	private double productPrice;
	
	//static fields/variables: these variables are declared with 'static' keyword.
	public static String manufacturingFirmName;

	//constructor: to initialize an object(variables/fields)
	public Product() //default constructor: no parameters
	{
		productId = 990;
		productName = "Wifi router";
		productPrice = 3500.55;
	}
	
	public Product(int productId, String productName, double productPrice) //default constructor: no parameters
	{
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	
	
	//non-static methods: able  to access all variables(static and non-static) fields
	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	//static methods: only static fields/variables
	public static String getManufacturingFirmName() {
		return manufacturingFirmName;
	}

	public static void setManufacturingFirmName(String manufacturingFirmName) {
		Product.manufacturingFirmName = manufacturingFirmName;
	}

	//method
	public String getProductDetails()
	{
		return "Product Id: "+productId+", "+"Product Name: "+productName+", "+"Product Price: "+productPrice;
	}
	
}
