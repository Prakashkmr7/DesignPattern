package com.example.LLD.factory;

public class UIFactoryFactory {

        public static UIFactory createUIFactory(SupportedPlatform platforms) {
            if (platforms.equals(SupportedPlatform.ANDROID)) {
                return new AndroidUIFactory();
            } else if (platforms.equals(SupportedPlatform.IOS)) {
                return new IosUIFactory();
            }
            return null;
        }
    }

