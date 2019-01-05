package com.example.JanuaryDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by johnmilito on 1/2/19.
 */



@RestController
public class HelloWorld {

    @Autowired

    TextWriter text;


    @RequestMapping("/")
    public String index() {
        return text.WriteText("hi Johnny");
    }
}
