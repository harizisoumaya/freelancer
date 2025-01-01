package tn.essat.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import tn.essat.model.Project;
import tn.essat.model.User;

@Controller
@RequestMapping("/client")
public class ClientController {

    @GetMapping("/register")
    public String showClientRegistrationPage(Model model) {
        model.addAttribute("client", new User()); // Le rôle sera "client"
        return "inscription_client";
    }

    @PostMapping("/register")
    public String registerClient(@ModelAttribute("client") User client) {
        client.setRole("client");
        // Sauvegarder le client
        return "redirect:/home";
    }

    @GetMapping("/projects")
    public String listClientProjects(Model model) {
        // Récupérer les projets pour le client connecté
        List<Project> projects = new ArrayList<>(); // Remplacer par DAO/service
        model.addAttribute("projects", projects);
        return "projets_clients"; // Page JSP pour afficher les projets du client
    }
}
