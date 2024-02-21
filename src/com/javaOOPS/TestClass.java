package com.javaOOPS;

public class TestClass {

	public static void main(String[] args) 
	{
		
		//int value = 200;
		
		/*
		 * Product product1 = new Product();//Product type object/value
		 * System.out.println(product1.hashCode());
		 * 
		 * Product product2 = new Product();//Product type object/value
		 * System.out.println(product2.hashCode());
		 */
		Product product1 = new Product();//Product type object/value
		System.out.println(product1.getProductDetails());
		
		System.out.println("--------------------------------------------------------------------------");
		
		Product product2 = new Product();//Product type object/value
		System.out.println(product2.getProductDetails());
		
		System.out.println("===========================================================================");
		
		Product product11 = new Product(101, "xyz", 78.89);//Product type object/value
		System.out.println(product11.getProductDetails());
		
		System.out.println("--------------------------------------------------------------------------");
		
		Product product12 = new Product(103, "abc", 88.89);//Product type object/value
		System.out.println(product12.getProductDetails());

	}

}
