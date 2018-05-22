package com.example.recipes.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import com.example.recipes.commands.UnitOfMeasureCommand;
import com.example.recipes.domain.UnitOfMeasure;

@Component
public class UnitOfMeasureCommandToUnitOfMeasure implements Converter<UnitOfMeasureCommand, UnitOfMeasure>{

    @Nullable
    @Override
    public UnitOfMeasure convert(UnitOfMeasureCommand source) {
        if (source == null) {
            return null;
        }

        final UnitOfMeasure uom = new UnitOfMeasure();
        uom.setId(source.getId());
        uom.setDescription(source.getDescription());
        return uom;
    }
}
