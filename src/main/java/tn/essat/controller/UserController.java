package tn.essat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import tn.essat.model.User;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/register")
    public String showRegistrationPage() {
        return "inscription_client"; // JSP à afficher
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute("user") User user) {
        // Sauvegarder l'utilisateur
        return "redirect:/home";
    }

    @GetMapping("/login")
    public String showLoginPage() {
        return "connexion";
    }
}
