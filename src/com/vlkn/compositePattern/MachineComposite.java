package com.vlkn.compositePattern;

import lombok.Data;

import java.util.Iterator;
import java.util.List;

@Data
public class MachineComposite implements MachineComponent {
    private final List<MachineComponent> machineComponentList;



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
}
