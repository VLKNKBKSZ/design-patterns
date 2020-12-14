package com.vlkn.objectAdapterPattern;

import jdk.swing.interop.SwingInterOpUtils;

public class Tesla implements Car {

    @Override
    public void start() {
        System.out.println("NO SOUND WHILE STARTING :D");
    }

    @Override
    public void stop() {
        System.out.println("ITS CHARGING THE BATTERY");
    }

    @Override
    public void drive() {
        System.out.println("AUTOMATIC DRIVE MODE 5?");
    }
}
