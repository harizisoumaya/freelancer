package tn.essat.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import tn.essat.model.User;

@Controller
@RequestMapping("/auth")
public class AuthController {

    @GetMapping("/login")
    public String showLoginPage() {
        return "connexion"; // Page JSP pour la connexion
    }

    @PostMapping("/login")
    public String loginUser(@RequestParam("username") String username,
                            @RequestParam("password") String password,
                            HttpSession session) {
        // Vérifier les informations d'identification via DAO/service
        User user = new User(); // Remplacer par une recherche réelle
        if (user != null) {
            session.setAttribute("user", user);
            return "redirect:/dashboard/" + user.getRole();
        }
        return "redirect:/auth/login?error=true";
    }

    @GetMapping("/logout")
    public String logoutUser(HttpSession session) {
        session.invalidate();
        return "redirect:/home";
    }
}
