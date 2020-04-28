package com.quantitymeasure.service;

public class QuantityMeasurementException extends Exception {

    ExceptionType type;

    enum ExceptionType {
        TYPES_NOT_EQUAL, INPUT_UNIT_NOT_AVAILABLE, CANNOT_ADD_TEMPERATURE;
    }

    public QuantityMeasurementException(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }
}
