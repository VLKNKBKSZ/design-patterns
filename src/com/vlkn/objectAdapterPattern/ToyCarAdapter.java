package com.vlkn.objectAdapterPattern;

public class ToyCarAdapter implements Car{

    private final ToyCar toyCar;

    public ToyCarAdapter(ToyCar toyCar) {
        this.toyCar = toyCar;
    }

    @Override
    public void start() {
        toyCar.transformIntoRobot();
    }

    @Override
    public void stop() {
        toyCar.transformIntoRobot();
    }

    @Override
    public void drive() {
        toyCar.transformIntoRobot();
    }
}
