package com.example.JanuaryDemo;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;

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


    @RequestMapping("/fuckyocouch")
    public String fuckyocouch() {
        return
               " <h1> butt </h1> ";


    }




}
