package com.vlkn.compositePattern;

import lombok.Data;


import java.util.Iterator;
import java.util.List;

@Data
public class MachineComposite implements MachineComponent {

    private final List<MachineComponent> machineComponentList;

    private boolean isUp;
    private int owner;
    private String material;;

    public MachineComposite(List<MachineComponent> machineComponentList) {
        this.machineComponentList = machineComponentList;
    }

    @Override
    public int getMachineCount() {

        int count = 0;

        Iterator i = machineComponentList.iterator();
        while(i.hasNext()) {
            MachineComponent machineComponent = (MachineComponent) i.next();
            count+=machineComponent.getMachineCount();
        }
        System.out.printf("COUNTER %s%n%n",count);
     return   count;
    }

    @Override
    public boolean isCompletelyUp() {

        boolean main = false;
        for(MachineComponent machineComponent : machineComponentList) {
            main=machineComponent.isCompletelyUp();
        }
        return main;
    }

    @Override
    public void stopAll() {

        for(MachineComponent machineComponent : machineComponentList) {
            stopMachine();
        }
    }

    @Override
    public int getOwners() {

        var owners = 0;

        for(MachineComponent machineComponent : machineComponentList) {
            owners+=machineComponent.getOwners();
        }

        return owners;
    }

    @Override
    public String getMaterial() {
        StringBuilder result = new StringBuilder();
        for(MachineComponent machineComponent : machineComponentList) {
            result.append(machineComponent.getMaterial());
        }
        return  result.toString();
    }

    private void stopMachine()
    {
        System.out.println("===MACHINE STOPPED===");

    }
}
