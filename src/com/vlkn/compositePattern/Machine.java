package com.vlkn.compositePattern;

import lombok.Data;

@Data
public class Machine implements  MachineComponent{

    private boolean isUp;
    private int owner;
    private String material;

    @Override
    public int getMachineCount() {
        return 1;
    }


    @Override
    public boolean isCompletelyUp() {
        return false;
    }

    @Override
    public void stopAll() {

    }

    @Override
    public int getOwners() {
        return 1;
    }

    @Override
    public String getMaterial() {
        return material;
    }
}
