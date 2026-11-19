package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

//outfitsテーブルとやり取りする
public interface OutfitRepository extends JpaRepository<Outfit, Integer> {
    List<Outfit>//天気が一致、気温でコーデ検索
    findByWeatherAndMinTemperatureLessThanEqualAndMaxTemperatureGreaterThanEqual
            (String weather, Integer minTemp, Integer maxTemp);
}
