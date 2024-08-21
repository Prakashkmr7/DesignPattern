package com.example.LLD.factory;

public class Flutter {
    //Not a factory method as refreshing is similar in all.
    //If it will remain same for all type of entities then it will not a factory method.
    void refresh()
    {
        System.out.println("Refreshing...");
    }
    //Not a factory method as setting a theme is similar in all.
    void theme()
    {
        System.out.println("Setting a theme....");
    }

    //All of these below are factory method so may be we can create one interface UIFactory which should only
    // contain Factory method:-
    //Button createButton();
    //Menu createMenu();
    //Dropdown createDropdown();

    //A factory method is required to connect with the UIFactory.

//	Problem - bcz we are passsing String value may be it will have type bcz string will have any value.So always use enum
//	 to solve this issue
//	public UIFactory createUiFactory(String platform)
//	{
//		if(platform.equals("Android"))
//			return new AndroidUIFactory();
//		else if(platform.equals("Ios"))
//			return new IosUIFactory();
//		else
//		return null;
//	}
//	above code violets OCP

    //Above String Issue problem can be solved using enum9even if we will pass wrong input it will give compile type error
    //which will be much better than run time error.
    //This factory method id used to create an object of UIFactory. So avoid OCP let move this method to another class.Use enum
//	and in place of String value in parameter use enum value SupportedPlatform which we have created to sort out type error of
//	String.
    public UIFactory createUiFactory(SupportedPlatform platform)//what this method doing creating obj based on platform.
    {
        //just taking this code to UIFactoryFactory class like taking garbage to some seperate place
//		if(platform.equals(SupportedPlatform.ANDROID)) {//now if wrong value will be passed will get Compile time error and
        //Compile time error are much much better than run time error- which we were unable to handle in previous case.
//			return new AndroidUIFactory();
//			}
//		else if(platform.equals(SupportedPlatform.IOS)) {
//			return new IosUIFactory();
//			}
//		return null;
        return UIFactoryFactory.createUIFactory(platform);
    }
}
