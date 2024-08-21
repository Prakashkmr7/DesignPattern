package com.example.LLD.factory;

import com.example.LLD.factory.component.Button;
import com.example.LLD.factory.component.DropDown;

public class Client {

    public static void main(String[] args) {
        //If we want to use these code use android class.
        //If we want to use flutter which object we need to create directly - will create Flutter
        Flutter flutter =new Flutter();

        //From Flutter we want to create UIFactory
        UIFactory uiFactory=flutter.createUiFactory(SupportedPlatform.ANDROID);/*if we will pass wrong value here it will give compile time error
		//reference is of type UI Factory but object is androidFactory in this */
        //	uiFactory.createButton();
        Button button=uiFactory.createButton();
        DropDown dropDown=uiFactory.createDropDown();

        button.printButton();
        dropDown.showDropDown();

        System.out.println("DEBUG...");

        //If we want to change from ANDROID to IOS just change enum SupportedPlatform.IOS

    }

}
