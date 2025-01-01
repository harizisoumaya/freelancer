package tn.essat.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import tn.essat.model.Message;

@Controller
@RequestMapping("/message")
public class MessageController {

    @GetMapping("/inbox")
    public String showInbox(Model model) {
        // Récupérer les messages reçus pour l'utilisateur connecté
        List<Message> messages = new ArrayList<>(); // Remplacer par DAO/service
        model.addAttribute("messages", messages);
        return "messages_inbox"; // Page JSP qui affiche les messages reçus
    }

    @GetMapping("/send")
    public String showSendMessagePage(Model model) {
        model.addAttribute("message", new Message());
        return "send_message"; // Page JSP pour envoyer un message
    }

    @PostMapping("/send")
    public String sendMessage(@ModelAttribute("message") Message message) {
        // Sauvegarder le message
        return "redirect:/message/inbox";
    }
}
