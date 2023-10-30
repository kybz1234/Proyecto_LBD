package com.lenguajes.proyecto.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping ("/home")
public class basicController {

    @GetMapping(path = "/test")
    public String saludar(){
        return "index";
    }

}