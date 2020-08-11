package com.example.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Tocka Ayman
 * @date 8/11/20
 */
@Controller
public class IndexControlller {

    @GetMapping({"", "/", "index", "index.html"})
    public String index() {
        return "index";
    }
}
