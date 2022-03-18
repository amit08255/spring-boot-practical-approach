package com.springboot.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;

@Controller
public class BlogController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView home() {
        HashMap<String, String> model = new HashMap<String, String>();
        ModelAndView modView = new ModelAndView("index.html");
        model.put("title", "How to Spring Boot 101");
        model.put("description", "This blog post will focus on introduction to Spring Boot.");
        model.put("image", "https://via.placeholder.com/800");
        modView.addObject("post", model);
        return modView;
    }

    @RequestMapping(value = "/archive", method = RequestMethod.GET)
    public ModelAndView archive() {
        return new ModelAndView("archive.html");
    }

    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public ModelAndView about() {
        return new ModelAndView("about.html");
    }

    @RequestMapping(value = "/contact", method = RequestMethod.GET)
    public ModelAndView contact() {
        return new ModelAndView("contact.html");
    }
}
