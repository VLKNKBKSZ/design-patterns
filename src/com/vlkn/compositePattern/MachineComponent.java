package com.vlkn.compositePattern;

public interface MachineComponent {

    int getMachineCount();
    boolean isCompletelyUp();
    void stopAll();
    int getOwners();
    String getMaterial();
}
