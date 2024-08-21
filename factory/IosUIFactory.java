package com.example.LLD.factory;

import com.example.LLD.factory.component.Button;
import com.example.LLD.factory.component.DropDown;
import com.example.LLD.factory.component.IosButton;

public class IosUIFactory implements UIFactory{

    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public DropDown createDropDown() {
        return null;
    }
}
