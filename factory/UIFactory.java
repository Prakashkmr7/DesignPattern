package com.example.LLD.factory;

import com.example.LLD.factory.component.Button;
import com.example.LLD.factory.component.DropDown;

public interface UIFactory {
//this should only contain the factory method.

    Button createButton();// Factory method ? Yes , as it will return object of corresponding button

    DropDown createDropDown();

}
