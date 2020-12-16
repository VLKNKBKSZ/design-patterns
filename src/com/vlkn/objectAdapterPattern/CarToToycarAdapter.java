package com.vlkn.objectAdapterPattern;

public class CarToToycarAdapter implements ToyCar{

    private final Car car;

    public CarToToycarAdapter(Car car) {
        this.car = car;
    }

    @Override
    public void transformIntoRobot() {
        car.start();
    }
}
