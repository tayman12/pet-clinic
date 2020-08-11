package com.example.petclinic.services;

import java.util.Set;

/**
 * @author Tocka Ayman
 * @date 8/11/20
 */
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
