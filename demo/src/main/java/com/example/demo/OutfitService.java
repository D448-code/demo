package com.example.demo;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OutfitService {
    private final OutfitRepository outfitRepository;

    public OutfitService(OutfitRepository outfitRepository) {
        this.outfitRepository = outfitRepository;
    }

    public List<Outfit> getAllOutfits() {
        return outfitRepository.findAll();
    }

    public List<Outfit> searchOutfits(String weather, Integer temperature) {
        return outfitRepository.
                findByWeatherAndMinTemperatureLessThanEqualAndMaxTemperatureGreaterThanEqual
                (weather, temperature, temperature);
    }

    public Outfit saveOutfit(Outfit outfit) {
        return outfitRepository.save(outfit);
    }

    public Outfit updateOutfit(Integer id, Outfit outfit) {
        outfit.setOutfitId(id);
        return outfitRepository.save(outfit);
    }

    public void deleteOutfit(Integer id) {
        outfitRepository.deleteById(id);
    }
}
