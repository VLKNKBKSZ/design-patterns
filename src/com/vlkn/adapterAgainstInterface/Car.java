package com.vlkn.adapterAgainstInterface;

public class Car implements Drivable {

    private final Drivable drivable;

    public Car(Drivable drivable) {
        this.drivable = drivable;
    }

    @Override
    public void start() {
        drivable.start();
    }

    @Override
    public void stop() {
        drivable.stop();
    }
}
