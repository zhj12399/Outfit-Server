package cn.zhj12399.outfit.service;

import cn.zhj12399.outfit.entity.Outfit;
import cn.zhj12399.outfit.entity.OutfitName;
import cn.zhj12399.outfit.mapper.OutfitMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OutfitServiceImp implements OutfitService {
    @Autowired
    OutfitMapper outfitMapper;

    @Override
    public void addOutfit(OutfitName outfitName) {
        String name = outfitName.getName();

    }

    @Override
    public Outfit getLastOutfitByName(String name) {
        return outfitMapper.getLastOutfit(name);
    }
}
