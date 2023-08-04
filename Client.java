package Prototype;

import java.rmi.registry.Registry;

public class Client {
	private static void fillRegistry(StudentRegistry registry)
	{
		//In this method am just going to fill the registry.
		// We can do this in main method as well.
		
		//Student object for aug22 batch
		Student aug22=new Student();
		//In prototye we are going to set only the common attribute.
		aug22.setBatch("Aug 22 Intermediate");
		aug22.setAverageBatchPsp(75.0);
		
		
		//Now we want to register this object in the registry, for that we need studentregistry object.
		//for that we will pass that object in the fillRegistry() method itself
		registry.register("aug22", aug22);// key is "aug22" and value is aug22.
		//Now call this method in main method,automatically this value will be filled.
		
		
		
		
		//We can store multiple prototype.
		Intelligent aug22intelligent=new Intelligent();
		aug22intelligent.setBatch("Aug 22 Intermediate");
		aug22intelligent.setAverageBatchPsp(75.0);
		registry.register("augIntelligent", aug22intelligent);
		
		
		/*what if we have to create different batches as well? here we are only able to create one batch registery.
		 */
		Student sep22=new Student();
		sep22.setAverageBatchPsp(90.0);
		sep22.setBatch("Sep22 Intermediate");
		registry.register("sep22",sep22);
		
	}
	
	public static void main(String[] args) {
	//First of all- to create the prototype we need to create the Student registry first.
		
		StudentRegistry studentregistry=new StudentRegistry();
		fillRegistry(studentregistry);
		//Calling fillRegistry() and passing studentregistry object will fill the registry automatically
		
		//Student madhu=new Student();
		/*If we will create object manually in this way then we need to set batch and avgPsp manually,
		 * we cannot get the benefit of Prototype object
		 * 
		 */
		Student madhu=studentregistry.get("aug22").clone();
		//now we got the prototype object, so we should not change the things in prototype object rather clone it 
		// and do whatever want to do as its our object.	
		madhu.setName("Madhu");
		madhu.setAge(25);
		madhu.setStudentPsp(85.5);
		
		Student rahul=studentregistry.get("aug22").clone();
		rahul.setName("Rahul");
		rahul.setAge(26);
		rahul.setStudentPsp(95.5);
		
		Student amar=studentregistry.get("augIntelligent").clone();
		amar.setName("Amar");
		amar.setStudentPsp(96);
		amar.setAge(26);
		
		
		
		
		System.out.println("Debug");
		
		
	}

}
