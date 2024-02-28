package com.nestor.curso.springboot.webapp.springbootweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping({"", "/", "/home"})
    public String home() {

        return "redirect:/details";     // cambia la ruta url, reinicia el request y refresca el navegador
      //  return "forward:/details";      // se mantiene dentro de la misma petición http y no pierdes los parámetros que tienes dentro del request
    }
}
