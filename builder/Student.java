
package com.example.LLD.builder;


public class Student {

	private String name;
	private int age;
	private double psp;
	private String universityName;
	private String batch;
	private long id;
	private int gradYear;
	private String phoneNumber;

	public Student(Builder builder)//pass helper or builder Object
	 {
		//validation starts
		if (builder.getGradYear() > 2022)// GradYear is in Builder class
		{
			throw new IllegalArgumentException("grad year cannot be greater than 2022");
		}
		 //validation ends.
		this.name = builder.getName();
		this.age = builder.getAge();
		this.batch = builder.getBatch();
		this.gradYear = builder.getGradYear();
		//Ultimately this way we will be able to create Student Object.

	}

}
