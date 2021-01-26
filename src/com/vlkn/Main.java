package com.vlkn;

import com.vlkn.singleton.CarEnum;

public class Main {

    public static void main(String[] args) {

        CarEnum carEnum = CarEnum.INSTANCE;
        carEnum.setValue(1);
        System.out.println(carEnum.getValue());
        CarEnum carEnum1 = CarEnum.INSTANCE;
        System.out.println(carEnum.getValue());
        System.out.println(carEnum1.getValue());
    }
}
