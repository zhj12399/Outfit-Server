package cn.zhj12399.outfit.service;

import cn.zhj12399.outfit.entity.People;

public interface PeopleService {
    String getPasswordByName(String name);
    void addPeople(People people);
}
