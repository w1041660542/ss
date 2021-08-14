package com.why.springsecurity.controller;

import javax.xml.namespace.QName;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

@RestController
@RequestMapping("/api")
public class TestController {

    @RequestMapping("/test")
    public String test() {
        return "test";
    }

    @Controller
    public class LoginController {

        @GetMapping(value = { "/login" })
        public ModelAndView toLogin() {
            System.out.println("33");
            return new ModelAndView("login");
        }
    }

}
