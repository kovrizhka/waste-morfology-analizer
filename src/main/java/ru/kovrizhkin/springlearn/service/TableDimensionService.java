package ru.kovrizhkin.springlearn.service;

import ru.kovrizhkin.springlearn.dto.TableDimensionDto;
import ru.kovrizhkin.springlearn.entity.TableDimension;

import java.util.List;

public interface TableDimensionService {
    TableDimension addData(TableDimensionDto dto);
    TableDimensionDto getData(Long id);
    void deleteData(Long id);
    List<TableDimensionDto> getAllData();
}
