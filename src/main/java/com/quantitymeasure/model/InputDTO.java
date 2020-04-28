package com.quantitymeasure.model;

import org.springframework.stereotype.Component;

@Component
public class InputDTO {
    private long inputValue;
    private Units unitType;

    public InputDTO() {
    }

    public InputDTO(long inputValue, Units unitType) {
        this.unitType = unitType;
        this.inputValue = inputValue;
    }

    public Units getUnitType() {
        return this.unitType;
    }

    public long getValue() {
        return this.inputValue;
    }

}
