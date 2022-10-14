package com.Dockerdemo.demoDockerprac.Contoller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class Controller {
    @RequestMapping("/getData")
    public String getData() {
        return "Here is the data";
    }
}
