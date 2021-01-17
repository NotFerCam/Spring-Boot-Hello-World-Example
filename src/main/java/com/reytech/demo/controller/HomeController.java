package com.reytech.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//Controladores
//Para manejar peticiones Web es necesario crear controladores, los cuales manejan la solicitud
//a partir de una ruta de acceso. Creamos la clase ControllerIndex en el paquete com.proyecto.controller. 
//Agregamos las anotaciones @Controller y @GetMapping, .....


@Controller
public class HomeController {

    @GetMapping("/")
    public String hello(){
        return "hello";
    }

    @GetMapping("/message")
    public String message(Model model) {
        model.addAttribute("message", "This is a custom message");
        return "message";
    }
}
