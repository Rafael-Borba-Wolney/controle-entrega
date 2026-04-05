package com.example.controleentrega.controller;

import com.example.controleentrega.model.Endereco;
import com.example.controleentrega.model.Mercadoria;
import com.example.controleentrega.service.EnderecoService;
import com.example.controleentrega.service.MercadoriaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MercadoriaController {

    private final MercadoriaService mercadoriaService;
    private final EnderecoService enderecoService;

    public MercadoriaController(MercadoriaService mercadoriaService, EnderecoService enderecoService) {
        this.mercadoriaService = mercadoriaService;
        this.enderecoService = enderecoService;
    }

    @GetMapping("/mercadorias")
    public String listarMercadorias(Model model) {
        model.addAttribute("mercadorias", mercadoriaService.listarTodas());
        return "mercadorias-lista";
    }

    @GetMapping("/mercadorias/nova")
    public String novaMercadoria(Model model) {
        model.addAttribute("mercadoria", new Mercadoria());
        model.addAttribute("enderecos", enderecoService.listarTodos());
        return "mercadorias-form";
    }

    @PostMapping("/mercadorias/salvar")
    public String salvarMercadoria(@ModelAttribute Mercadoria mercadoria,
                                   @RequestParam("enderecoId") Long enderecoId) {

        Endereco endereco = enderecoService.buscarPorId(enderecoId);
        mercadoria.setEndereco(endereco);
        mercadoriaService.salvar(mercadoria);

        return "redirect:/mercadorias";
    }
}