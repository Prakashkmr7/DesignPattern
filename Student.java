package Prototype;

public class Student implements Prototype<Student>{
	
	private String name;
	private int age;
	private String batch;
	private double averageBatchPsp;
	private double studentPsp;
	
	public Student(Student st) {
		this.name=st.name;
		this.age=st.age;
		this.studentPsp=st.studentPsp;
		this.averageBatchPsp=st.averageBatchPsp;
		this.batch=st.batch;
	}
	
	public Student()
	{}
	
	
//these are private attribute so we cannot access the private attribute directly so need to create 
//	setters and getters for that.
//When we define our own constructor then default constructor will not be there we need to create specificly 
// if we want to create object.
	public Student clone()
	{
		return new Student(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBatch() {
		return batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}

	public double getAverageBatchPsp() {
		return averageBatchPsp;
	}

	public void setAverageBatchPsp(double averageBatchPsp) {
		this.averageBatchPsp = averageBatchPsp;
	}

	public double getStudentPsp() {
		return studentPsp;
	}

	public void setStudentPsp(double studentPsp) {
		this.studentPsp = studentPsp;
	}
}
