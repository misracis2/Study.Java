package com.example.web_develop_master_package_part3.controller;

import com.example.web_develop_master_package_part3.dto.QueryParamRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class PracticeApiController {

    @GetMapping("/hello")
    public String getHello() {
        return "hello";
    }

    //RequestMapping은 모든 http method에 동작하기 때문에 method 키워드로 method를 지정해주어야한다
    @RequestMapping(path = "/hi", method = RequestMethod.GET)
    public String hi() {
        return "hi";
    }

    @GetMapping("/path-variable/{name}")
    public String pathVariable(@PathVariable String name) {
        return name;
    }

    @GetMapping("/param")
    public String queryParam(QueryParamRequest queryParamRequest) {

        return queryParamRequest.toString();
    }
}
