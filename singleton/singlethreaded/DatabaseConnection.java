public class DatabaseConnection {

    private static DatabaseConnection instance= null;
    //this part is called Early loading or early initialization.(below line of code)
    // private static DatabaseConnection instance = new DatabaseConnection(); -this line of code is for early loading 
//what we are doing in this line is instead of creating obj in if condition we are creating obj at time of initialization as it will load
//only one time of application start up/ compile time.	
    private DatabaseConnection() {

    }
    //If we will create private constructor we need to provide method getInstance method of
    //type static to create object if we will not create then this class is of no use.

    public static DatabaseConnection getInstance() {//making this method static as we don't have object of this method, so to call without 
	    //object.And this getInstance() method will provide object of class.
/**Inorder to create only 1 object and return the same objcet if already exists keeping this if condition.
	    **/
		if(instance==null)//Also static method cannot access non-static attribute so make it static in declaration.
		{
			instance = new DatabaseConnection();//creating instance else return instance(this statement will execute only one time)
		}
        return instance;
    }
}
