package com.example.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Tocka Ayman
 * @date 8/11/20
 */
@Controller
@RequestMapping("/vets")
public class VetController {

    @GetMapping({"", "/", "/index", "/index.html"})
    public String listVets() {
        return "vets/index";
    }
}
