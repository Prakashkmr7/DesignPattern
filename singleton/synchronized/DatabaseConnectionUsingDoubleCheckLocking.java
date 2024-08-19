public class DatabaseConnection {

    private static DatabaseConnection instance= null;


    private DatabaseConnection() {

    }
    //If we will create private constructor we need to provide method getInstance method of
    //type static to create object if we will not create then this class is of no use.

    public static DatabaseConnection getInstance() {
        //Double check locking
        if (instance == null)//First Check{
            synchronized (DatabaseConnection.class)//Applying class on class
            {
                if (instance == null)//2nd Check
                    instance = new DatabaseConnection();//Critical section of Code
            }
    }
        return instance;
    }
}
