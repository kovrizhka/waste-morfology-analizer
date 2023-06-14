package ru.kovrizhkin.springlearn.converter;

import org.springframework.stereotype.Component;
import ru.kovrizhkin.springlearn.dto.TableDimensionElementDto;
import ru.kovrizhkin.springlearn.entity.TableDimensionElement;

@Component
public class TableDimensionElementConverter {
    public TableDimensionElement toEntity(TableDimensionElementDto dto) {
        TableDimensionElement entity = new TableDimensionElement();
        entity.setVolume(dto.getVolume());
        entity.setWeight(dto.getWeight());
        return entity;
    }

    public TableDimensionElementDto toDto(Double weight, Double volume) {
        TableDimensionElementDto dto = new TableDimensionElementDto();
        dto.setWeight(weight);
        dto.setVolume(volume);
        return dto;
    }
}
