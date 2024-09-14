package com.server.pard.week3;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Objects;

@RestController
public class RequestParamController {

    @RequestMapping("v1")
    public String param1(@RequestParam("name") String myName,
                         @RequestParam("age") int myAge) {
        return "Request Param 1번: " + myName + ", 나이: " + myAge;
    }

    @RequestMapping("/v2")
    public String param2(@RequestParam String name, @RequestParam int age) {
        return "2번 Request param: " + name + ", 나이: " + age;
    }

    @RequestMapping("/v3")
    public String param3(String name, int age) {
        return "3번 parameter name : " + name + "나이 : " + age;
    }

    @RequestMapping("/v4")
    public String param4(@RequestParam String name,
                         @RequestParam(required = false) Integer age) {
        if(age == null) {
            return "4번 request param : " + name + "age : 입력값 없음";
        }
        return "4 request param : " + name + "age : " + age;
    }

    @RequestMapping("/v5")
    public String param5(@RequestParam(required = true, defaultValue = "파드") String name,
                         @RequestParam(required = false, defaultValue = "-1") Integer age) {
        return "Request Param 5 : " + name + "age : " + age;
    }

    @RequestMapping("/v6")
    public String param6(@RequestParam Map<String, Objects> map) {
        return "Request Param 6 : " + map.get("name") + map.get("age");
    }
}
