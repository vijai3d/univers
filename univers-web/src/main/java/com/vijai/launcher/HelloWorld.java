package com.vijai.launcher;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Victor on 21.03.2017.
 */
@RestController
public class HelloWorld {
    @RequestMapping("/hello")
    public String helloWorld() {

        return "<h1>Hello</h1>";
    }

}


