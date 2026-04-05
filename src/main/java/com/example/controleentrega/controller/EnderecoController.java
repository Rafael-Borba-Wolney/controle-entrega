package com.example.controleentrega.controller;

import com.example.controleentrega.model.Endereco;
import com.example.controleentrega.service.EnderecoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EnderecoController {

    private final EnderecoService enderecoService;

    public EnderecoController(EnderecoService enderecoService) {
        this.enderecoService = enderecoService;
    }

    @GetMapping("/enderecos")
    public String listarEnderecos(Model model) {
        model.addAttribute("enderecos", enderecoService.listarTodos());
        return "enderecos-lista";
    }

    @GetMapping("/enderecos/novo")
    public String novoEndereco(Model model) {
        model.addAttribute("endereco", new Endereco());
        return "enderecos-form";
    }

    @PostMapping("/enderecos/salvar")
    public String salvarEndereco(@ModelAttribute Endereco endereco) {
        enderecoService.salvar(endereco);
        return "redirect:/enderecos";
    }
}