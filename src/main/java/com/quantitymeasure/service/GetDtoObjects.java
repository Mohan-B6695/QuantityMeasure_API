package com.quantitymeasure.service;

import com.quantitymeasure.model.InputDTO;
import com.quantitymeasure.model.ResultDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetDtoObjects {

    @Autowired
    UnitMapper mapper;

    public InputDTO createInputDtoObject(long measurementUnitValue, String measurementQuantityType) {
        try {
            return new InputDTO(measurementUnitValue, mapper.get(measurementQuantityType));
        } catch (QuantityMeasurementException e) {
            return null;
        }
    }

    public ResultDTO createComparisonOutputDtoObject(long measurementUnitValue, long measurementUnitValue1, Boolean isEquals) {
        return new ResultDTO(measurementUnitValue, measurementUnitValue1, isEquals);
    }

    public ResultDTO createAdditionOutputDtoObject(long measurementUnitValue1, long measurementUnitValue2, double output, String unit) {
        return new ResultDTO(measurementUnitValue1, measurementUnitValue2, output, unit);
    }
}
