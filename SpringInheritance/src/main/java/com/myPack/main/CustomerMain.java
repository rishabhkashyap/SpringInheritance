package com.myPack.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.myPack.cusstomer.Customers;

public class CustomerMain {
	public static void main(String[] args){
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Customers cust=(Customers) context.getBean("customerBean");
		System.out.println("Val = "+cust.getCountry());
		System.out.println("Val = "+cust.getType());
	}

}
