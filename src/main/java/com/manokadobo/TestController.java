package com.manokadobo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Christian on 2016-12-02.
 */
@RestController
public class TestController {
    @RequestMapping("hello/{username}")
    public User hello(@PathVariable(name="username") String name) {

        User user = createUser(name);
        return user;
    }

    private  User createUser(String name){
        User user = new User();
        user.name = name;
        user.id = 99;
        user.description = "example";

        return user;
    }
}
