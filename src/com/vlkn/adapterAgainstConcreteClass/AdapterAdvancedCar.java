package com.vlkn.adapterAgainstConcreteClass;

public class AdapterAdvancedCar extends Car {

    private final AdvancedCar advancedCar;

    public AdapterAdvancedCar(AdvancedCar advancedCar) {
        this.advancedCar = advancedCar;
    }

    @Override
    public void start() {
        advancedCar.advancedStart();
    }
}
