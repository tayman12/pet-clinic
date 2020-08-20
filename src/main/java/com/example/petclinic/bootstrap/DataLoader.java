package com.example.petclinic.bootstrap;

import com.example.petclinic.models.Owner;
import com.example.petclinic.models.Vet;
import com.example.petclinic.services.OwnerService;
import com.example.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author Tocka Ayman
 * @date 8/17/20
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        loadOwners();
        loadVets();

        System.out.println("owners count = " + ownerService.findAll().size());
        System.out.println("vets count = " + vetService.findAll().size());
    }

    public void loadOwners() {
        if (!ownerService.existsById(1L)) {
            Owner owner = new Owner();

            owner.setId(123L);
            owner.setFirstName("Radwa");
            owner.setLastName("Ayman");

            ownerService.save(owner);
        }

        if (!ownerService.existsById(2L)) {
            Owner owner = new Owner();

            owner.setId(2L);
            owner.setFirstName("Hossam");
            owner.setLastName("Hassan");

            ownerService.save(owner);
        }
    }

    public void loadVets() {
        if (!vetService.existsById(1L)) {
            Vet vet = new Vet();

            vet.setId(1L);
            vet.setFirstName("Mohamed");
            vet.setLastName("Gamal");

            vetService.save(vet);
        }

        if (!vetService.existsById(2L)) {
            Vet vet = new Vet();

            vet.setId(2L);
            vet.setFirstName("Ahmed");
            vet.setLastName("Ramy");

            vetService.save(vet);
        }
    }
}
