package com.vlkn.classAdapterPattern;

public class Car implements Driveable {

    public Car() {
    }

    @Override
    public void start() {
        System.out.println("STANDARD STARTING OF A CARR");
    }

    @Override
    public void stop() {
        System.out.println("STANDARD STOPPING OF A CAR");
    }
}
