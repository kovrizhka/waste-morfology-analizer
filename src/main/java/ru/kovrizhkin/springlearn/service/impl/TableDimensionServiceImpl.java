package ru.kovrizhkin.springlearn.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kovrizhkin.springlearn.converter.TableDimensionConverter;
import ru.kovrizhkin.springlearn.dto.TableDimensionDto;
import ru.kovrizhkin.springlearn.entity.TableDimension;
import ru.kovrizhkin.springlearn.repository.TableDimensionRepository;
import ru.kovrizhkin.springlearn.service.TableDimensionService;

import java.util.List;
import java.util.Optional;

@Service
public class TableDimensionServiceImpl implements TableDimensionService {
    private final TableDimensionConverter dimensionConverter;
    private final TableDimensionRepository dimensionRepository;

    @Autowired
    public TableDimensionServiceImpl(TableDimensionConverter dimensionConverter,
                                     TableDimensionRepository dimensionRepository) {
        this.dimensionConverter = dimensionConverter;
        this.dimensionRepository = dimensionRepository;
    }
    @Override
    public TableDimension addData(TableDimensionDto dto) {
        TableDimension entityForDataBase = dimensionConverter.toEntity(dto);
        dimensionRepository.save(entityForDataBase);
        return entityForDataBase;
    }

    @Override
    public TableDimensionDto getData(Long id) {
        Optional<TableDimension> entity = dimensionRepository.findById(id);
        TableDimension tableDimension = entity.orElse(null);
        return dimensionConverter.toDto(tableDimension);
    }

    @Override
    public void deleteData(Long id) {
        dimensionRepository.deleteById(id);
    }

    @Override
    public List<TableDimensionDto> getAllData() {
        List<TableDimension> allEntities = dimensionRepository.findAll();
        return dimensionConverter.toDtoList(allEntities);
    }


}
