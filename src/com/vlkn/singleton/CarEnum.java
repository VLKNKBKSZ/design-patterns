package com.vlkn.singleton;

import lombok.Getter;
import lombok.Setter;

// Preferable if serialization is needed
public enum CarEnum {
    INSTANCE;
    @Setter
    @Getter
    private int value;
}
