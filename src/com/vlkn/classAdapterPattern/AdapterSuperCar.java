package com.vlkn.classAdapterPattern;

public class AdapterSuperCar extends Car {

    private SuperCar superCar;

    public AdapterSuperCar(SuperCar superCar) {
        this.superCar = superCar;
    }

    @Override
    public void starting() {
        superCar.iStart();
    }

    @Override
    public void stopping() {
        superCar.iStop();
    }
}
