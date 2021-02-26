package com.codegym.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "city")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty(message = "Please input city name")
    @Size(max = 45)
    private String cityName;
    @NotEmpty(message = "Please input nation")
    @Size(max = 45)
    private String nation;
    @NotEmpty(message = "Please input acreage")
    private String acreage;
    @NotEmpty(message = "Please input GDP")
    private String gdp;
    @NotEmpty(message = "Please input description")
    private String description;

    public City(){
    }

    public City(long id,
                @NotEmpty(message = "Please input city name") String cityName,
                @NotEmpty(message = "Please input nation") String  nation,
                @NotEmpty(message = "Please input acreage") String acreage,
                @NotEmpty(message = "Please input GDP") String gdp,
                @NotEmpty(message = "Please input description") String description){
        this.id =id;
        this.cityName = cityName;
        this.nation = nation;
        this.acreage = acreage;
        this.gdp = gdp;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getAcreage() {
        return acreage;
    }

    public void setAcreage(String acreage) {
        this.acreage = acreage;
    }

    public String getGdp() {
        return gdp;
    }

    public void setGdp(String gdp) {
        this.gdp = gdp;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
