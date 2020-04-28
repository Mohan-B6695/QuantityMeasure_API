package com.quantitymeasure.service;

import com.quantitymeasure.model.*;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UnitMapper {
    private Map<String, Units> unitMap;

    public UnitMapper() {
        this.unitMap = new HashMap<>();
        unitMap.put("feet", LengthsUnits.FEET);
        unitMap.put("inch", LengthsUnits.INCH);
        unitMap.put("yard", LengthsUnits.YARD);
        unitMap.put("centimeter", LengthsUnits.CENTIMETER);
        unitMap.put("gallon", VolumesUnits.GALLON);
        unitMap.put("liters", VolumesUnits.LITRES);
        unitMap.put("milliliters", VolumesUnits.MILLILITERS);
        unitMap.put("kilogram", WeightsUnits.KILOGRAMS);
        unitMap.put("grams", WeightsUnits.GRAMS);
        unitMap.put("tonnes", WeightsUnits.TONNES);
        unitMap.put("celsius", TemperatureUnit.CELSIUS);
        unitMap.put("fahrenheit", TemperatureUnit.FAHRENHEIT);
    }

    public Units get(String unitType) throws QuantityMeasurementException {
        if (unitMap.containsKey(unitType))
            return unitMap.get(unitType);
        throw new QuantityMeasurementException("please enter correct input type",
                QuantityMeasurementException.ExceptionType.INPUT_UNIT_NOT_AVAILABLE);
    }
}
