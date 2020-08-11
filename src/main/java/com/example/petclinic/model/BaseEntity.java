package com.example.petclinic.model;

import java.io.Serializable;

/**
 * @author Tocka Ayman
 * @date 8/11/20
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
