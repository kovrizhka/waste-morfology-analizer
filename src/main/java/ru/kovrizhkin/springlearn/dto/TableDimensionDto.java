package ru.kovrizhkin.springlearn.dto;

public class TableDimensionDto {
    private double totalWeight;
    private double totalVolume;
    private String district;


    private TableDimensionElementDto scrap;
    private TableDimensionElementDto alumA30;
    private TableDimensionElementDto paper;
    private TableDimensionElementDto clearGlass;


    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(double totalWeight) {
        this.totalWeight = totalWeight;
    }

    public double getTotalVolume() {
        return totalVolume;
    }

    public void setTotalVolume(double totalVolume) {
        this.totalVolume = totalVolume;
    }

    public TableDimensionElementDto getScrap() {
        return scrap;
    }

    public void setScrap(TableDimensionElementDto scrap) {
        this.scrap = scrap;
    }

    public TableDimensionElementDto getAlumA30() {
        return alumA30;
    }

    public void setAlumA30(TableDimensionElementDto alumA30) {
        this.alumA30 = alumA30;
    }

    public TableDimensionElementDto getPaper() {
        return paper;
    }

    public void setPaper(TableDimensionElementDto paper) {
        this.paper = paper;
    }

    public TableDimensionElementDto getClearGlass() {
        return clearGlass;
    }

    public void setClearGlass(TableDimensionElementDto clearGlass) {
        this.clearGlass = clearGlass;
    }
}
