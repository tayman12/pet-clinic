package com.example.petclinic.services;

import com.example.petclinic.models.Owner;

/**
 * @author Tocka Ayman
 * @date 8/10/20
 */
public interface OwnerService extends CrudService {

    Owner findByLastName(String lastName);
}
