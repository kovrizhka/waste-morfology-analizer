package ru.kovrizhkin.springlearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kovrizhkin.springlearn.entity.TableDimension;

@Repository
public interface TableDimensionRepository extends JpaRepository<TableDimension, Long> {
}
