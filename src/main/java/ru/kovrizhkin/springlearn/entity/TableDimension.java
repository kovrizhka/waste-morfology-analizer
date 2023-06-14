package ru.kovrizhkin.springlearn.entity;

import javax.persistence.*;

@Entity
@Table(name = "table_dimension")
public class TableDimension {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "total_weight")
    private double totalWeight;
    @Column(name = "total_volume")
    private double totalVolume;
    @Column
    private String district;

    @Column(name = "scrap_weight")
    private double scrapWeight;
    @Column(name = "scrap_volume")
    private double scrapVolume;
    @Column(name = "paper_weight")
    private double paperWeight;
    @Column(name = "paper_volume")
    private double paperVolume;
    @Column(name = "aluma30_weight")
    private double alumA30Weight;
    @Column(name = "aluma30_volume")
    private double alumA30Volume;
    @Column(name = "clearglass_weight")
    private double clearGlassWeight;
    @Column(name = "clearglass_volume")
    private double clearGlassVolume;




    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getScrapWeight() {
        return scrapWeight;
    }

    public void setScrapWeight(double scrapWeight) {
        this.scrapWeight = scrapWeight;
    }

    public double getScrapVolume() {
        return scrapVolume;
    }

    public void setScrapVolume(double scrapVolume) {
        this.scrapVolume = scrapVolume;
    }

    public double getPaperWeight() {
        return paperWeight;
    }

    public void setPaperWeight(double paperWeight) {
        this.paperWeight = paperWeight;
    }

    public double getPaperVolume() {
        return paperVolume;
    }

    public void setPaperVolume(double paperVolume) {
        this.paperVolume = paperVolume;
    }

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

    public double getAlumA30Weight() {
        return alumA30Weight;
    }

    public void setAlumA30Weight(double alumA30Weight) {
        this.alumA30Weight = alumA30Weight;
    }

    public double getAlumA30Volume() {
        return alumA30Volume;
    }

    public void setAlumA30Volume(double alumA30Volume) {
        this.alumA30Volume = alumA30Volume;
    }

    public double getClearGlassWeight() {
        return clearGlassWeight;
    }

    public void setClearGlassWeight(double clearGlassWeight) {
        this.clearGlassWeight = clearGlassWeight;
    }

    public double getClearGlassVolume() {
        return clearGlassVolume;
    }

    public void setClearGlassVolume(double clearGlassVolume) {
        this.clearGlassVolume = clearGlassVolume;
    }
}
