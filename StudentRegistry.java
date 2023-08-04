package Prototype;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
	private Map<String , Student> map=new HashMap<>();
	
	// It have 2 method register and get.

	//register will take two parameter - key and object.
	public void register(String key, Student student)
	{
		map.put(key, student);
	}
	//to return the Student object we have get method.
	public Student get(String key)
	{
		return map.get(key);
	}
	//Now want to create prototype for August 22 i.e 100 different Object for August 22
	//One way is create all the object one by one manually 
	//Other way is we can use prototype design pattern.(How to do that lets do that in Client Class).
	
}
