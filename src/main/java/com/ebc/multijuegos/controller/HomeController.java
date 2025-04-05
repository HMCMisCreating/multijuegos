package com.ebc.multijuegos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/") // Define la raíz como ruta base
public class HomeController {

    @GetMapping
    public String home() {
        return "Perrito";
    }
}
