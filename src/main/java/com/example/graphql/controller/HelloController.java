package com.example.graphql.controller;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class HelloController {

    @QueryMapping
    public String hello() {
        return "Hello, GraphQL!";
    }

    @QueryMapping
    public String hello2() {
        return "This is hello2 🎉";
    }

}