package com.vlkn.compositePattern;

import lombok.Data;

import java.util.List;

@Data
public class MachineComposite implements MachineComponent {

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
        return false;
    }

    @Override
    public void stopAll() {

    }

    @Override
    public int getOwners() {
        return 0;
    }

    @Override
    public String getMaterial() {
        return null;
    }
}
