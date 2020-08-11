package com.example.petclinic.services;

import com.example.petclinic.model.Owner;
import com.example.petclinic.model.Vet;

import java.util.Set;

/**
 * @author Tocka Ayman
 * @date 8/10/20
 */
public interface VetService {
    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
