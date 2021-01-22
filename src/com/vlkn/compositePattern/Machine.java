package com.vlkn.compositePattern;

import lombok.Data;

@Data
public class Machine implements MachineComponent {
    @Override
    public int getMachineCount() {
        return 1;
    }
}
