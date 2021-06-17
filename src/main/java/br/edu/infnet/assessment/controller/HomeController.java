package br.edu.infnet.assessment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {
    
    // Bem possível que eu esteja fazendo algo errado, qualquer coisa só mudar

    @GetMapping
    public String home() {
        return "home";
    }


}
