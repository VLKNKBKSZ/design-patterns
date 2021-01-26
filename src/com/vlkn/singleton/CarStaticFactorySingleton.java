package com.vlkn.singleton;

//More flexible, you could choose to make the constructor public or change imp of the
//factory method.
public class CarStaticFactorySingleton {

    private static final CarStaticFactorySingleton INSTANCE = new CarStaticFactorySingleton();

    private CarStaticFactorySingleton() {

    }

    public static CarStaticFactorySingleton getInstance() {
        return INSTANCE;
    }
}
