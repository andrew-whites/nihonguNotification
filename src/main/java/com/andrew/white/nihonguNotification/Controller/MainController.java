package com.andrew.white.nihonguNotification.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/api")
public class MainController {

    @RequestMapping(method = RequestMethod.GET, value = "/helloWorld/{value}")
    @ResponseBody
    public ResponseEntity<String> helloWorld(@PathVariable String value){
        System.out.println(value);
        return ResponseEntity.ok("Hello " + value + "!");
    }
}
