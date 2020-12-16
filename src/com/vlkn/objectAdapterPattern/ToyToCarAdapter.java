package com.vlkn.objectAdapterPattern;

public class ToyToCarAdapter implements Car{

    private final ToyCar toyCar;

    public ToyToCarAdapter(ToyCar toyCar) {
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
