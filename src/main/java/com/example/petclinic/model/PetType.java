package com.example.petclinic.model;

/**
 * @author Tocka Ayman
 * @date 8/1/20
 */
public class PetType extends BaseEntity {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
