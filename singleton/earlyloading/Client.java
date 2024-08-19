
public class Client {

    public static void main(String[] args) {
        DatabaseConnection dbc1 = DatabaseConnection.getInstance();
        System.out.println(dbc1);

        DatabaseConnection dbc2 = DatabaseConnection.getInstance();
        System.out.println(dbc2);

        //This will return same address (Example of singleton class.)Also this will work in single
        //threaded application not in multi-threaded application.

    }
}
