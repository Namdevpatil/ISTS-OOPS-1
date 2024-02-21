package com.javaOOPS;

public class TestClass2 {

	public static void main(String[] args) 
	{

		Product product11 = new Product();
		
		product11.setProductId(220);
		System.out.println(product11.getProductId());
		
		System.out.println("--------------------------------------------------------------------------");
		
		Product.setManufacturingFirmName("XYZ Private Limited.");
		System.out.println(Product.getManufacturingFirmName());
		

	}

}
