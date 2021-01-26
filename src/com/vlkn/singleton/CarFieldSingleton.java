package com.vlkn.singleton;

//clearer to read and easy to understand.
public class CarFieldSingleton {

    private static final CarFieldSingleton INSTANCE = new CarFieldSingleton();

    private CarFieldSingleton(){
    }
}
