package com.example.petclinic.services;

import com.example.petclinic.model.Pet;
import com.example.petclinic.model.Vet;

import java.util.Set;

/**
 * @author Tocka Ayman
 * @date 8/10/20
 */
public interface PetService {
    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
