package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/outfits")
@CrossOrigin(origins = "*")

public class OutfitController {

    private final OutfitService outfitService;

    public OutfitController(OutfitService outfitService) {
        this.outfitService = outfitService;
    }

    //服の検索
  @GetMapping
  public List<Outfit> getAllOutfits(
          @RequestParam(required = false) String weather,
          @RequestParam(required = false) Integer temperature ) {
        if (weather != null && temperature !=null) {
            return outfitService.searchOutfits(weather,temperature);
        }
        return outfitService.getAllOutfits();
  }

  //服の追加
  @PostMapping
    public Outfit createOutfit(@RequestBody Outfit outfit) {
        return  outfitService.saveOutfit(outfit);
  }

  //服の更新
@PutMapping("/{id}")
    public Outfit upDateOutfit(@PathVariable Integer id, @RequestBody Outfit outfit) {
        return outfitService.updateOutfit(id, outfit);
    }

    //服の削除
@DeleteMapping("{id}")
    public  void deleteOutfit(@PathVariable Integer id) {
        outfitService.deleteOutfit(id);
    }
}



