package cn.zhj12399.outfit.mapper;

import cn.zhj12399.outfit.entity.People;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

@Component(value = "PeopleMapper")
public interface PeopleMapper {
    @Insert("insert into people(name, password) values(#{name},#{password})")
    void insertPeople(People people);

    @Select("select password from people where name=#{name}")
    String selectPassword(String name);

    @Update("create table if not exists outfit_${name}(" +
            " year int," +
            " month int," +
            " day int," +
            " t int,"+
            " up char(255),"+
            " down char(255),"+
            " shoes char(255),"+
            " hands char(255));")
    void addPeopleOutfitList(@Param("name") String name);
}
