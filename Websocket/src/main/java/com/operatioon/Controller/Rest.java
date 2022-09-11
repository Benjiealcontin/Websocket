package com.operatioon.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rest {

    @GetMapping("/")
    public String homepage() {
		return "home";
    	
    }
}
