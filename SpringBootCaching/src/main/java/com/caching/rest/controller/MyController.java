package com.caching.rest.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.caching.rest.service.MyService;
import com.caching.rest.service.Name;

@RestController
public class MyController 
{
	@Autowired
	MyService myService;
	
    @RequestMapping(value="/getallnames/", method=RequestMethod.GET)
    public Name listAllNames() {  	
        return myService.listAllNames();
    }
}
