package com.example.controleentrega.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    private static final String USUARIO = "admin";
    private static final String SENHA = "12345678";

    @GetMapping("/")
    public String abrirLogin(HttpSession session) {
        Object usuarioLogado = session.getAttribute("usuarioLogado");

        if (usuarioLogado != null) {
            return "redirect:/dashboard";
        }

        return "login";
    }

    @PostMapping("/login")
    public String fazerLogin(@RequestParam String usuario,
                             @RequestParam String senha,
                             Model model,
                             HttpSession session) {

        if (USUARIO.equals(usuario) && SENHA.equals(senha)) {
            session.setAttribute("usuarioLogado", usuario);
            return "redirect:/dashboard";
        }

        model.addAttribute("erro", "Usuário ou senha inválidos.");
        return "login";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }
}