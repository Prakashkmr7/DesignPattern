package com.example.LLD.builder;

public class Client {

	/*Requirement of Builder pattern
	 * 1.) If a class has lot of attribute
	 * 2.)we have to validate the attribute before the object gets created.
	 */

	public static void main(String[] args) {
		//Here, First Builder Object will be created then using that Student Object.
		//Way 1
		Builder builder=new Builder();
//		Builder builder=Student.getBuilder();//Other way of creating object, it is slightly more readable
//		//getting Student object and from there we are creating Builder object
//		//then below we are setting attributes and creating Student Object
		builder.setName("Mohan");
		builder.setAge(25);
		builder.setBatch("2022");//we can not pass int value here it will give compile error as we have set compile time
		Student st=new Student(builder);//this will create student object successfully
		System.out.println("Debug");

	}

}
