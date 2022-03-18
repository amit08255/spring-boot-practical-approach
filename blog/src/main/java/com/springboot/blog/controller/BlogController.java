package com.springboot.blog.controller;

import com.springboot.blog.model.Blog;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class BlogController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView home() {
        Blog blog = new Blog();
        ModelAndView modView = new ModelAndView("index.html");
        modView.addObject("post", blog.getPostList());
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
