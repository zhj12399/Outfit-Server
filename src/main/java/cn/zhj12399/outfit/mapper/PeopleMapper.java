package cn.zhj12399.outfit.mapper;

import cn.zhj12399.outfit.entity.People;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

@Component(value = "peopleMapper")
public interface PeopleMapper {
    @Insert("insert into people(name, password) values(#{name},#{password})")
    void insertPeople(People people);

    @Select("select password from people where name=#{name}")
    String selectPassword(String name);
}
