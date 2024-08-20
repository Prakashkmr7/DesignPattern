package com.example.LLD.prototype;

public class IntelligentStudent extends Student{

    private int iq;
    //default constructor - for object creation
    public IntelligentStudent()
    {
    }
    //Copy Constructor
    public IntelligentStudent(IntelligentStudent student) {
        super(student);//to set the parent attribute will call the super constructor the parent class constructor
        //to set parent attribute calling parent constructor.Then setting the attribute which is defined
        //in the child class, which is iq.Then define getters and setters for iq if required.
        this.iq=student.iq;
    }

    /*No need to implements Prototype Interface as Intelligent is a child class of Student class,
     * we just have to override clone method.
     *
     */
    public IntelligentStudent clone() {
        return new IntelligentStudent(this);
        /*this is pointing to on which particular object we will call to
         * this will always refer to the current object on which we will call the clone()  method.
         * For ex- Student x=stud.clone();so ihe clone method this object, on the object which we are calling like stud.
         * this student object stud is referred by this keyword inside clone method inside the class.
         */

    }
    //defining getters/setters if required.
    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }
}
