public class SingletonCollable implements Callable<DatabaseConnection>//Collable not Runnable as we want to ruturn object.
{
    //In this Runnable we want to create an Object nothing else.
    //So that multiple threads try to create object parallely.

    //The code which we want to execute on seperate thread goes inside run method.

    public DatabaseConnection call()//call() not run()
    {
        DatabaseConnection databaseConnection=DatabaseConnection.getInstance();


    }

}
