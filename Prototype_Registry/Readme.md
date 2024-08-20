
Inside Registry we are storing prototype and getting object. From registry we age getting object creating copy of it and changing few attributes and using it.

If we want to force to provide implementation - will use interface and implement that interface , then our liability will be to implement that method which is there in the interface.

interface Prototype - clone() method.
->what will be the return type of this clone() method - if it in Student class it will return student object(if in IntelligentStudent class it will return IntelligentStudent object). so we can use generic datatype in interface like T.Return type is not fixed it will change.whatever we will provide in parameter
same will gets returned.

Now Student class will implement Prototype interface.
->what will be the return type of Prototype clone() method in Student class ? - it will return Student object.

Now Create one IntelligentStudent class which will implement interface Prototype and extends Student class, and here return type of Prototype would be (that means clone() method return now) - one concept - we don't have to implement Prototype interface as IntelligentStudent is child class so will override clone method and 
Student class is already implementing Prototype interface.

Code Flow :-

Student(Parent class) -> IntelligentStudent(Child Class)

Prototype(Interface) - having clone() method 


Code Explaination -
In IntelligentStudent, to set the parent attribute in Copy constructor we are calling super() constructor then setting the attribute which is defined in the child class.
public IntelligentStudent(IntelligentStudent student) {
        super(student);//to set the parent attribute will call the super constructor the parent class constructor
        //to set parent attribute calling parent constructor.Then setting the attribute which is defined
        //in the child class, which is iq.Then define getters and setters for iq if required.
        this.iq=student.iq;
    }

StudentRegistry class - having 2 method - one for register(put in map) method and other get() method to get based on the key.

//Now want to create prototype for August 22 i.e 100 different Object for August 22
	//One way is create all the object one by one manually 
	//Other way is we can use prototype design pattern.(How to do that lets do that in Client Class).
Client class -> to store Prototype create registry first using below code 
StudentRegistry studentregistry=new StudentRegistry();
then call fillRegistry() - 
set common attribute in Prototype now want to register this object in the registry for that we need Studentregistry object will pass in the method
then registry.register("aug22", aug22);

now magic in main method

//Student madhu=new Student();
		/*If we will create object manually in this way then we need to set batch and avgPsp manually,
		 * we cannot get the benefit of Prototype object
		 * 
		 */
		Student madhu=studentregistry.get("aug22").clone();//using key "aug22"
		//now we got the prototype object, so we should not change the things in prototype object rather clone it 
		// and do whatever want to do as its our object.once clone the object we can set attribute values.
		madhu.setName("Madhu");
		madhu.setAge(25);
		madhu.setStudentPsp(85.5);


Simmilary we can store multiple prototype.
//We can store multiple prototype. like we can store for IntelligentStudent.
		IntelligentStudent aug22intelligent=new IntelligentStudent();
		aug22intelligent.setBatch("Aug 22 Intermediate");
		aug22intelligent.setAverageBatchPsp(75.0);
		registry.register("augIntelligent", aug22intelligent);


