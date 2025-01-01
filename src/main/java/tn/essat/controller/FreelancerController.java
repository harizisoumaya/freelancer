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
import tn.essat.model.Proposal;
import tn.essat.model.User;

@Controller
@RequestMapping("/freelancer")
public class FreelancerController {

    @GetMapping("/register")
    public String showFreelancerRegistrationPage(Model model) {
        model.addAttribute("freelancer", new User()); // Le rôle sera "freelancer"
        return "inscription_freelancer";
    }

    @PostMapping("/register")
    public String registerFreelancer(@ModelAttribute("freelancer") User freelancer) {
        freelancer.setRole("freelancer");
        // Sauvegarder le freelance
        return "redirect:/home";
    }

    @GetMapping("/projects")
    public String listAvailableProjects(Model model) {
        // Récupérer les projets disponibles pour les freelances
        List<Project> projects = new ArrayList<>(); // Remplacer par DAO/service
        model.addAttribute("projects", projects);
        return "projets_freelancers"; // Page JSP pour afficher les projets
    }

    @PostMapping("/propose")
    public String makeProposal(@ModelAttribute("proposal") Proposal proposal) {
        // Sauvegarder la proposition pour le projet
        return "redirect:/freelancer/projects";
    }
}
