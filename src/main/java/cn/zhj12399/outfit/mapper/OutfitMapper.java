package cn.zhj12399.outfit.mapper;

import cn.zhj12399.outfit.entity.Outfit;
import cn.zhj12399.outfit.entity.OutfitName;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

@Component(value = "OutfitMapper")
public interface OutfitMapper {
    @Insert("insert into outfit_${name}(year, month, day, t, up, down, shoes, hands) values(#{year},#{month},#{day},#{t},#{up},#{down},#{shoes},#{hands})")
    void insertOutfit(OutfitName outfitname);

    @Select("select year, month, day, t, up, down, shoes, hands from outfit_${name} ORDER BY id DESC LIMIT 1")
    Outfit getLastOutfit(@Param("name") String name);
}
