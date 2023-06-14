package ru.kovrizhkin.springlearn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.kovrizhkin.springlearn.dto.TableDimensionDto;
import ru.kovrizhkin.springlearn.service.TableDimensionService;

import java.util.List;

@RestController
@RequestMapping("/table/dimension")
public class TableDimensionController {

    private final TableDimensionService dimensionService;

    @Autowired
    public TableDimensionController(TableDimensionService dimensionService) {
        this.dimensionService = dimensionService;
    }

    @PostMapping("/add")
    public String addData(@RequestBody TableDimensionDto dto) {
        dimensionService.addData(dto);
        return "!!!Data successfully added!!!";
    }

    @GetMapping("/get/{id}")
    public TableDimensionDto getData(@PathVariable Long id) {
        return dimensionService.getData(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteData(@PathVariable Long id) {
        dimensionService.deleteData(id);
        return "!!!Data successfully deleted!!!";
    }

    @GetMapping("/getAll")
    public List<TableDimensionDto> getAllData() {
        return dimensionService.getAllData();
    }
}
