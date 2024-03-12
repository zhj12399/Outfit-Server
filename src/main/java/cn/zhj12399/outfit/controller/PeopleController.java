package cn.zhj12399.outfit.controller;


import cn.zhj12399.outfit.entity.People;
import cn.zhj12399.outfit.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/people")
public class PeopleController {
    @Autowired
    private PeopleService peopleService;

    @RequestMapping(value = "add_people", method = RequestMethod.POST)
    public void addPeople(@RequestBody People people) {
        peopleService.addPeople(people);
    }

    @RequestMapping(value = "judge_password", method = RequestMethod.POST)
    public boolean judgePassword(String name, String password) {
        String peopleRightPassword = peopleService.getPasswordByName(name);
        return peopleRightPassword.equals(password);
    }
}
