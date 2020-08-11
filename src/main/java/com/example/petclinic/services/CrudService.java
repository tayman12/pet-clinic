package com.example.petclinic.services;

import com.example.petclinic.model.BaseEntity;

import java.util.Set;

/**
 * @author Tocka Ayman
 * @date 8/11/20
 */
public interface CrudService {

    Set<BaseEntity> findAll();

    BaseEntity findById(Long id);

    BaseEntity save(BaseEntity object);

    void delete(BaseEntity object);

    void deleteById(Long id);
}
