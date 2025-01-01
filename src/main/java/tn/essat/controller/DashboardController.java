package tn.essat.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dashboard")
public class DashboardController {

    @GetMapping("/freelancer")
    public String showFreelancerDashboard(Model model) {
        // Ajouter les données spécifiques au freelance connecté
        model.addAttribute("projects", new ArrayList<>()); // Projets actuels
        model.addAttribute("messages", new ArrayList<>()); // Messages récents
        return "freelancer_dashboard"; // Page JSP du tableau de bord freelance
    }

    @GetMapping("/client")
    public String showClientDashboard(Model model) {
        // Ajouter les données spécifiques au client connecté
        model.addAttribute("projects", new ArrayList<>()); // Projets en cours
        model.addAttribute("messages", new ArrayList<>()); // Messages récents
        return "client_dashboard"; // Page JSP du tableau de bord client
    }
}
