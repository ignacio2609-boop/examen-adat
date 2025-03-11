package com.utad.examen_adat.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class ApiController {

    @RequestMapping("/demo")
    public String demo() {
        return "Demo";
    }
}
