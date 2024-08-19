
public class DatabaseConnection {

    //private static DatabaseConnection instance= null;
    //this part is called Early loading or early initialization (below line)
    private static DatabaseConnection instance = new DatabaseConnection();

    private DatabaseConnection() {

    }
    //If we will create private constructor we need to provide method getInstance method of
    //type static to create object if we will not create then this class is of no use.

    public static DatabaseConnection getInstance() {

//In early loading - we will not create instance here will create at the time of initialization
//itself.


//        if(instance==null)
//        {
//            instance = new DatabaseConnection();//creating instance else return instance
//        }
        return instance;
    }
}
