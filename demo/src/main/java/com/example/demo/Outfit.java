package com.example.demo;

import jakarta.persistence.*;

@Entity
@Table(name = "outfits")
public class Outfit {


    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer outfitId;

    private String outfitName;
    private String weather;
    private Integer minTemperature;
    private Integer maxTemperature;
    private String imageUrl;

    public Integer getOutfitId() { return outfitId; }
    public void setOutfitId(Integer outfitId)
    { this.outfitId = outfitId; }

    public String getOutfitName() { return outfitName; }
    public void setOutfitName(String outfitName)
    { this.outfitName = outfitName; }

    public String getWeather () { return weather; }
    public void  setWeather(String weather)
    { this.weather = weather; }

    public Integer getMinTemperature() { return  minTemperature; }
    public void setMinTemperature(Integer minTemperature)
    { this.minTemperature = minTemperature; }

    public Integer getMaxTemperature() { return  maxTemperature; }
    public void setMaxTemperature(Integer maxTemperature)
    { this.maxTemperature = maxTemperature; }

    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl)
    { this.imageUrl = imageUrl; }




}
