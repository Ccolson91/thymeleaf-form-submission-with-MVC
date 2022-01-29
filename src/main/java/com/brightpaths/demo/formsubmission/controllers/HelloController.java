package com.brightpaths.demo.formsubmission.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "<h1>Hello Christian!</h1>";
    }

    @RequestMapping("/user_entry")
    public String userForm() {
        return "<form action=\"/greeting/user_greeting\" method=\"GET\">\n" +
                " First name:<br>\n" +
                " <input type=\"text\" name=\"firstName\">\n" + " <br>\n" +
                " Last name:<br>\n" +
                " <input type=\"text\" name=\"lastName\">\n" + "<br><br>\n" +
                " <input type=\"submit\" value=\"Submit\">\n" +
                "</form>";
    }

    @RequestMapping("/user_greeting")
    public String printUserGreeting(@RequestParam String firstName, @RequestParam String lastName) {
        return "Hello there " + firstName + " " + lastName;
    }

    @RequestMapping(value = "/orders/{id}", method = RequestMethod.GET)
    public String getOrder(@PathVariable String id) {
        return "Order ID: " + id;
    }

}
