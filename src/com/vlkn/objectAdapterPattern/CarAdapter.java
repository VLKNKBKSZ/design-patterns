package com.vlkn.objectAdapterPattern;

public class CarAdapter implements ToyCar{

    private final Car car;

    public CarAdapter(Car car) {
        this.car = car;
    }

    @Override
    public void transformIntoRobot() {
        car.start();
    }
}
