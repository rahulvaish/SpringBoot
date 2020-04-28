package com.springbootcc.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {

    @Value("${property.property1}")
    private String propprop1;


    @RequestMapping("/")
    public String welcome() {
        return "Config Client Application";
    }

    @RequestMapping(value="/hello/{name}",method= RequestMethod.GET,produces="application/json")
    @ResponseBody
    public ResponseEntity hello(@PathVariable(value="name")String name) {
        String str= "Config Client for "+name;

        if(name!=null) {
            return ResponseEntity.status(HttpStatus.OK).body(str);
        }else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

}
