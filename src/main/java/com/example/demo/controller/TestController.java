package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;


@RestController

public class TestController {

    @RequestMapping(value ="/test",method = RequestMethod.GET)

    String getTest(){
        String a = "aaa";
        String b = "bbb";
        String c = "ccc";
        return "testtest";

    }

}

