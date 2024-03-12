package cn.zhj12399.outfit.service;

import cn.zhj12399.outfit.entity.People;
import cn.zhj12399.outfit.mapper.PeopleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeopleServiceImp implements PeopleService {
    @Autowired
    private PeopleMapper peopleMapper;

    @Override
    public String getPasswordByName(String name) {
        return peopleMapper.selectPassword(name);
    }

    @Override
    public void addPeople(People people) {
        peopleMapper.insertPeople(people.getName(),people.getPassword());
    }

}
