package com.example.petclinic.services;

import com.example.petclinic.model.Owner;

import java.util.Set;

/**
 * @author Tocka Ayman
 * @date 8/10/20
 */
public interface OwnerService {

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
