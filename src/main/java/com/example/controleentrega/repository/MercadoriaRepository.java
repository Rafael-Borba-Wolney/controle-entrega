package com.example.controleentrega.repository;

import com.example.controleentrega.model.Mercadoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MercadoriaRepository extends JpaRepository<Mercadoria, Long> {
}