package ru.kovrizhkin.springlearn.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.kovrizhkin.springlearn.dto.TableDimensionDto;
import ru.kovrizhkin.springlearn.entity.TableDimension;
import ru.kovrizhkin.springlearn.exception.TableDimensionNotExistException;

import java.util.ArrayList;
import java.util.List;

@Component
public class TableDimensionConverter {

    private final TableDimensionElementConverter elementConverter;

    @Autowired
    public TableDimensionConverter(TableDimensionElementConverter elementConverter) {
        this.elementConverter = elementConverter;
    }

    public TableDimension toEntity(TableDimensionDto dto) {
        TableDimension entity = new TableDimension();
        entity.setTotalWeight(dto.getTotalWeight());
        entity.setTotalVolume(dto.getTotalVolume());
        entity.setDistrict(dto.getDistrict());
        entity.setScrapWeight(dto.getScrap().getWeight());
        entity.setScrapVolume(dto.getScrap().getVolume());
        entity.setPaperWeight(dto.getPaper().getWeight());
        entity.setPaperVolume(dto.getPaper().getVolume());
        entity.setAlumA30Weight(dto.getAlumA30().getWeight());
        entity.setAlumA30Volume(dto.getAlumA30().getVolume());
        entity.setClearGlassWeight(dto.getClearGlass().getWeight());
        entity.setClearGlassVolume(dto.getClearGlass().getVolume());
        return entity;
    }

    public TableDimensionDto toDto(TableDimension entity) {
        if(entity == null) {
            throw new TableDimensionNotExistException("Not found data for this ID");
        }
        TableDimensionDto dto = new TableDimensionDto();
        dto.setTotalWeight(entity.getTotalWeight());
        dto.setTotalVolume(entity.getTotalVolume());
        dto.setDistrict(entity.getDistrict());
        dto.setScrap(elementConverter.toDto(entity.getScrapWeight(), entity.getScrapVolume()));
        dto.setPaper(elementConverter.toDto(entity.getPaperWeight(), entity.getPaperVolume()));
        dto.setAlumA30(elementConverter.toDto(entity.getAlumA30Weight(), entity.getAlumA30Volume()));
        dto.setClearGlass(elementConverter.toDto(entity.getClearGlassWeight(), entity.getClearGlassVolume()));
        return dto;
    }

    public List<TableDimensionDto> toDtoList(List<TableDimension> entityList) {
        List<TableDimensionDto> dtoList = new ArrayList<>();
        for(TableDimension dimension: entityList) {
            dtoList.add(toDto(dimension));
        }
        return dtoList;
    }
}
