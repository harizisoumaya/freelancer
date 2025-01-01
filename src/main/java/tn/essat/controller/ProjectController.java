package tn.essat.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import tn.essat.model.Project;

@Controller
@RequestMapping("/project")
public class ProjectController {

    @GetMapping("/list")
    public String listProjects(Model model) {
        // Ajouter les projets dans le modèle
        model.addAttribute("projects", new ArrayList<>()); // Remplacer par un vrai DAO
        return "projets_clients";
    }

    @GetMapping("/add")
    public String showAddProjectPage() {
        return "add_profil";
    }

    @PostMapping("/add")
    public String addProject(@ModelAttribute("project") Project project) {
        // Sauvegarder le projet
        return "redirect:/project/list";
    }
}
