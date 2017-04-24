package com.aidb.giflib.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GifController {
    @RequestMapping("/")
    public String listGifs(){
        return "home";
    }

    @RequestMapping("/categories")
    public String categories(){
        return "categories";
    }

    @RequestMapping("/category")
    public String category(){
        return "category";
    }

    @RequestMapping("/favorites")
    public String favorites(){
        return "favorites";
    }

    @RequestMapping("/gif-details")
    public String gifDetails(){
        return "gif-details";
    }
}
