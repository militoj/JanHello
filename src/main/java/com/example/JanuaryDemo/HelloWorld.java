package com.example.JanuaryDemo;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

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
               " <h1> Buy a new one you rich motherfucker </h1> " +
                       "<br> <img src=https://media0.giphy.com/media/DOb3rFL6d83Zu/giphy.gif?cid=3640f6095c310c4c5a722e306bf4d80c alt=\"This is an animated gif image, but it does not move\"/>\n" +
                      "<br> <br> <button type=button>Couch Store</button> "


        ;


    }




    // use link from
    //http://localhost:8080/fuckyocouchname?bitchname=Jemery
    @RequestMapping(value = "/fuckyocouchname")
    public String fuckyocouchname(@RequestParam("bitchname") String bitchname){
        return " <h1> Buy a new one " + bitchname + ", you rich motherfucker </h1> " +
                "<br> <img src=https://media0.giphy.com/media/DOb3rFL6d83Zu/giphy.gif?cid=3640f6095c310c4c5a722e306bf4d80c alt=\"This is an animated gif image, but it does not move\"/>\n" +
                "<br> <br> <button type=button>Couch Store</button> "
                ;

    }

    @PostMapping(value = "/fuckyocouchname/postcouch")
    public String fuckyocouchnamepost(@RequestParam("bitchname") String bitchname){
        return " <h1> Buy a new one " + bitchname + ", you rich motherfucker </h1> " +
                "<br> <img src=https://media0.giphy.com/media/DOb3rFL6d83Zu/giphy.gif?cid=3640f6095c310c4c5a722e306bf4d80c alt=\"This is an animated gif image, but it does not move\"/>\n" +
                "<br> <br> <button type=button>Couch Store</button> "
                ;

    }






}
