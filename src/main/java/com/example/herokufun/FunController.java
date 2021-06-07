package com.example.herokufun;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class FunController {

    @GetMapping("/fun/hello")
    @ResponseStatus(HttpStatus.OK)
    public String helloYourself(){
        return "Hello, Heroku";
    }
    @GetMapping("/fun/hi/{name}")
    @ResponseStatus(HttpStatus.OK)
    public String giveNameBack(@PathVariable String name){
        return "What's happening, " + name + "?";
    }
}
