package tn.essat.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import tn.essat.model.Profil;

@Controller
@RequestMapping("/profil")
public class ProfilController {

    @GetMapping("/add")
    public String showAddProfilPage(Model model) {
        model.addAttribute("profil", new Profil());
        return "add_profil"; // Page JSP pour ajouter un profil
    }

    @PostMapping("/add")
    public String addProfil(@ModelAttribute("profil") Profil profil) {
        // Appeler le service pour sauvegarder le profil
        return "redirect:/profil/list";
    }

    @GetMapping("/list")
    public String listProfils(Model model) {
        // Récupérer les profils des freelances via le service ou DAO
        List<Profil> profils = new ArrayList<>(); // Remplacer par les données réelles
        model.addAttribute("profils", profils);
        return "profil"; // Page JSP qui affiche les profils
    }
}
