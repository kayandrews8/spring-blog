package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/posts")
public class PostController {

    @GetMapping
    @ResponseBody
    public String postsIndex(){
        return "This will be the posts index page";
    }

    @GetMapping("/{id}")
    @ResponseBody
    public String postView(long id){
        return "This will be the view for viewing an individual post";
    }

    @GetMapping("/create")
    @ResponseBody
    public String createAPost(){
        return "This will be the view for the form to create a post";
    }

    @PostMapping("/create")
    @ResponseBody
    public String createANewPost(){
        return "This will be the view for creating a new post";
    }

}
