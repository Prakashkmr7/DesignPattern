package com.example.LLD.factory;

import com.example.LLD.factory.component.AndroidButton;
import com.example.LLD.factory.component.AndroidDropDown;
import com.example.LLD.factory.component.Button;
import com.example.LLD.factory.component.DropDown;

public class AndroidUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public DropDown createDropDown() {
        return new AndroidDropDown();
    }
}
