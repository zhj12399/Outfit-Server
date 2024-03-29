package cn.zhj12399.outfit.controller;

import cn.zhj12399.outfit.entity.Outfit;
import cn.zhj12399.outfit.entity.OutfitName;
import cn.zhj12399.outfit.service.OutfitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/outfit")
public class OutfitController {
    @Autowired
    OutfitService outfitService;

    @RequestMapping(value = "add_outfit", method = RequestMethod.POST)
    public void add_outfit(@RequestBody OutfitName outfitName) {
        outfitService.addOutfit(outfitName);
    }

    @RequestMapping(value = "get_last_outfit",method = RequestMethod.POST)
    public Outfit get_last_outfit(@RequestParam("name") String name) {
        return outfitService.getLastOutfitByName(name);
    }

    @RequestMapping(value = "get_all_outfit",method = RequestMethod.POST)
    public Outfit[] getOutfitsByName(@RequestParam("name") String name){
        return outfitService.getAllOutfitsByName(name);
    }
}
