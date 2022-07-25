package org.mavenexample.practice;

import org.testng.annotations.Test;

public class parctice1Test {
	
	@Test
	public void parctice1() {
		String URL = System.getProperty("url");
		String browser = System.getProperty("browser");
		
		System.out.println("url-->"+URL+"brwser--->"+browser);
		String USERNAME = System.getProperty("username");
		String PASSWORD= System.getProperty("password");
		System.out.println("Test1-->class1");
		System.out.println("url-->"+URL);
		System.out.println("username-->"+USERNAME);
		System.out.println("password-->"+PASSWORD);
		//hi my name is siva and we siva_sushma are buddies  hi
	
	}
	@Test
	public void parctice2() {
		
		System.out.println("Test1-->class1");
		System.out.println("Good boy");
		System.out.println("Good boy and  bad boy");

		System.out.println("Good boy siva");
		System.out.println("bad boy siva and arun");
	
	}
	@Test
	public void parctice3() {
		System.out.println("Test1-->class1");
		//hi good afternoon
		System.out.println("hai shiva");
		//hai
	
	}
	
	

}
