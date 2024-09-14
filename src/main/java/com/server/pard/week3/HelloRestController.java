package com.server.pard.week3;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
    @RequestMapping("/helloRest")
    public String helloRest() {
        return "Hello World";
    }
}
