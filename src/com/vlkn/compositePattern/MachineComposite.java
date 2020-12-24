package com.vlkn.compositePattern;

import lombok.Data;

import java.util.List;

@Data
public class MachineComposite implements MachineComponent {

    private boolean isUp;
    private int owner;
    private String material;

    private List<MachineComponent> machineComponentList;

    public MachineComposite(List<MachineComponent> machineComponentList) {
        this.machineComponentList = machineComponentList;
    }

    @Override
    public int getMachineCount() {

        var count = 0;
        for (MachineComponent machineComponent : machineComponentList) {
            count += machineComponent.getMachineCount();
        }
        return count;
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
