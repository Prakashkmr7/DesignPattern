package com.example.LLD.prototype;

public class Student implements Prototype<Student> {

    private String name;
    private int age;
    private String batch;
    private double averageBatchPsp;
    private double studentPsp;
    //when we will create our own constructor in class then default constructor won't be available automatically
    // we need to define it as we need to create object via that.
   public Student() {
   }


    //We cannot access the private attribute outside the class so we need getters and setters.
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

    //Copy Constructor
    public Student(Student st) {
        this.name = st.name;
        this.age = st.age;
        this.batch = st.batch;
        this.averageBatchPsp = st.averageBatchPsp;
        this.studentPsp = st.studentPsp;
    }

    @Override
    public Student clone() {//in clone method will create copy
        return new Student(this);//simply call copy constructor in which will pass this current object/ pass
        // this or not its optional.Then we need to create copy Constructor for this which is done on top.
    }//return type of this method is not fixed that is why its given generic datatype in interface while
    // declaring - here return type is Student, in IntelligentStudent its IntelligentStudent.
    //this method is declared in prototype interface - we are providing method implementation here.
}
