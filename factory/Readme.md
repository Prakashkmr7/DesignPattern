Factory Design Pattern :

Whenever we are interacting with database table we are going to use Factory Design pattern.

We will have multiple factory which will be responsible for creating Query and Transaction for multiple factory. Like if MySqlfactory which will be responsibe for creating Query and transaction for MySQL.
If we are using MySqlDatabase which factory we should use- MySqlFactory - Based on the type of Database we should create an Object of Databasefactory


Code :

Client class(main class) - 
//If we want to use these code use android class.
//If we want to use flutter which object we need to create directly - will create Flutter
Flutter flutter =new Flutter();

From Flutter we need corresponding Factory to connect - we need a factory method to connect with UIFactory


Problem - bcz we are passsing String value may be it will have type bcz string will have any value.So always use enum
	 to solve this issue
	public UIFactory createUiFactory(String platform)
	{
		if(platform.equals("Android"))
			return new AndroidUIFactory();
		else if(platform.equals("Ios"))
			return new IosUIFactory();
		else
		return null;	
	}
	above code violets OCP

//Above String Issue problem can be solved using enum9even if we will pass wrong input it will give compile type error
	//which will be much better than run time error.
	//This factory method id used to create an object of UIFactory. So avoid OCP let move this method to another class.Use enum
//	and in place of String value in parameter use enum value SupportedPlatform which we have created to sort out type error of
//	String.


public UIFactory createUiFactory(SupportedPlatform platform)//what this method doing creating obj based on platform.
	{
		//just taking this code to UIFactoryFactory class like taking garbage to some seperate place
//		if(platform.equals(SupportedPlatform.ANDROID)) {//now if wrong value will be passed will get Compile time error and
		Compile time error are much much better than run time error- which we were unable to handle in previous case.
			return new AndroidUIFactory();
			}
		else if(platform.equals(SupportedPlatform.IOS)) {
			return new IosUIFactory();
			}
		return null;
		return UIFactoryFactory.createUIFactory(platform);
	}	
}
		

