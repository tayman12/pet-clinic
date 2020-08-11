package com.example.petclinic.models;

import java.time.Instant;

/**
 * @author Tocka Ayman
 * @date 8/1/20
 */
public class Pet extends BaseEntity {

    private PetType type;
    private Owner owner;
    private Instant birthDate;

    public PetType getType() {
        return type;
    }

    public void setType(PetType type) {
        this.type = type;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Instant getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Instant birthDate) {
        this.birthDate = birthDate;
    }
}
