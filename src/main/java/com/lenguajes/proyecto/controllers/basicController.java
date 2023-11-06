package com.lenguajes.proyecto.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping ("/")
public class basicController {

    @GetMapping(path = "/login")
    public String login(){
        return "index";
    }

    @GetMapping(path = "/registro")
    public String register(){
        return "registro";
    }

     @GetMapping(path = "/home")
    public String home(){
        return "home";
    }

    @GetMapping(path = "/tienda")
    public String shop(){
        return "tienda";
    }

        @GetMapping(path = "/acerca")
    public String about(){
        return "acerca";
    }

            @GetMapping(path = "/contacto")
    public String contact(){
        return "contacto";
    }

                @GetMapping(path = "/producto")
    public String item(){
        return "producto";
    }

}