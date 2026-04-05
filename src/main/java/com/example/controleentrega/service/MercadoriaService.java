package com.example.controleentrega.service;

import com.example.controleentrega.model.Mercadoria;
import com.example.controleentrega.repository.MercadoriaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MercadoriaService {

    private final MercadoriaRepository mercadoriaRepository;

    public MercadoriaService(MercadoriaRepository mercadoriaRepository) {
        this.mercadoriaRepository = mercadoriaRepository;
    }

    public Mercadoria salvar(Mercadoria mercadoria) {
        return mercadoriaRepository.save(mercadoria);
    }

    public List<Mercadoria> listarTodas() {
        return mercadoriaRepository.findAll();
    }
}